package arrays;

import java.util.HashMap;
import java.util.Map;

public class StringCompresion {

    public static String compressString(String str) {
        char[] currentStringArray = str.toLowerCase().toCharArray();
        int count = 1;
        String newString ="";
        int length = currentStringArray.length;
        for (int i = 1; i < currentStringArray.length-1; i++) {
            if (currentStringArray[i - 1] == currentStringArray[i]) {
                count++;
            } else {
                newString += ""+currentStringArray[i - 1] + count;
                count=1;
            }
        }
        if(currentStringArray[length-1]==currentStringArray[length-2]){
            count++;
        }else{
            newString  += ""+currentStringArray[length - 2] + count;
            count =1;
        }
        newString  += ""+currentStringArray[length - 1] + count;
        return newString;
    }

    public static void main(String[] args) {
        String str = "aaabbccmmmdddddaaaarr";
        System.out.println(compressString(str));
    }

}
