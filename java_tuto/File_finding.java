package java_tuto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class File_finding {

   public static void main(String args[]) throws FileNotFoundException {		
try {
      File file = new File("C:\\Users\\user\\Desktop\\New//Text Document.txt");
      FileReader fr = new FileReader(file);
int content;
            while ((content = fr.read()) != -1) {
                System.out.print((char) content);
            
}
catch(IO Exception){

}
   }
}
