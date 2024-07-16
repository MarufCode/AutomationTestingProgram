package src.oops_concept_11_07.exceptions;

public class Lab169 {

    // Thorws and customeExcpetipon// Learn in the NExt Class



    public static void main(String[] args) {
        extracted2();
        System.out.println("Main executed");
    }
    public static void extracted2(){
        extracted1();
        System.out.println("Extracted 2 will be executed");
    }
    public static void extracted1(){
        extracted();
        System.out.println("Extracted 1 will be execute");
    }


    public static void extracted(){
        try {
            String name = null;
            name.length();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
