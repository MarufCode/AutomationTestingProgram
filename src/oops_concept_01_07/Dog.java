package src.oops_concept_01_07;


public class Dog {

    String name;

    Dog(){
        System.out.println("Default Cons");
    }

    Dog(String nameRef){
        this.name = nameRef;
        System.out.println("Parametrized Constructor");
    }
    void bark(){
        int a = 10; // Local Variable
        System.out.println("Bark");
        System.out.println("Dog name is" + this.name);

    }





}

