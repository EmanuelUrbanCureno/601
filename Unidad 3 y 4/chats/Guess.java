package chats;
import java.io.DataOutputStream;
import java.net.Socket;

public class Guess implements Runnable{
    private int p;
    private String msg;
    
    public Guess(int p, String msg){
    this.p=p;
    this.msg=msg;
    }
    @Override
    public void run() {
        final String HOST="127.0.0.1";
        DataOutputStream exit;
        try {
            Socket socket=new Socket(HOST, p);
            exit = new DataOutputStream(socket.getOutputStream());
            exit.writeUTF(msg);
        } catch (Exception e) {
            System.out.println(e);
        }
        }
    
}
