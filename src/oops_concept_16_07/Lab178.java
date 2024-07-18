package src.oops_concept_16_07;

import java.util.List;

public class Lab178 {

    public static void main(String[] args) {

        // Collection Framework

        List fruits = List.of("Apple", "Banana", "Watermelon", "Mango", "Apple");
        List shoppingItems = List.of("AATA", "MILK", "POTATO", "BREAD");
        List my_12_marks = List.of(98, 65, 85, 74);
        List diff_type_data = List.of("Maruf", 77, "SHerikar", "Automation Testing", "true", 123);

        System.out.println(fruits.get(1));
        System.out.println(fruits.size());
        System.out.println(fruits);
        System.out.println(fruits.indexOf("Mango"));


        //IsEmpty

        System.out.println(fruits.isEmpty());
//        fruits.add("Maruf");
//        fruits.remove("Apple");








    }
}
