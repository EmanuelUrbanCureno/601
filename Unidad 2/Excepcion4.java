
package excepcion4;


public class Excepcion4 {

    private static StackTraceElement[] stes;
    public static int miMetodo(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException();
        }
    int c= a/b;
    return c;
    }
   
    public static void main(String[] args) {
        try{
            int division = miMetodo(10, 0);
            System.out.println(division);
        }catch(ArithmeticException e){
            System.out.println("");
            e.setStackTrace(stes);
        }
    }
    
}
