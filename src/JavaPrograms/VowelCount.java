package src.JavaPrograms;

public class VowelCount {

    public static void main(String[] args) {

        String x = "Maruf Sherikar";
        int count = 0;

        for (int i = 0; i<x.length(); i++){
            Character c = x.charAt(i);
            if (c == 'a' || c == 'e'|| c == 'i'|| c == 'o'|| c == 'u'){
                count = count + 1;

            }
        }

        System.out.println("Number of Vowels present in String" + count);
    }
}