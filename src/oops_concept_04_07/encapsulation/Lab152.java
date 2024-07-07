package src.oops_concept_04_07.encapsulation;

public class Lab152 {
    public static void main(String[] args) {

        ICICIBank i = new ICICIBank("maruf", 100);

        i.setBal(-1);
        i.setName("MahiBhai"); //Fine
    }
}
