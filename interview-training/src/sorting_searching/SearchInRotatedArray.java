package sorting_searching;

public class SearchInRotatedArray {

   public static int search(int a[], int left, int right, int x) {
        int mid = (left + right) / 2;
        if (x == a[mid]) {
            return mid;
        }
        if (right < left) {
            return -1;
        }
        if (a[left] < a[mid]) {
            if (x >= a[left] && x < a[mid]) {
                return search(a, left, mid - 1, x);
            } else {
                return search(a, mid + 1, right, x);
            }
        } else if (a[mid] < a[left]) {
            if (x > a[mid] && x <= a[right]) {
                return search(a, mid + 1, right, x);
            } else {
                return search(a, left, mid - 1, x);
            }
        } else if (a[left] == a[mid]) {
            if (a[mid] != a[right]) {
                return search(a, mid + 1, right, x);
            } else {
                int result = search(a, left, mid - 1, x);
                if (result == -1) {
                    return search(a, mid + 1, right, x);
                } else {
                    return result;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] a = {6,2,4,4,6,6,7};
        int length = a.length;
        int key = 6;
        System.out.println(search(a,0,length-1,key));
    }
}
