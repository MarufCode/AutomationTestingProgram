package src.oops_concept;


import java.util.Scanner;

public class Lab123 {
 public static void main (String[] maruf) {

    try {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of a");
       int a = sc.nextInt();
       System.out.println("Enter the value of b");
       int b = sc.nextInt();

       a = a * b;
       b = a / b;
       a = a / b;


       System.out.println("Value of a is :::" + a);
       System.out.println("Value of b is :::" + b);


    } catch (Exception e) {
       System.out.println("Not possible with 0");
    }
 }

}

