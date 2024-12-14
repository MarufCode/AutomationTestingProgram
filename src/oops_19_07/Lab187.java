package src.oops_19_07;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab187 {
    public static void main(String[] args) {

                List<String> Profie = new ArrayList<>();
                Profie.add("MAruf");
                Profie.add("Sherikar");
                Profie.add("7");
                Collections.sort(Profie);
                System.out.println(Profie);

        System.out.println("------");


        List<Integer> myMarks = new ArrayList<>();
        myMarks.add(85);
        myMarks.add(86);
        myMarks.add(80);
        Collections.sort(myMarks);
        System.out.println(myMarks);



        }
}
