package src.oops_concept_11_07.innerclass;

public class Lab154 {
    public static void main(String[] args) {

    Maruf.Ipad pi = new Maruf.Ipad();
    pi.eating();



}
}

// Class Members
class Maruf{
    int age  = 31; // Data Memebers / Instances Variables

    // Methods
    void eay(){
        System.out.println("I am eating");
    }

    static class Ipad{
        void eating(){
            System.out.println("I am IPAD");
            //System.out.println(age);
        }
    }




}
