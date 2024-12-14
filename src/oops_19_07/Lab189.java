package src.oops_19_07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Lab189 {
    public static void main(String[] args) {

        List<Integer> myMarks = new ArrayList<>();
        myMarks.add(91);
        myMarks.add(87);
        myMarks.add(80);
        Collections.sort(myMarks);
        System.out.println(myMarks);


        Student student = new Student(1,"Maruf");
        Student student2 = new Student(10,"Sherikar");
        Student student3 = new Student(3,"MAruf");


        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student2);
        students.add(student3);
        System.out.println(students);

        Collections.sort(students);
        System.out.println(students);

    }
}
