package src.basics_03;

public class Lab038 {
    public static void main(String[] args) {

        int a = 955;
        int b = 20000;
        int c = 100;

        int max = a > b ? ((a > c)? a : c) : ((b > c) ? b : c) ;
        System.out.println(max);



    }
}
