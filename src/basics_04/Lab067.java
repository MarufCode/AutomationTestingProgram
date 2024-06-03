package src.basics_04;


public class Lab067 {
    public static void main(String[] args) {

        char code = 'B';
        int val = switch (code) {
            case 'A' :
                yield 67;
            case 'B' :
                yield 69;
            default:
                throw new IllegalStateException("Unexpected value: " + code);
        };

        System.out.println(val);

    }
}
