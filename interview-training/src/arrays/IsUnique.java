package arrays;


import java.util.HashSet;

public class IsUnique {

    public static boolean isUniqueString(String str){
        if(str.length()>128 && str.length()==0){
            return false;
        }
        boolean [] saveChar = new boolean[128];
        for(int i=0; i< str.length(); i++){
            int val = str.charAt(i);
            if(saveChar[val]){
                return false;
            }
            saveChar[val] = true;
        }
        return true;
    }
    public static boolean isUniqueString2(String str){
        if(str.length()==0){
            return false;
        }
        HashSet <Character> set = new HashSet<>();
        for(int i=0; i< str.length(); i++){
            if(set.contains(str.charAt(i))){
                return false;
            }
            set.add(str.charAt(i));
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(isUniqueString("string"));
        System.out.println(isUniqueString2("character"));
    }
}
