package src.oops_concept_04_07.poly.methodoverriding;

public class IV4 {
    public static void main(String[] args) {

        //System.out.println(P04.a);
        System.out.println(P04.b);
        P04.run2();
        System.out.println();
        //System.out.println(P04.run());
    }
}


class P04 {
    int a;
    static int b;

    static void run2(){
        System.out.println("Hahah");
    }

    void run(){
    }
}
