package src.oops_concept_16_07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab180 {
    public static void main(String[] args) {


        List <String> myList = new ArrayList();
        myList.add("Maruf");
        myList.add("Sherikar");
//        myList.add(123);
//        myList.add(true);
//        myList.add(false);

        System.out.println(myList);
        myList.set(1, "Tiger");
        System.out.println(myList);
        myList.remove("Tiger");
        System.out.println(myList);


        // for loop
        for (int i = 0; i<myList.size(); i++){
            System.out.println(myList.get(i));
        }
        System.out.println("---------------");

        // for each loop
        for (String o :myList){
            System.out.println(o);
        }
        System.out.println("----------");
        // Iterator
        Iterator iterator = myList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
