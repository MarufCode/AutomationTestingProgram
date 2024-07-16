package src.oops_concept_16_07;

public class Lab170 {
    public static void main(String[] args) throws Exception {

        extracted(0);
        throw new Exception("hello");
    }

    private static void extracted(int b) {
        int a;
        if (b == 0) {
//            throw new ArithmeticException("B can't be zero");
            throw new ArithmeticException("Hello B can't be zero");
        } else {
            a = 10 / b;
        }
        System.out.println(a);
        try {
            int a1 = 10 / b;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
