package src.basics_03;

import java.util.Scanner;

public class Lab048 {
    public static void main(String[] args) {

        // Take two input from user and give maximum out of two number

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the a and b");

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Max" + " " + a);
        } else {
            System.out.println("Max" + " " + b);

        }
    }
}

