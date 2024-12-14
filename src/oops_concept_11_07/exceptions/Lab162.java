package src.oops_concept_11_07.exceptions;

public class Lab162 {
    public static void main(String[] args) {

        try {
            String name = null;
            name.trim(); // 100GB used! stackovererror
            System.out.println("I am MAruf");
        } catch (Exception e){
            System.out.println("You are trying to trim a null string that is not possible in Java");
        }

        System.out.println(" Hi I am the End");


    }

}


// Exception -?>
//  event that occurs during the execution of a program
//  that disrupts the normal flow of instructions.