package src.oops_concept_24_06.basics;


public class Lab131 {
 public static void main (String[] maruf) {

     String name = "Maruf"; // String in constant pool
     System.out.println(name.concat("Sherikar"));
     System.out.println(name.contains("M"));

     System.out.println(name);


     String name2  = new String("Sherikar");

     String expected_result  = "password@123";
     String actual_result  = "Password@123";
     if(expected_result.equalsIgnoreCase(actual_result)){
         System.out.println("Yes");
     }






 }

}

