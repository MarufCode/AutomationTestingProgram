package src.oops_concept_11_07;

public class Lab150 {
    public static void main(String[] args) {


        System.out.println(StaticDemo.college_name);
        StaticDemo.printName();


        StaticDemo s1 = new StaticDemo();
        s1.version = 99;
        s1.printVersion();

        StaticDemo.college_name= "TTA";

        StaticDemo s2 = new StaticDemo();
        s2.version = 199;
        s2.printVersion();



//        Lab150.main();




    }
}
