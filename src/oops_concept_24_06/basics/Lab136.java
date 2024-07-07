package src.oops_concept_24_06.basics;


public class Lab136 {
 public static void main (String[] args) {

     // String Builder is not thread safe

     //String Buffer is Thread Safe

     StringBuilder stringBuilder = new StringBuilder("MAruf");
     stringBuilder.reverse();
     System.out.println(stringBuilder);




 }
}

