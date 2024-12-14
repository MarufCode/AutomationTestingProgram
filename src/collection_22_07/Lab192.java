package src.collection_22_07;

import java.util.LinkedHashSet;
import java.util.Set;

public class Lab192 {
    public static void main(String[] args) {


        Set courseSets = new LinkedHashSet();
        courseSets.add("ATB");
        courseSets.add("MTB");
        courseSets.add("LAPIT");
        courseSets.add("SDET Blueprint");
        courseSets.add("Java for Testers");

        System.out.println(courseSets);
        for (int i = 0; i>courseSets.size(); i++){
            System.out.println(courseSets);
        }
    }
}
