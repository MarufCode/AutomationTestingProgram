package src.basics_06;


public class Lab099 {
    public static void main(String[] args) {

        int[]marks_10 = {96, 56, 85,75};
        System.out.println(marks_10.length);
        System.out.println(marks_10[0]);
        System.out.println(marks_10[1]);
        System.out.println(marks_10[2]);
        System.out.println(marks_10[3]);
//        System.out.println(marks_10[5]);


        int[] a= new int[4];

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);

        a[0] = 88;
        System.out.println(a[0]);

        a[1] = 89;
        a[0] = 89;
        System.out.println(a[0]);
//        System.out.println(a[5]);



        final  int[] b = new int [4];
        b[0] = 99;
        System.out.println(b[0]);

    }
}
