package src.oops_concept_11_07;

public class StaticDemo {


    // Static variable
    public static String college_name = "TheTestingAcademy";

    // Non static variable -> Local variable or Instance variable
    public int version = 3;


    // Static method
    public static void printName() {
        int age  = 10;
        System.out.println("Name is :" + college_name);
          // You can't have an Instance variable into the Static Method!!
//        System.out.println("Name is :" + version);

    }

    // Non static method
    public void printVersion() {
        int age = 20;
        System.out.println("Name is :" + version);
        System.out.println("Name is :" + college_name);
    }







}
