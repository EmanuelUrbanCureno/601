
package chats;
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observable;

public class Serv extends Observable implements Runnable{
    private int p;
    public Serv(int p){
        this.p=p;
    }
    @Override
    public void run() {
        ServerSocket serv=null;
        Socket socket = null;
        DataInputStream ent;
        try {
            serv = new ServerSocket(p);
            System.out.println("Servidor funcionando");
            while (true){
                socket = serv.accept();
                System.out.println("Cliente conectado");
                ent =new DataInputStream(socket.getInputStream());
                String mensaje=ent.readUTF();
                System.out.println(mensaje);
                this.setChanged();
                this.notifyObservers(mensaje);
                this.clearChanged();
                socket.close();
                System.out.println("Cliente left the game");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
