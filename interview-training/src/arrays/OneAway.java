package arrays;

import java.util.HashSet;
import java.util.Set;

public class OneAway {
    public static boolean oneAway(String str1, String str2){
       return oneReplaceAway(str1,str2)||
        oneInsertOrRemoveAway(str1,str2);
    }


    private static boolean oneInsertOrRemoveAway(String str1, String str2) {
        if(str1.length() == str2.length() || Math.abs(str1.length()-str2.length())>1){
            return false;
        }
        Set <Character> set = new HashSet<>();
        char [] largerArray =str1.length()>str2.length()? str1.toCharArray(): str2.toCharArray();
        char [] smallerArray= str1.length()<str2.length()? str1.toCharArray(): str2.toCharArray();
        for(char ch : largerArray){
            set.add(ch);
        }
        for(char ch : smallerArray) {
            if (!set.contains(ch)) {
                return false;
            }
        }
        return true;
    }

    private static boolean oneReplaceAway(String str1, String str2) {
        if(str1.length() != str2.length()){
            return false;
        }
        int count=0;
        Set <Character> set = new HashSet<>();

        for(char ch : str1.toCharArray()){
            set.add(ch);
        }
        for(char ch : str2.toCharArray()) {
            if (!set.contains(ch)) {
                count ++;
            }
            if(count >1){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String str1 ="pale";
        String str2 = "ple";
        System.out.println(oneAway(str1,str2));

        String str3 = "pale";
        String str4 = "bale";
        System.out.println(oneAway(str3,str4));

        String str5 = "pale";
        String str6 = "bsle";
        System.out.println(oneAway(str5,str6));

        String str7 = "ale";
        String str8 = "pale";
        System.out.println(oneAway(str7,str8));
    }

}
