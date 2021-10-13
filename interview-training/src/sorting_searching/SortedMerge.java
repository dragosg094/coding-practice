package sorting_searching;

public class SortedMerge {

    public static int[] merge(int[] a, int[] b, int lastA, int lastB) {
        int[] merge = new int[lastA + lastB];
        int i = 0, j = 0, k = 0;
        while (i < lastA && j < lastB) {
            if (a[i] < b[j]) {
                merge[k++] = a[i++];
            } else {
                merge[k++] = b[j++];
            }
        }
        while (i < lastA) {
            merge[k++] = a[i++];
        }
        while (j < lastB) {
            merge[k++] = b[j++];
        }
        return merge;
    }

    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4};
        int[] b = {11, 13, 14};
        int lastA = a.length;
        int lastB = b.length;
        displayArray(merge(a, b, lastA, lastB));

    }
}
