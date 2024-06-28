package src.oops_concept_24_06;


import java.util.Scanner;

public class Lab137 {
 public static void main (String[] args) {

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a string and i will check for palindrome");

     String userInput = sc.next();

//     userInput = userInput.toLowerCase();
     boolean result = isPalindrome(userInput);

     if (result){
         System.out.println("Palindrome");
     }else{

         System.out.println("Not Palindrome");
     }
 }

    private static boolean isPalindrome(String userInput) {

        String original_str = userInput; //Pramod , naman
        StringBuilder sb = new StringBuilder(userInput);
        String reverse_string = sb.reverse().toString();
        return original_str.equalsIgnoreCase(reverse_string);


}
}

