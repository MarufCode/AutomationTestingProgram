package src.Core_Java_Arrays;


public class Lab112 {
    public static void main(String[] args) {


   int c = sum();
   int c1 = sum(3);
   int c2 = sum(3);
        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);

        sayHello(); // call to the function
    }


   static int sum (int x, int y) {
       return x + y;
   }
       static int sum (int x){
           return x ;


    }
    static int sum () {
        return 99;
    }

    static void sayHello(){
        System.out.println("Say Yes");
    }

}
