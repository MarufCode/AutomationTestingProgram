package src.basics_04;

import java.util.Scanner;

public class Lab050 {
    public static void main(String[] args) {



//        IF else
        // Yes , No

//        if(true){
//            System.out.println("Only If");
//        }
//        else{
//            System.out.println("False");
//        }


        // If, else if , else

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number > 20){
            System.out.println("Number is > 20");
        }else if (number > 10){
            System.out.println("Number is > 10");
        }else {

            System.out.println("Number is < 20");
        }



    }
}
