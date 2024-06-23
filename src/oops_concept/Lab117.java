package src.oops_concept;


public class Lab117 {
    public static void main(String[] marufsherikar) {

        System.out.println("Rune fine");


        int d = main(10);
        System.out.println(d);
        main("maruf");

    }
    static void main(String a){
        System.out.println("I am a Main function but JVM doesn't recognize me and i dont need multiple main method");
    }
    static int main(int a) {
        return a + 101;
    }

}

