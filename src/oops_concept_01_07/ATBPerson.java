package src.oops_concept_01_07;


public class ATBPerson {

String name; //  instance  variable values are default

long phone;

String email;

boolean is_married;

//Defalt Constructor
ATBPerson(){
    name = "MAruf";
    System.out.println("I am called!!!!!!!!!");
}

    ATBPerson(String valuefromObjectRef){
        this.name = valuefromObjectRef;
    }

void talk(){
    System.out.println("Talk");
}

    void printdetails(){
        System.out.println(name);
        System.out.println(phone);
        System.out.println(email);
        System.out.println(phone);
        System.out.println(is_married);
    }
}

