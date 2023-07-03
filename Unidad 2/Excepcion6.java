
package pkg5.excepcion6;


public class Excepcion6 {

  
    public static void main(String[] args) {
      
        try {
            Object obj = new Integer(100);
            String str = (String) obj; 
        } catch (ClassCastException e) {
            System.out.println("Se produjo una excepción ClassCastException: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
