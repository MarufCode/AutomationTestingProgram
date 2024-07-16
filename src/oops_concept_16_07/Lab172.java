package src.oops_concept_16_07;

public class Lab172 {
    public static void main(String[] args) {

        main("Maruf");
    }

    static void main (String a){
        if(a.equalsIgnoreCase("a")){
            throw new ArithmeticException();
        }
    }
}
