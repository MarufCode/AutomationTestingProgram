package src.oops_concept_24_06.basics;


public class Lab132 {
 public static void main (String[] args) {

     String s1 = "Maruf";
     String s2 = new String("Maruf");
     String s3 = new String("maruf");
     System.out.println(s1 == s2);
     System.out.println(s1.equals(s2));
     System.out.println(s1.equalsIgnoreCase(s3));


 }
}

