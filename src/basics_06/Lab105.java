package src.basics_06;


import java.util.Scanner;

public class Lab105 {
    public static void main(String[] args) {


        // Take input user Marks of 5 subjects and Print the marks
        Scanner sc = new Scanner(System.in);
        float [] marks = new float[5];

        System.out.println("Enter the first sub marks");
        marks[0] = sc.nextFloat();
        System.out.println("Enter the second sub marks");
        marks[1] = sc.nextFloat();
        System.out.println("Enter the third sub marks");
        marks[2] = sc.nextFloat();
        System.out.println("Enter the fourth sub marks");
        marks[3] = sc.nextFloat();
        System.out.println("Enter the fifth sub marks");
        marks[4] = sc.nextFloat();

        for (int i = 0; i< marks.length; i++){
            if (marks[i] < 30){

                System.out.println("You are failed in this subject" + marks);
            }
            System.out.println(marks[i]);
        }

        sc.close();


    }
}
