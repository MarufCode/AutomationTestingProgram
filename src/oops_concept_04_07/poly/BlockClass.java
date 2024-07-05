package src.oops_concept_04_07.poly;

public class BlockClass {

    { // Instance Initialization Block
        System.out.println("I am IIB");
    }

    BlockClass(){
        System.out.println("I am BlockClass DC");
    }

    static{ // SIB Static Initialization Block
        System.out.println(" I am SIB");
    }


}
