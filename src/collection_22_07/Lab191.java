package src.collection_22_07;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;



public class Lab191 {
    public static void main(String[] args) {


        Set <String>courseSets = new HashSet();
        courseSets.add("ATB");
        courseSets.add("MTB");
        courseSets.add("LAPIT");
        courseSets.add("SDET Blueprint");
        courseSets.add("Java for Testers");

        System.out.println(courseSets);
        for (Object o : courseSets) {
            System.out.println(o);
        }

//        for (int i= 0; i<courseSets.size(); i++){
//            System.out.println(courseSets.get(i));
//        }


        Iterator it = courseSets.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
