package src.oops_concept_16_07;

public class customException extends Exception {

        public customException(String msg){
            super(msg);
            System.out.println("If I got this, Custom Exp");
    }
}
