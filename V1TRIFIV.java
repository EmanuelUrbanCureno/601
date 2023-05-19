
package v1trifiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class V1TRIFIV {

    
    public static void main(String[] args) throws IOException {
        BufferedReader bufEntrada = new BufferedReader (new InputStreamReader(System.in));
        int n; 
        float mult3, mult5;
        System.out.println("Dame un numero: ");
        n=Integer.parseInt (bufEntrada.readLine());
        
        mult3=n%3;
        mult5=n%5;
        
        if(mult3==0){
            System.out.println("TRI");
        
        }
        if(mult5==0){
            System.out.println("FIV");
        
        }
        if(mult3==0 && mult5==0){
            System.out.println("TRIFIV");
        
        }
       
    }
    
}

