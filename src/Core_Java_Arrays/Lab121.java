package src.Core_Java_Arrays;


import java.util.Scanner;

public class Lab121 {
 public static void main (String[] maruf){

// Swapping two numbers using third varaibles


//    int a = 10;
//    int b = 20;

    // b = 10 a = 20 tHat is what we will do


    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the a");
    int a = sc.nextInt();
    System.out.println("Enter the b");
    int b = sc.nextInt();

    int temp = a;
    a = b;
    b = temp;

    System.out.println("Value of a ->" + a);
    System.out.println("Value of b ->" + b);




    }

}

