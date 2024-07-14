package src.oops_concept_11_07.innerclass;

public class Lab156 {
    public static void main(String[] args) {

        Thread t=  new Thread(){
            @Override
            public void run(){
                System.out.println("I am a THREAD!");
            }
        };
        t.run();


    }
}
