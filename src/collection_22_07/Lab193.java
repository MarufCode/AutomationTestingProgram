package src.collection_22_07;

import java.util.TreeSet;

public class Lab193 {
    public static void main(String[] args) {

        TreeSet numSet = new TreeSet();
        numSet.add(50);
        numSet.add(20);
        numSet.add(10);
        numSet.add(80);
        numSet.add(60);
        numSet.add(70);
        numSet.add(30);
        numSet.add(40);
        System.out.println(numSet);
        for (int i = 0; i>numSet.size(); i++){
            System.out.println(numSet);
        }
    }
}
