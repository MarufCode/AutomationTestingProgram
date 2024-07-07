package src.Core_Java_Arrays;


import java.util.Scanner;

public class Lab122 {
 public static void main (String[] maruf){

    // Swapping two numbers without using third/ temp variable

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a");
    int a = sc.nextInt();
    System.out.println("Enter the value of b");
    int b = sc.nextInt();

    a = a + b;
    b = a - b;
    a = a- b;


    System.out.println("Value of a is :::" + a);
    System.out.println("Value of b is :::" + b);





    }

}

