package src.JavaPrograms;

public class DigitExract {
    public static void main(String[] args) {
        String x = "INDIA 75";
        String y = "";

        for (int i = 0; i<x.length(); i++){
            if (Character.isDigit(x.charAt(i))){
                y = y + x.charAt(i);
            }
        }

        System.out.println(y);


    }
}
