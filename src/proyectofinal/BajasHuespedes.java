/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import clases.BD;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author eidan
 */
public class BajasHuespedes extends javax.swing.JFrame {

    BD  conn;
    
    public BajasHuespedes() {
        initComponents();
    }
    
    public BajasHuespedes(BD conexion) throws SQLException {
        this.conn = conexion;
        initComponents();   
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldHuespedBaja = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(430, 300));
        jPanel1.setPreferredSize(new java.awt.Dimension(430, 300));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Nombre Huesped");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 130, 20));

        jTextFieldHuespedBaja.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldHuespedBajaKeyReleased(evt);
            }
        });
        jPanel1.add(jTextFieldHuespedBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, -1));

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("Hacer Baja");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText(" Bajas");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 90, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vuelva.jpg"))); // NOI18N
        jLabel2.setText("Nombre Huesped:");
        jLabel2.setMaximumSize(new java.awt.Dimension(430, 300));
        jLabel2.setMinimumSize(new java.awt.Dimension(430, 300));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 240));
        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldHuespedBajaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldHuespedBajaKeyReleased
        // TODO add your handling code here:
        
        String NomHuesped, DiasEstancia, Ciudad , Habitacion;
                
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) { //Enter was pressed
            System.out.println("Presionaste enter");
            String NombreHB = jTextFieldHuespedBaja.getText();
            this.jTextFieldHuespedBaja.setText("");
            String query = "SELECT * FROM huesped WHERE lower(nombre)=lower('"+NombreHB+"')";
            //System.out.println("*" query + "*");
            this.conn.Consult(query);
            try{
                String nombre = this.conn.rs.getString(2);
                JOptionPane.showMessageDialog(null, "Huesped: "+nombre+"\n"+
                                                    "Ciudad: "+conn.rs.getString(3)+"\n"+
                                                    "Habitacion usada: "+conn.rs.getString(7)+"\n"+
                                                    "Se quedo: "+conn.rs.getString(6)+"\n",
                                                    "Huesped existente", JOptionPane.WARNING_MESSAGE);

                System.out.println(nombre);
            }catch (SQLException ex) {
                System.out.println("No existe ese huesped");
            }
        }
        
    }//GEN-LAST:event_jTextFieldHuespedBajaKeyReleased

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        // TODO add your handling code here:
        String NombreHB = this.jTextFieldHuespedBaja.getText();
        
        if(NombreHB.isEmpty()){
            JOptionPane.showMessageDialog(this, "Campo nombre vacio");
        }
        else{
            
            String query= "delete from huesped where nombre ="+"'"+NombreHB+"'"; //Completa sentencia mysql
            
            int j=this.conn.Update(query);
            if (j>0)
                JOptionPane.showMessageDialog(this, "Baja realizada ");
            else
                JOptionPane.showMessageDialog(this, "La baja no se pudo realizar");
        }
        
        
    }//GEN-LAST:event_jButton1MouseReleased

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
            java.util.logging.Logger.getLogger(BajasHuespedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BajasHuespedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BajasHuespedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BajasHuespedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BajasHuespedes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldHuespedBaja;
    // End of variables declaration//GEN-END:variables
}
