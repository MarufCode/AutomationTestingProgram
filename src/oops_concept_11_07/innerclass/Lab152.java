package src.oops_concept_11_07.innerclass;

public class Lab152 {
    public static void main(String[] args) {

        Car c = new Car("Lambo ");
        c.drive();
        Car.Engine engine =  c.new Engine("400CC");
        engine.start();

    }
}


class Car {
    String make; // Instance Variables

    // Parameterimized Constructor
    public Car(String make) {
        this.make = make;
    }
    // Method
    void drive(){
        System.out.println("You can driver Car");
    }

    public class Engine {

        // Instance Variables
        String hoursePower;

        // Parameterimized Construct
        public Engine(String hoursePower) {
            this.hoursePower = hoursePower;
        }

        // Method
        void start() {
            System.out.println("Enginer is started!! -> " + make);
        }
    }

    }