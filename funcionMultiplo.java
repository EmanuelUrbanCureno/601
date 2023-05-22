 package FUNCIONES;

public class funcionMultiplo {
    public String returnaMultiplo(int num){
        if(num%3==0 && num%5==0){
                return("TRIFIV");
            } else if(num%3==0){
                return("TRI");
            } else if(num%5==0){
                return("FIV");
            }
        return "Ningun Valor";
    }
}
