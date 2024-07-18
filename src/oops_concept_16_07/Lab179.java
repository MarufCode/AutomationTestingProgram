package src.oops_concept_16_07;

import java.util.ArrayList;
import java.util.List;

public class Lab179 {

    public static void main(String[] args) {

//        List myList = new List();
        List myList = new ArrayList();
        myList.add("Maruf");
        myList.add("Sherikar");
        myList.add(123);
        myList.add(true);
        myList.add(false);

        System.out.println(myList);
        myList.set(1, "Tiger");
        System.out.println(myList);
        myList.add("Mahibhai");
        System.out.println(myList);
        myList.remove("Tiger");
        System.out.println(myList);

        for (int i = 0; i<myList.size(); i++){
            System.out.println(myList.get(i));
        }

        for (Object o :myList){
            System.out.println(o);
        }



    }
}
