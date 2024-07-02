package src.oops_concept_01_07.inheritance;

public class Programming {

    int version;
    String author;

    Programming(){
        System.out.println("Programming Default Cons");
    }

    Programming (String author, int version){
        this.author = author;
        this.version = version;

    }

    void printInfo(){
        System.out.println("programming Info"  + "Version -> " + this.version + " Author -> " + this.author);
    }


    void car(){
        System.out.println("Audi");
    }

    void home(){
        System.out.println("3bhk");
    }













}
