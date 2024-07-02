package src.oops_concept_01_07.inheritance;

public class Java  extends Programming{

    String newFeature;

    Java(){
        System.out.println(" Java Default Const");
    }

    Java(String feature){
        this.newFeature = feature;
    }

    void printInfo(){
        System.out.println("Feature is  - >" + this.newFeature);
    }

}
