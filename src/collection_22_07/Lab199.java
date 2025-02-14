package src.collection_22_07;
import java.util.*;

public class Lab199 {
    public static void main(String[] args) {

        Hashtable<Integer, String> ht1 = new Hashtable<>();

        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");

        Enumeration<Integer> e = ht1.keys();

        // Iterating through the Hashtable
        // object

        // Checking for next element in Hashtable object
        // with the help of hasMoreElements() method
        while (e.hasMoreElements()) {

            // Getting the key of a particular entry
            int key = e.nextElement();

            // Print and display the Rank and Name
            System.out.println("Rank : " + key
                    + "\t\t Name : "
                    + ht1.get(key));
        }

    }
}
