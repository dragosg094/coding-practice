package arrays;

import java.util.Arrays;

public class CheckPermutation {

    public static boolean checkPermutation(String str1, String str2) {
        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();
        Arrays.sort(str1Array);
        Arrays.sort(str2Array);
        if (str1Array.length != str2Array.length) {
            return false;
        }
        str1 = Arrays.toString(str1Array);
        str2 = Arrays.toString(str2Array);
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        String str1 = "dog";
        String str2 = "god";
        System.out.println(checkPermutation(str1, str2));

        String str3 = "dogs";
        String str4 = "god";
        System.out.println(checkPermutation(str3, str4));
    }
}
