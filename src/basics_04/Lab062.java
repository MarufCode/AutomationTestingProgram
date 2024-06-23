package src.basics_04;


public class Lab062 {
    public static void main(String[] args) {

        int itemCode = 002;
        switch (itemCode){
            case 001, 002, 003 :
                System.out.println("It is as electronic gadget");
                break;

            case 004, 005:
                System.out.println("it is a mechanical device!");

            default:
                System.out.println("It is a software porduct!");
        }

    }
}
