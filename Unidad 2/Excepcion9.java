
package excepcion.pkg9;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Excepcion9 {

   
    public static void main(String[] args) {
     BufferedReader reader = null;
        try {
            
            reader = new BufferedReader(new FileReader("archivo.txt"));
            String line = reader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.out.println("Se produjo una excepción IOException: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}