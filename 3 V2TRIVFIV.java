
package pkg3.v2trivfiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class V2TRIVFIV {

    
    public static void main(String[] args) throws IOException {
        //Declaracion de variables
            BufferedReader bufEntrada = new BufferedReader (new InputStreamReader(System.in));
            int numero, mult3, mult5;     
        //entrada de datos
            System.out.println("Dame el numero");
            numero=Integer.parseInt(bufEntrada.readLine());
        //procesar datos
            mult3=numero%3;
            mult5=numero%5;
        //Salida de datos    
            if(mult3==0 && mult5==0){
                System.out.println("TRIFIV");
            } else if(mult3==0){
                System.out.println("TRI");
            } else if(mult5==0){
                System.out.println("FIV");
            }
            
       }
}
