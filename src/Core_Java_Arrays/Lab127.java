package src.Core_Java_Arrays;


import java.util.Scanner;

public class Lab127 {
 public static void main (String[] maruf) {

    // Prime Number Condition num%i(i -> 2 to num) == 0 -> x
     //  0 -> X
     // 1 -> X
     // 2 -> prime?
     // 3 -> ?
     // 4 -> ?

     int i = 0;
     int flag = 0;
     int m = 0;

     Scanner sc = new Scanner(System.in);
     System.out.println("Enetr your number");
     int n = sc.nextInt();

     m = n / 2;
     if(n==0 || n== 1){
         System.out.println("Not a prime number" + n);
     }else{
         for (i = 2; i<=m; i++){
             if (n % i == 0){
                 System.out.println("Not a prime number"+ n);
                 flag = 1;
                 break;

             }
         }
     }
     if (flag == 0){
         System.out.println("Prime number" + n);
     }

   }

}

