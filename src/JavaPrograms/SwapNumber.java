package src.JavaPrograms;

public class SwapNumber {

    public static void main(String[] args) {


        // Without a third variable

                int a = 5;
                int b = 10;

                a = a + b;
                b = a - b;
                a = a - b;

        System.out.println("After swapping : a = " + a + ", b = " + b);



    }
}
