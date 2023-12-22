package src.basics_03;

public class Lab033 {
    public static void main(String[] args) {
        String name =  "Automation Testing";
        String name1 =  "Automation Testing";
        String name2 =  new String("Automation testing");

//        System.out.println(name==name1);
//        System.out.println(name.equals(name1));

//        System.out.println(name == name2);
        System.out.println(name.equals(name2));
        System.out.println(name.equalsIgnoreCase(name2));


    }
}
