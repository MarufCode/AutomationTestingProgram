package src.oops_concept_01_07;

import java.util.Scanner;

public class Lab145 {

 public static void main (String[] args) {

//     Person p = new Person();

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Your Name");
     String name = sc.next();


     Person p2 = new Person(name);
     p2.printDetails();

     System.out.println("Enter the Second Name");
     String name2 = sc.next();

//     Person p3 = new Person("Vicky");
//     p3.printDetails();
//
//     Person p4 = new Person("NAsir");
//     p4.printDetails();





 }
}

