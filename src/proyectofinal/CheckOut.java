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
     public int lavanderia = 200;   //pago unico
     public int paqueteria = 100;
     public int spa = 500;
     public int ServicioC = 450;
     public int cobro;
     public int cobro_extra;
     public String nombre;
     public String ciudad;
     public String FechaEntd;
     public String FechaSal;
     public String CostoHab;
     public String TipoHab;
     public String TotalSinCargos;
     public String TotalCargos;
     public String CargosExtra;
     boolean lav=false,paq=false,Cspa=false,serv=false;
     
     
     public int dias;
     public int personas_extras;
     public String id;
  
    public CheckOut(BD conexion) throws SQLException {
        this.conn = conexion;
           this.setUndecorated(true);
        initComponents();   
    this.setLocationRelativeTo(this);
        
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

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Servicios Extra:");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Habitacion :");
        jLabel2.setOpaque(true);

        jLabelImporte.setBackground(new java.awt.Color(255, 255, 255));
        jLabelImporte.setText("Importe : ");
        jLabelImporte.setOpaque(true);
        jLabelImporte.setPreferredSize(new java.awt.Dimension(111, 23));

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

        jTextAreaDatosHuesped.setColumns(20);
        jTextAreaDatosHuesped.setRows(5);

        jCheckBoxLav.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxLav.setText("Lavanderia");

        jCheckBoxSC.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxSC.setText("Servicio a cuarto");

        jCheckBoxSpa.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxSpa.setText("Spa");

        jCheckBoxPaq.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxPaq.setText("Paqueteria");

        jButtonCalc.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCalc.setText("Calcular importe");
        jButtonCalc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonCalcMouseReleased(evt);
            }
        });

        JButtonCobro.setBackground(new java.awt.Color(255, 255, 255));
        JButtonCobro.setText("Cobrar y dar baja");
        JButtonCobro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JButtonCobroMouseReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setText("Baja y cobro");

        jPanel3.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jTextAreaDatosHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(JButtonCobro))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jTextFieldNumHab, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jCheckBoxSC, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jCheckBoxLav, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jCheckBoxSpa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabelImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel3))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jCheckBoxPaq, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButtonCalc))
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jTextAreaDatosHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(JButtonCobro))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jTextFieldNumHab, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jCheckBoxSC))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jCheckBoxLav))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jCheckBoxSpa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabelImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jCheckBoxPaq))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jButtonCalc))
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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
                if(Cspa==true){System.out.println("esta en true");}
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) { //Enter was pressed
            System.out.println("Presionaste enter");
            String Hab = jTextFieldNumHab.getText().trim();
            
            String query = "SELECT * FROM huesped WHERE habitacion="+Hab;
            //System.out.println("*" query + "*");
            this.conn.Consult(query);
            
           
            try{
                 id = this.conn.rs.getString(1);
                nombre = this.conn.rs.getString(2);                
                jTextAreaDatosHuesped.setText(  "Huesped: "+nombre+"\n"+
                                                "Ciudad: "+conn.rs.getString(3)+"\n"+
                                                "Habitacion usada: "+conn.rs.getString(7)+"\n"+
                                                "Se quedo: "+conn.rs.getString(6)+" dias"+"\n"); 
                ciudad = conn.rs.getString(3);
                dias = conn.rs.getInt(6);
                personas_extras  = conn.rs.getInt(8);
                
                FechaEntd = conn.rs.getString(4);
                FechaSal = conn.rs.getString(5);
                
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
                String query2 = "SELECT * FROM habitacion WHERE num="+Hab;
                this.conn.Consult(query2);
                try{
                    cobro = conn.rs.getInt(4)*dias;   //
                    TotalSinCargos = String.valueOf(cobro);
                    cobro_extra = conn.rs.getInt(5)*(personas_extras-conn.rs.getInt(3)+1);            //Cobro por personas extra 
                    CostoHab = conn.rs.getString(4);
                    TipoHab = conn.rs.getString(3);
                    
                System.out.println("Calculando");
            }catch (SQLException ex) {
                System.out.println("No existe ese huesped");
            }
        
                CargosExtra = "Servicio  /  $costo\n";
        if(jCheckBoxLav.isSelected()){  
                    System.out.println("lavanderia");
                    cobro_extra +=lavanderia;
                    CargosExtra=CargosExtra+"lavanderia $200\n";
                }
                if(jCheckBoxSC.isSelected()){
                    cobro_extra += ServicioC;
                    CargosExtra=CargosExtra+"Servicio Habitacion $450\n";
                }
                if(jCheckBoxSpa.isSelected()){
                    cobro_extra +=spa;
                    CargosExtra=CargosExtra+"Spa $500\n";
                }
                if(jCheckBoxPaq.isSelected()){
                    cobro_extra+=paqueteria;
                    CargosExtra=CargosExtra+"Paqueteria $100\n";
                }
        
                cobro += cobro_extra;
                System.out.println("Cobro :"+cobro);
                jLabelImporte.setText("Importe : "+String.valueOf(cobro));
    }//GEN-LAST:event_jButtonCalcMouseReleased

    private void JButtonCobroMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonCobroMouseReleased
        // TODO add your handling code here:
         String Hab = jTextFieldNumHab.getText().trim();
         String query= "delete from huesped where nombre ='"+nombre+"'"; //Completa sentencia mysql
            
            int j=this.conn.Update(query);
            if (j>0)
                JOptionPane.showMessageDialog(this, "Baja realizada ");
            else
                JOptionPane.showMessageDialog(this, "La baja no se pudo realizar");                       
      String query3 = "INSERT INTO caja VALUES("+id+",now(),"+String.valueOf(cobro)+")";
      TotalCargos = String.valueOf(cobro);
      this.conn.Update(query3);
      query3 = "UPDATE habitacion SET estatus=0 WHERE num="+Hab;
      this.conn.Update(query3);
      
        System.out.println("Imprimiendo Ticket");
        
        PlantillaPdfCobro miPlantilla = new PlantillaPdfCobro(
                "Java Inn",//Nombre hotel
                "Programa tus estancia , compila tus vacaciones ",//Lema
                "Antiguo Camino a Calvillo km4 ejido San Ignacio, 20313 Aguascalientes",//ubicacion
                "src/jlogo.png",//imagen1
                "src/Firma.png",//imagen2
                nombre,ciudad,FechaEntd,FechaSal,TipoHab
                ,CostoHab,String.valueOf(dias),TotalSinCargos,TotalCargos,CargosExtra
                ,String.valueOf(lavanderia),String.valueOf(paqueteria),String.valueOf(spa),String.valueOf(ServicioC)
                );
        
        miPlantilla.crearPlantilla();
                   
      
      this.dispose();
    }//GEN-LAST:event_JButtonCobroMouseReleased

    private void jTextFieldNumHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumHabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumHabActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

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
