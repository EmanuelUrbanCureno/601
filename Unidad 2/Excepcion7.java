
package excepcion.pkg7;


public class Excepcion7 {

   
    public static void main(String[] args) {
       
          try {
            
            Class.forName("Hola");
        } catch (ClassNotFoundException e) {
            System.out.println("Se produjo una excepción ClassNotFoundException: " + e.getMessage());
            e.printStackTrace();
        }
    }
}