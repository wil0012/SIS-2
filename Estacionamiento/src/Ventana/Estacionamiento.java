/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Ramirez-Pc
 */
public class Estacionamiento extends javax.swing.JFrame {
    PreparedStatement ps;
    ResultSet rs;

    public static  Connection getConection() {
        Connection conexion = null;
        String url = "jdbc:postgresql://localhost:5432/EDIFICIO";
        String usuario = "postgres";
        String contrasenia = "slate";
        try {
            Class.forName("org.postgresql.Driver");
            conexion = (Connection)DriverManager.getConnection(url, usuario, contrasenia);
            JOptionPane.showMessageDialog(null, "Conexion Exitosa");
            //java.sql.Statement st = conexion.createStatement();

           // st.close();
           // conexion.close();

        } catch (Exception e) {
            System.out.println("Error de conexion" + e.getLocalizedMessage());
        }
        return conexion;
    }
    //metodo para limpiar cajas
    private void limpiarCajas(){
        jText_propietario.setText(null);
        jText_ingreso.setText(null);
        jText_salida.setText(null);
        CBx_vehiculo.setSelectedIndex(0);
    }

    public Estacionamiento() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagen/icono2.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton_cancelVehiculo = new javax.swing.JButton();
        jButton_guardarVehiculo = new javax.swing.JButton();
        jButton_buscar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CBx_vehiculo = new javax.swing.JComboBox();
        jText_propietario = new javax.swing.JTextField();
        jText_salida = new javax.swing.JTextField();
        jText_ingreso = new javax.swing.JTextField();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Propietario :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo de Vehiculo :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingreso :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Salida :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jButton_cancelVehiculo.setBackground(new java.awt.Color(0, 0, 0));
        jButton_cancelVehiculo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_cancelVehiculo.setForeground(new java.awt.Color(255, 255, 255));
        jButton_cancelVehiculo.setText("Cancel");
        jButton_cancelVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelVehiculoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_cancelVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 80, 30));

        jButton_guardarVehiculo.setBackground(new java.awt.Color(0, 0, 0));
        jButton_guardarVehiculo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_guardarVehiculo.setForeground(new java.awt.Color(255, 255, 255));
        jButton_guardarVehiculo.setText("Guardar");
        jButton_guardarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_guardarVehiculoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_guardarVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 90, 30));

        jButton_buscar.setBackground(new java.awt.Color(0, 0, 0));
        jButton_buscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_buscar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_buscar.setText("Buscar");
        getContentPane().add(jButton_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, -1, 30));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/imprimir.png"))); // NOI18N
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("FORMULARIO - ESTACIONAMIENTO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/edif2.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        CBx_vehiculo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona", "BMW", "Cadillac", "Chevrolet", "Fiat", "Ford", "Honda", "Isuzu", "Iveco", "Jeep", "Kia", "Lexus", "Mazda", "Mitsubishi", "Nissan", "Renault", "Subaru", "Suzuki", "Toyota", "Volkswagen", "Otro", " " }));
        CBx_vehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBx_vehiculoActionPerformed(evt);
            }
        });
        getContentPane().add(CBx_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 190, -1));
        getContentPane().add(jText_propietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 230, -1));
        getContentPane().add(jText_salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 250, -1));
        getContentPane().add(jText_ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 250, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_cancelVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelVehiculoActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton_cancelVehiculoActionPerformed

    private void jButton_guardarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_guardarVehiculoActionPerformed
        
        Connection conexion = null;
        try {
            conexion = getConection();
            // residente = conexion.prepareStatement("INSERT INTO residente (nombre_residente)VALUES(?)");
           //  residente.setString(4, //);
            //INSERTAMOS DATOS EN LA TABLA Parqueo
            ps = conexion.prepareStatement("INSERT INTO Prueba (Propietario, Tipo_vehiculo, Ingreso, Salida) VALUES(?,?,?,?)");
            
            ps.setString(1, jText_propietario.getText());
            ps.setString(2, CBx_vehiculo.getSelectedItem().toString());
            ps.setDate(3, Date.valueOf(jText_salida.getText()));
            ps.setDate(4, Date.valueOf(jText_salida.getText()));
           
            //actualizar tabla
           
           int res = ps.executeUpdate();
           if(res >0){
               JOptionPane.showMessageDialog(null, " Guardado");
           }else{
               JOptionPane.showMessageDialog(null, "Error al Guardar");
           }
           conexion.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_jButton_guardarVehiculoActionPerformed

    private void CBx_vehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBx_vehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBx_vehiculoActionPerformed

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
            java.util.logging.Logger.getLogger(Estacionamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estacionamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estacionamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estacionamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estacionamiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CBx_vehiculo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_buscar;
    private javax.swing.JButton jButton_cancelVehiculo;
    private javax.swing.JButton jButton_guardarVehiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JTextField jText_ingreso;
    private javax.swing.JTextField jText_propietario;
    private javax.swing.JTextField jText_salida;
    // End of variables declaration//GEN-END:variables
}
