package src.JavaPrograms;

public class LargestNumberinArray {
    public static void main(String[] args) {


                int[] arr = {10, 20, 30, 40, 50};
                int largest = arr[0];

                for (int num : arr) {
                    if (num > largest) largest = num;
                }

                System.out.println("Largest number: " + largest);


    }
}
