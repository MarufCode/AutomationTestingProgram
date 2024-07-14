package src.oops_concept_11_07.innerclass;

public class Lab157 {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am THREAD!!");
            }
        };
    }
}
