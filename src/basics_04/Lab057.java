package src.basics_04;
import java.util.Scanner;


public class Lab057 {
    public static void main(String[] args) {

       Scanner sc =  new Scanner(System.in);
        System.out.println("Enter browser name chrome, firefox, edge, opera");

        String browser = sc.nextLine();

        switch (browser.toLowerCase()){
            case "chrome":
                System.out.println("Execute the chrome code");
                break;

            case "firefox":
                System.out.println("Execute the firefox code");
                break;

            case "edge":
                System.out.println("Execute the edge code");
                break;

            case "opera":
                System.out.println("Execute the opera code");
                break;

            default:
                System.out.println("I have no idea which browser is this");
        }


    }
}
