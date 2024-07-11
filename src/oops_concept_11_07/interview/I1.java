package src.oops_concept_11_07.interview;

import src.oops_concept_04_07.abstraction.example2.Maruf;

public class I1 {
    public static void main(String[] args) {
        System.out.println(H.a);
        Maruf p = new Maruf();
//        p.m1();



    }
}




interface H{
    // Only Static variables

    int a =10;
    public static final int b = 20;
    public static final int c  =99;
    void m1(); // This is non static
}

//class Maruf implements H {
//
//    @Override
//    public void m1() {
//
//    }
//}
