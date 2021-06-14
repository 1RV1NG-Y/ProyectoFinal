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
import java.net.URL;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class CheckOut extends javax.swing.JFrame {

     BD  conn;
     public int lavanderia = 200;
     public int paqueteria = 100;
     public int spa = 500;
     public int ServicioC = 450;
     public int cobro;
     public String nombre;
  
    public CheckOut(BD conexion) throws SQLException {
        this.conn = conexion;
        initComponents();   
        
    }
    public CheckOut() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelImporte = new javax.swing.JLabel();
        jTextFieldNumHab = new javax.swing.JTextField();
        jTextAreaDatosHuesped = new javax.swing.JTextArea();
        jCheckBoxLav = new javax.swing.JCheckBox();
        jCheckBoxSC = new javax.swing.JCheckBox();
        jCheckBoxSpa = new javax.swing.JCheckBox();
        jCheckBoxPaq = new javax.swing.JCheckBox();
        jButtonCalc = new javax.swing.JButton();
        JButtonCobro = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Fondo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Servicios Extra:");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 130, 20));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Habitacion :");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 70, 20));

        jLabelImporte.setBackground(new java.awt.Color(255, 255, 255));
        jLabelImporte.setText("Importe : ");
        jLabelImporte.setOpaque(true);
        jLabelImporte.setPreferredSize(new java.awt.Dimension(111, 23));
        jPanel1.add(jLabelImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 120, -1));

        jTextFieldNumHab.setToolTipText(" ");
        jTextFieldNumHab.setBorder(null);
        jTextFieldNumHab.setMinimumSize(new java.awt.Dimension(58, 14));
        jTextFieldNumHab.setPreferredSize(new java.awt.Dimension(58, 14));
        jTextFieldNumHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumHabActionPerformed(evt);
            }
        });
        jTextFieldNumHab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNumHabKeyReleased(evt);
            }
        });
        jPanel1.add(jTextFieldNumHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 60, 20));

        jTextAreaDatosHuesped.setColumns(20);
        jTextAreaDatosHuesped.setRows(5);
        jPanel1.add(jTextAreaDatosHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 230, 130));

        jCheckBoxLav.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxLav.setText("Lavanderia");
        jPanel1.add(jCheckBoxLav, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 130, -1));

        jCheckBoxSC.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxSC.setText("Servicio a cuarto");
        jPanel1.add(jCheckBoxSC, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 130, -1));

        jCheckBoxSpa.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxSpa.setText("Spa");
        jPanel1.add(jCheckBoxSpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 130, 20));

        jCheckBoxPaq.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxPaq.setText("Paqueteria");
        jPanel1.add(jCheckBoxPaq, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 130, -1));

        jButtonCalc.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCalc.setText("Calcular importe");
        jButtonCalc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonCalcMouseReleased(evt);
            }
        });
        jPanel1.add(jButtonCalc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        JButtonCobro.setBackground(new java.awt.Color(255, 255, 255));
        JButtonCobro.setText("Cobrar y dar baja");
        JButtonCobro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JButtonCobroMouseReleased(evt);
            }
        });
        jPanel1.add(JButtonCobro, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setText("Baja y cobro");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 260));
        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNumHabKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNumHabKeyReleased
        // TODO add your handling code here:
        String NomHuesped, DiasEstancia, Ciudad , Habitacion;
                
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) { //Enter was pressed
            System.out.println("Presionaste enter");
            String Hab = jTextFieldNumHab.getText().trim();
            
            String query = "SELECT * FROM huesped WHERE lower(habitacion)=lower('"+Hab+"')";
            //System.out.println("*" query + "*");
            this.conn.Consult(query);
            
           
            try{
                nombre = this.conn.rs.getString(2);
                jTextAreaDatosHuesped.setText(  "Huesped: "+nombre+"\n"+
                                                "Ciudad: "+conn.rs.getString(3)+"\n"+
                                                "Habitacion usada: "+conn.rs.getString(7)+"\n"+
                                                "Se quedo: "+conn.rs.getString(6)+" dias"+"\n"); 
                
  
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Habitacion vacia",
                                                    "Error", JOptionPane.WARNING_MESSAGE);
            }
            
            
        }
    }//GEN-LAST:event_jTextFieldNumHabKeyReleased

    private void jButtonCalcMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCalcMouseReleased
        // TODO add your handling code here:
        String Hab = jTextFieldNumHab.getText().trim();
        //Cobro                               
                String query2 = "SELECT * FROM habitacion WHERE lower(num)=lower('"+Hab+"')";
                this.conn.Consult(query2);
                try{
                    cobro = conn.rs.getInt(4)+ conn.rs.getInt(5);   //costo habitacion + costo extra
                    
                System.out.println("Calculando");
            }catch (SQLException ex) {
                System.out.println("No existe ese huesped");
            }
        
        if(jCheckBoxLav.isSelected()){
                    System.out.println("lavanderia");
                    cobro = cobro +lavanderia;
                }
                if(jCheckBoxSC.isSelected()){
                    cobro = cobro +ServicioC;
                }
                if(jCheckBoxSpa.isSelected()){
                    cobro = cobro +spa;
                }
                if(jCheckBoxPaq.isSelected()){
                    cobro = cobro +paqueteria;
                }
        
                System.out.println("Cobro :"+cobro);
                jLabelImporte.setText("Importe : "+String.valueOf(cobro));
    }//GEN-LAST:event_jButtonCalcMouseReleased

    private void JButtonCobroMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonCobroMouseReleased
        // TODO add your handling code here:
         double importe=0;         
         String query= "delete from huesped where nombre ="+"'"+nombre+"'"; //Completa sentencia mysql
            
            int j=this.conn.Update(query);
            if (j>0)
                JOptionPane.showMessageDialog(this, "Baja realizada ");
            else
                JOptionPane.showMessageDialog(this, "La baja no se pudo realizar");
            
      String query2 ="SELECT sum(importe) FROM caja ";
      try{
      this.conn.Consult(query2);
      importe = (double)cobro + conn.rs.getDouble(1);
      }catch(SQLException ex) {
                System.out.println("No existe ese huesped");
            }
       
      String query3 = "UPDATE caja SET importe ="+ importe +"WHERE `id` = 1";
      this.conn.Consult(query3);
     
      
    }//GEN-LAST:event_JButtonCobroMouseReleased

    private void jTextFieldNumHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumHabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumHabActionPerformed

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
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckOut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton JButtonCobro;
    private javax.swing.JButton jButtonCalc;
    private javax.swing.JCheckBox jCheckBoxLav;
    private javax.swing.JCheckBox jCheckBoxPaq;
    private javax.swing.JCheckBox jCheckBoxSC;
    private javax.swing.JCheckBox jCheckBoxSpa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelImporte;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDatosHuesped;
    private javax.swing.JTextField jTextFieldNumHab;
    // End of variables declaration//GEN-END:variables
}
