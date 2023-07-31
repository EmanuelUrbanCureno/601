
package chats;

import java.io.IOException;
import javax.swing.SwingUtilities;


public class Chats {

  
    public static void main(String[] args) throws IOException {
                 Thread chatAppHilo = new Thread(() -> {
           Usuario chatApp = new Usuario();
            chatApp.setVisible(true);
        });

        Thread chatApp2Hilo = new Thread(() -> {
            Usuario2 chatApp2 = new Usuario2();
           chatApp2.setVisible(true);
           
        });
        Thread chatAppHilo3 = new Thread(() -> {
           Usuario3 chatApp = new Usuario3();
            chatApp.setVisible(true);
        });
        chatAppHilo.start();
        chatApp2Hilo.start();
        chatAppHilo3.start();


    }
    }
    

