package src.oops_concept_01_07;


public class Person {

String name;

    Person(){
        System.out.println("DC");
    }


    Person(String ref_name){
        this.name = ref_name;

    }

    void printDetails(){
        System.out.println("Your name is " + this.name);
    }










}

