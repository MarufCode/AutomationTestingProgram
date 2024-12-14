package src.oops_19_07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab183 {

    public static void main(String[] args) {

        List<String> courseList = new ArrayList<>();
        courseList.add("AT");
        courseList.add("MT");
        courseList.add("Python Automation");
        courseList.add("API Testing");
        courseList.add("API Automation");
        courseList.add("SDET");

        List numList = new ArrayList();
        numList.add(100);
        numList.add(200);
        numList.add(300);
        numList.add(100);

        courseList.addAll(numList);
        System.out.println(courseList);

        Iterator iterator = courseList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

//        Iterator iterator1 = numList.iterator();
//        while (iterator1.hasNext()){
//            System.out.println(iterator1.next());
//        }


    }
}
