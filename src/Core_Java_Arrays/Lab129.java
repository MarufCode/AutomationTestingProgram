package src.Core_Java_Arrays;


public class Lab129 {
 public static void main (String[] maruf) {

    String name = "Maruf";
    String rev = "";

    for (int i = name.length()-1; i >= 0; i--){
        rev = rev + name.charAt((i));
    }
     System.out.println( "This is the reverse string");
     System.out.println( rev);
   }

}

