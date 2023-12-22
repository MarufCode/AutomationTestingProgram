package src.basics_03;

public class Lab027 {
    public static void main(String[] args) {

        //Casting - Mold

        byte b = 10;
        int a = b;
//        int a = (int) b;  //implicit Casting - JVM


        //
        int a1 = 300;
        //byte b1 = a1;  //Invalid

        byte b1 = (byte)a1;  //Explicit Casting
        System.out.println(b1);





    }
}
