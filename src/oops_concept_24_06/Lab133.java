package src.oops_concept_24_06;


public class Lab133 {
 public static void main (String[] args) {
    // Immutable in Nature -> That can not be changed
     String s1 = "Maruf";
     String s2 = new String("Maruf");

     // Mutable in Nature -> That can be changed
     StringBuilder sb3 = new StringBuilder("MAruf");
     sb3.append(" Sherikar");
     System.out.println(sb3);

     StringBuilder sbuf4 = new StringBuilder("MAruf");
     sbuf4.append(" Sherikar");
     System.out.println(sbuf4);



 }
}

