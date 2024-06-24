package src.oops_concept_24_06;


public class Lab136 {
 public static void main (String[] args) {

     // StringBuilder is not thread safe

     //StringBuffer is Thread Safe

     StringBuilder stringBuilder = new StringBuilder("MAruf");
     stringBuilder.reverse();
     System.out.println(stringBuilder);




 }
}

