
package excepcion;
import javax.swing.JOptionPane;

public class Excepcion1{

    
    public static void main(String[] args) {
       int x,y;
       try{
       x= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero 1:", "Solicito Datos",3));
       }catch(NumberFormatException n){
           System.out.println(n.getMessage()+ " No es numero ENTERO");
       
       }
    }
    
}

//hazlo por el

