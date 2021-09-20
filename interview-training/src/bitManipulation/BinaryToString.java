package bitManipulation;

public class BinaryToString {

    public String printBinary(double number){
        if(number>=1 || number<=0){
            return "ERROR";
        }
        StringBuilder binary = new StringBuilder();
        binary.append(".");
        while(number>0){
            if(binary.length() >= 32){
                return "ERROR";
            }
            double r = number *2;
            if(r>=1){
                binary.append(1);
                number=r-1;
            }else{
                binary.append(0);
                number=r;
            }
        }
        return binary.toString();
    }
}
