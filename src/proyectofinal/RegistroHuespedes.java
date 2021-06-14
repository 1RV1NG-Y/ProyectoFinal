/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import clases.BD;
import java.awt.Cursor;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;



public class RegistroHuespedes extends javax.swing.JFrame {

    BD  conn;
    ImageIcon Man = new ImageIcon("src/Man.png");
    ImageIcon Woman = new ImageIcon("src/Woman.png");
	
    
    public RegistroHuespedes() {
        initComponents();
        
    }

    public RegistroHuespedes(BD conexion) throws SQLException {
        this.conn = conexion;
        initComponents();   
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabelFoto = new javax.swing.JLabel();
        jRadioButtonMan = new javax.swing.JRadioButton();
        jRadioButtonWoman = new javax.swing.JRadioButton();
        jTextFieldNombreHuesped = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabelNom = new javax.swing.JLabel();
        jLabelCiud = new javax.swing.JLabel();
        jTextFieldCiudadHuesped = new javax.swing.JTextField();
        jSpinnerNumHospedados = new javax.swing.JSpinner();
        jLabelCiud1 = new javax.swing.JLabel();
        jLabelDiasEstan = new javax.swing.JLabel();
        jSpinnerDiasEstancia = new javax.swing.JSpinner();
        jTextFieldElegHabitacion = new javax.swing.JTextField();
        jLabelElegHabitacion = new javax.swing.JLabel();
        jButtonElegHabitacion = new javax.swing.JButton();
        jButtonRegistrar = new javax.swing.JButton();
        jDateChooserFechaIngreso = new com.toedter.calendar.JDateChooser();
        jLabelCiud2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(744, 408));
        setMinimumSize(new java.awt.Dimension(744, 408));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(744, 408));
        jPanel1.setMinimumSize(new java.awt.Dimension(744, 408));

        jLabelFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Man.png"))); // NOI18N
        jLabelFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        buttonGroup1.add(jRadioButtonMan);
        jRadioButtonMan.setText("Hombre");
        jRadioButtonMan.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButtonManStateChanged(evt);
            }
        });

        buttonGroup1.add(jRadioButtonWoman);
        jRadioButtonWoman.setText("Mujer");
        jRadioButtonWoman.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButtonWomanStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setText("Registro huesped");

        jLabelNom.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelNom.setText("Nombre/Name:");

        jLabelCiud.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelCiud.setText("Ciudad:");

        jSpinnerNumHospedados.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerNumHospedadosStateChanged(evt);
            }
        });

        jLabelCiud1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelCiud1.setText("Total de personas a hospedar:");

        jLabelDiasEstan.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelDiasEstan.setText("Dias de estancia:");

        jSpinnerDiasEstancia.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerDiasEstanciaStateChanged(evt);
            }
        });

        jLabelElegHabitacion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelElegHabitacion.setText("Habitacion de estancia");

        jButtonElegHabitacion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonElegHabitacion.setText("Seleccionar habitacion");
        jButtonElegHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonElegHabitacionMouseReleased(evt);
            }
        });

        jButtonRegistrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonRegistrarMouseReleased(evt);
            }
        });
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jLabelCiud2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelCiud2.setText("Fecha de ingreso");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jButtonRegistrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelCiud2)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooserFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelNom)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldNombreHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelCiud)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldCiudadHuesped)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 281, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jRadioButtonWoman, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButtonMan, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelCiud1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jSpinnerNumHospedados, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelElegHabitacion)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldElegHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonElegHabitacion))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelDiasEstan)
                                        .addGap(18, 18, 18)
                                        .addComponent(jSpinnerDiasEstancia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButtonMan)
                                    .addComponent(jTextFieldNombreHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelNom))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButtonWoman))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabelCiud)
                                            .addComponent(jTextFieldCiudadHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelCiud1)
                                    .addComponent(jSpinnerNumHospedados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addComponent(jLabelCiud2))
                    .addComponent(jDateChooserFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDiasEstan)
                    .addComponent(jSpinnerDiasEstancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelElegHabitacion)
                    .addComponent(jTextFieldElegHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonElegHabitacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jButtonRegistrar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonWomanStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButtonWomanStateChanged
        // TODO add your handling code here:
        if (jRadioButtonMan.isSelected()) {
            jLabelFoto.setIcon(Man);
        } else if (jRadioButtonWoman.isSelected()) {
            jLabelFoto.setIcon(Woman);
        }
    }//GEN-LAST:event_jRadioButtonWomanStateChanged

    private void jRadioButtonManStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButtonManStateChanged
        // TODO add your handling code here:
        //JRadioButton button = (JRadioButton) evt.getSource();
        if (jRadioButtonMan.isSelected()) {
            jLabelFoto.setIcon(Man);
        } else if (jRadioButtonWoman.isSelected()) {
            jLabelFoto.setIcon(Woman);
        }
    }//GEN-LAST:event_jRadioButtonManStateChanged

    private void jSpinnerNumHospedadosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerNumHospedadosStateChanged
        // TODO add your handling code here:
        Integer valor = (Integer)jSpinnerNumHospedados.getValue();
        if(valor<=0){
            jSpinnerNumHospedados.setValue(1);
        }else if(valor>=10){
            jSpinnerNumHospedados.setValue(10);
        }
        int personasExtra = (Integer)jSpinnerNumHospedados.getValue()-1;
    }//GEN-LAST:event_jSpinnerNumHospedadosStateChanged

    private void jSpinnerDiasEstanciaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerDiasEstanciaStateChanged
        // TODO add your handling code here:
        Integer valor1 = (Integer)jSpinnerNumHospedados.getValue();
        if(valor1<=0){
            jSpinnerNumHospedados.setValue(1);
        }
    }//GEN-LAST:event_jSpinnerDiasEstanciaStateChanged

    private void jButtonElegHabitacionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonElegHabitacionMouseReleased
        // TODO add your handling code here:
        try {
                new DistribucionHabitaciones().setVisible(true);
            } catch (SQLException ex) { }
    }//GEN-LAST:event_jButtonElegHabitacionMouseReleased

    private void jButtonRegistrarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegistrarMouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonRegistrarMouseReleased

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        // TODO add your handling code here:
        
        String NomHuesped, DiasEstancia, PersonasExtra, Ciudad , Habitacion, FEntd, FSal,estatus;
        NomHuesped = jTextFieldNombreHuesped.getText();
        DiasEstancia = String.valueOf((Integer)jSpinnerDiasEstancia.getValue()).trim();
        PersonasExtra = String.valueOf((Integer)jSpinnerNumHospedados.getValue()-1).trim();//pasa el valor del spinner a string para pasarlo a la bd
        Ciudad = jTextFieldCiudadHuesped.getText();
        Habitacion = jTextFieldElegHabitacion.getText().trim();
        estatus = String.valueOf(1);;
 
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");//formato de fecha
           
        Date fechaNueva =sumarDiasFecha(this.jDateChooserFechaIngreso.getDate(),(Integer)jSpinnerDiasEstancia.getValue()); //nueva fecha
        FEntd = formato.format(this.jDateChooserFechaIngreso.getDate());
        FSal = formato.format(fechaNueva);
        
        System.out.println("Insertando Usuario ");
        String parte1 = "Insert into huesped (nombre, ciudad, dias, personas_extras, habitacion, ingreso, salida, estatus) VALUES (";
        String parte2 = "'"+NomHuesped+"','"+Ciudad+"','"+DiasEstancia+"','"+PersonasExtra+"','"+Habitacion+"',Date'"+FEntd+"','"+FSal+"','"+estatus+"')";
        String query = parte1 + parte2;
        this.conn.Update(query);
        
        
        String query2 = "UPDATE habitacion SET estatus = 1 WHERE `num` ="+Habitacion;
        
        this.conn.Update(query2);
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroHuespedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroHuespedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroHuespedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroHuespedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new RegistroHuespedes().setVisible(true);
                
            }
        });
    }
    
    public static Date sumarDiasFecha(Date fecha,int dias){
        
        Calendar c = Calendar.getInstance();
        c.setTime(fecha);
        c.add(Calendar.DAY_OF_YEAR, dias);//suma los dias
        return c.getTime();
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonElegHabitacion;
    private javax.swing.JButton jButtonRegistrar;
    private com.toedter.calendar.JDateChooser jDateChooserFechaIngreso;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCiud;
    private javax.swing.JLabel jLabelCiud1;
    private javax.swing.JLabel jLabelCiud2;
    private javax.swing.JLabel jLabelDiasEstan;
    private javax.swing.JLabel jLabelElegHabitacion;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonMan;
    private javax.swing.JRadioButton jRadioButtonWoman;
    private javax.swing.JSpinner jSpinnerDiasEstancia;
    private javax.swing.JSpinner jSpinnerNumHospedados;
    private javax.swing.JTextField jTextFieldCiudadHuesped;
    private javax.swing.JTextField jTextFieldElegHabitacion;
    private javax.swing.JTextField jTextFieldNombreHuesped;
    // End of variables declaration//GEN-END:variables
}