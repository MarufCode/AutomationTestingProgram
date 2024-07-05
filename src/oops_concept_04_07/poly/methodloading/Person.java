package src.oops_concept_04_07.poly.methodloading;

public class Person {

    // Method OverLoading -> multiple methods with same name, but different argument.

    void Gift(String a){
        System.out.println("A is a string " + a);
    }

    void Gift (int x){
        System.out.println("X is int " + x);
    }

//    int Gift(float x){
//        System.out.println("X is a Int" +  x);
//        return 89;
//    }

    void Gift(double x){
        System.out.println("X is a double" +  x);
    }

}
