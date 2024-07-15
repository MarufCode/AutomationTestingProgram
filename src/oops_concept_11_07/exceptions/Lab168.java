package src.oops_concept_11_07.exceptions;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.rmi.server.ExportException;



public class Lab168 {

        public static void main(String[] args)  {
            try {
                String path = "C://a.txt";
                File file = new File(path);
                FileReader fileReader = new FileReader(file);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
    }
}
