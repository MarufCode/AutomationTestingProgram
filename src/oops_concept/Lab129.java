package src.oops_concept;


public class Lab129 {
 public static void main (String[] maruf) {

    String name = "MAruf";
    String rev = "";

    for (int i = name.length()-1; i >= 0; i--){
        rev = rev + name.charAt((i));
    }
     System.out.println( "This is the reverse string" +" " + rev);
   }

}

