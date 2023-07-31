
package chats;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;

public class Usuario3 extends javax.swing.JFrame implements Observer {

    coneccion cn=new coneccion ();
    Connection con=cn.conexion();
    Statement st;
    ResultSet rs;
    String Autor="Ufo";
    LocalDateTime fechaActual = LocalDateTime.now();
    DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String fechaA = fechaActual.format(formatoFecha);
    public Usuario3() {
        
       initComponents();
        int x = 500; 
        int y = 0; 
        this.setLocation(x, y);
        this.getRootPane().setDefaultButton(this.Mandar);
        this.setTitle("Ufo");
        Serv ser = new Serv (7000);
        ser.addObserver(this);
        Thread hilo = new Thread(ser);
        hilo.start();
        mostrartabla("");
    }
    void mostrartabla (String valor){
         try {
        String consulta = "SELECT Cliente, Mensaje, Fecha FROM mensajes";
        StringBuilder listaMensajes = new StringBuilder();
        st = con.createStatement();
        rs = st.executeQuery(consulta);
        while (rs.next()) {
           String autor = rs.getString("Cliente");
            String mensaje = rs.getString("Mensaje");
            String fecha = rs.getString("Fecha");
            listaMensajes.append(" >>> ").append(fecha).append(" --- ").append(autor).append(" : ").append(mensaje).append("\n");
         }
        rs.close();
        st.close();
        Tabla.setText(listaMensajes.toString());

    } catch (SQLException e) {
    }
       }
    


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Mandar = new javax.swing.JButton();
        Texto1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        Fecha = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Mandar.setText("Enviar");
        Mandar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MandarActionPerformed(evt);
            }
        });

        Tabla.setColumns(20);
        Tabla.setRows(5);
        jScrollPane1.setViewportView(Tabla);

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaActionPerformed(evt);
            }
        });

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Ufo");

        jButton1.setText("jButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Mandar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1)
                            .addGap(4, 4, 4))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Buscar)
                                    .addGap(49, 49, 49)
                                    .addComponent(jButton2))
                                .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(91, 91, 91)
                            .addComponent(limpiar)
                            .addGap(18, 18, 18)
                            .addComponent(jButton4)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mandar)
                    .addComponent(Texto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Buscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4)
                        .addComponent(limpiar)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MandarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MandarActionPerformed
        
        String mensaje = "--- "+fechaA+" - "+Autor+": "+this.Texto1.getText()+"\n";
        this.Tabla.append(mensaje);
       Guess g =new Guess (5000, mensaje);
       Guess gg =new Guess (6000, mensaje);
        Thread hilo = new Thread (g);
        Thread hilo2 = new Thread (gg);
        hilo.start();
        hilo2.start();
         try {
            String aux=this.Texto1.getText();
            String guardar="INSERT INTO mensajes (Cliente, Mensaje, Fecha) VALUES (?, ?, ?); ";
            PreparedStatement ps=con.prepareStatement(guardar);
            ps.setString(1, Autor);
            ps.setString(2,aux);
            ps.setString(3,fechaA);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Mensaje enviado");
            
        } catch (SQLException e) {
            System.err.println("Error al guardar..."+e);
            JOptionPane.showMessageDialog(null,"Error al guardar"+e);
        }     
    }//GEN-LAST:event_MandarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        Tabla.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    private void FechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        try {
       String fechaB=Fecha.getText();
        String consulta1 = "SELECT Cliente, Mensaje, Fecha FROM mensajes WHERE fecha='"+fechaB+"';";
        StringBuilder listaMensajesB = new StringBuilder();
        st = con.createStatement();
        rs = st.executeQuery(consulta1);
        while (rs.next()) {
             String autor = rs.getString("Cliente");
            String mensaje = rs.getString("Mensaje");
            String fecha = rs.getString("Fecha");
            listaMensajesB.append(" -- ").append(fecha).append(" - ").append(autor).append(" : ").append(mensaje).append("\n");
         }
        rs.close();
        st.close();
        Tabla.setText(listaMensajesB.toString());

    } catch (SQLException e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_BuscarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         mostrartabla("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Usuario3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JTextField Fecha;
    private javax.swing.JButton Mandar;
    private javax.swing.JTextArea Tabla;
    private javax.swing.JTextField Texto1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiar;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
       Tabla.append((String) arg);
    }


   

    
}
