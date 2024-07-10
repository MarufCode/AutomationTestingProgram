package src.oops_concept_04_07.abstraction.Interfaces;


    interface FatherI {
        void load1K();

        default void print() {
            System.out.println("I am default method");
        }

        static void print2() {
            System.out.println("I am static METHOd!");
        }

}
