package src.basics_05;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab069 {
    public static void main(String[] args) {


        // Take a user input and print the information


        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = user_input.next();

        System.out.println("Enter your age");
        int age = user_input.nextInt();

        System.out.println("Enter your salary");
        Double salary = user_input.nextDouble();

        System.out.println("Enter your name" + " "+ name);
        System.out.println("Enter your age" + " " +  age);
        System.out.println("Enter your salary" + " " + salary);


        user_input.close();

    }
}
