package src.oops_concept_11_07.exceptions;

public class Lab164 {
    public static void main(String[] args) {

        //Unchecked Exception , Runtime
        try {
            String name = null;
            name.trim(); // Unchecked? Runtime
        }catch (Exception e){
            System.out.println("Handle it otherwise JVm will give u tight slap");
        }

//
//        //Checked Exception , Compile Time -/JVM? If Knows about it, - Checked Exception
//        try{
//        FileInputStream f = new FileInputStream("dasda.txt");
//        }catch (Exception e){
//
//        }
    }
}
