 
package diag;
import java.util.Scanner;

public class Diag {

   
    public static void main(String[] args) {
         int x, y, z;
    Scanner sc= new Scanner(System.in);
        System.out.println("Inserta un numero y te dire si es Multiplo de 3, de 5 o de Ambos");
        x=sc.nextInt();
         y=x%3;
         z=x%5;
          if(x>0 || x<0){
         if(y==0 & z>0){
             System.out.println("El numero: "+x+" Es multiplo de 3");
         }
         else if(y>0 & z==0){
             System.out.println("El numero: "+x+" Es multiplo de 5");
         }
         else if(y==0 & z==0){
         System.out.println("El numero: "+x+" Es multiplo de 3 y 5");
         }
         
         else{
             System.out.println("El numero: "+x+" No es multiplo de ninguno de estos 2 numeros");
         }
          }
          else if(x==0){
              System.out.println("Tu numero es 0");
          }
        
   
    }
    }
    

