package arrays;

public class URLify {

    public static char[] urlify(char[] str) {
       int spaceCount=0;
       int strLength = str.length;
        for(int i=0; i<strLength;i++){
            if(str[i]==' '){
               spaceCount++;
            }
        }
        while(str[strLength-1] == ' '){
            spaceCount--;
            strLength--;
        }
        int newLength = spaceCount*2 +strLength;
        char [] oldArray = str;
        str = new char[newLength];

        int index = newLength -1;

        for(int j = strLength-1; j>=0; j--){
            if(oldArray[j] == ' '){
                str[index] = '%';
                str[index -1] = '0';
                str[index -2] = '2';
                index -=3;
            }else{
                str[index] = oldArray[j];
                index--;
            }
        }
        return str;
    }

    public static void main(String[] args) {
        char[] str = "Mr John Smith   ".toCharArray();

        // Prints the replaced string
        str = urlify(str);

        for (int i = 0; i < str.length; i++)
            System.out.print(str[i]);
    }
}


