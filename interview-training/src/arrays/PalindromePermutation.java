package arrays;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation {

    public static boolean isPalindromePermutation(String str) {
        String newString = str.replaceAll("[\\s]", "").toLowerCase();
        char[] array = newString.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        int oddCount = 0;

        for (char ch : array) {
            int count =1;
            if (map.containsKey(ch)) {
                count = map.get(ch);
                count ++;
                map.put(ch, count);
            } else {
                map.put(ch, count);
            }
        }
        for (char ch : array) {
            if (map.get(ch) % 2 == 1) {
                oddCount++;
            }
        }
        return oddCount <= 1;
    }

    public static void main(String[] args) {
        String str = "abcbac" ;
        System.out.println(isPalindromePermutation(str));
        String str1 = "abcba" ;
        System.out.println(isPalindromePermutation(str1));
    }
}
