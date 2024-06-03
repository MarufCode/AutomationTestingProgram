package src.basics_04;
import java.util.Scanner;


public class Lab058 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char and i will tell if it is a vowel or not");

        char user_input = sc.next().toCharArray()[0];
        System.out.println("user_input");

        switch (user_input){
            case 'a':
                System.out.println("Vowel");
                break;

            case 'e':
                System.out.println("Vowel");
                break;

            case 'i':
                System.out.println("Vowel");
                break;

            case 'o':
                System.out.println("Vowel");
                break;

            case 'u':
                System.out.println("Vowel");
                break;

            default:
                System.out.println("Not a vowel it is a consonant");
        }




    }
}
