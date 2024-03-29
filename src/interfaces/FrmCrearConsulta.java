/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import base.MetodosSQL;
import clases.Consulta;
import clases.Paciente;
import clases.PersonalMedico;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author fredd
 */
public class FrmCrearConsulta extends javax.swing.JFrame {

    private int doctor;
    
    public FrmCrearConsulta(int doctor, Paciente pac) {
        initComponents();
        this.setSize(836, 636);
        this.setLocationRelativeTo(null);
        txtnom.setText(pac.nombre);
        txtape.setText(pac.apellido);
        txtaltura.setText(pac.altura);
        txtantece.setText(pac.antededentes);
        txtcedu.setText(pac.cedula);
        txtedad.setText(String.valueOf(pac.edad()));
        txtgenero.setText(pac.genero);
        txtpeso.setText(pac.peso);
        txtsangres.setText(pac.tipoSagre);
        llenarFecha();
        this.doctor = doctor;
        
    }
    
    public void llenarFecha(){
        LocalDateTime ahora = LocalDateTime.now();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String fechaHoraFormateada = ahora.format(formato);
        txtfecha.setText(fechaHoraFormateada);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtaltura = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtpeso = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnom = new javax.swing.JLabel();
        txtape = new javax.swing.JLabel();
        txtcedu = new javax.swing.JLabel();
        txtedad = new javax.swing.JLabel();
        txtsangres = new javax.swing.JLabel();
        txtgenero = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtantece = new javax.swing.JLabel();
        txttipo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtsintomas = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtdiagnostico = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtobservaciones = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txttratamiento = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nueva Consulta Medica");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 6, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Edad");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 57, 123, -1));

        txtaltura.setForeground(new java.awt.Color(0, 0, 0));
        txtaltura.setText("00");
        getContentPane().add(txtaltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 131, 68, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Identificacion:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 117, -1, -1));

        txtpeso.setForeground(new java.awt.Color(0, 0, 0));
        txtpeso.setText("00");
        getContentPane().add(txtpeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 165, 58, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Genero:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 84, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Peso:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 151, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Antecedentes:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(609, 20, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Altura:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 115, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Tipo de Sangre:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 148, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Apellidos:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 88, -1, -1));

        txtnom.setForeground(new java.awt.Color(0, 0, 0));
        txtnom.setText("jLabel1");
        getContentPane().add(txtnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 64, 158, -1));

        txtape.setForeground(new java.awt.Color(0, 0, 0));
        txtape.setText("jLabel1");
        getContentPane().add(txtape, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 91, 158, -1));

        txtcedu.setForeground(new java.awt.Color(0, 0, 0));
        txtcedu.setText("jLabel1");
        getContentPane().add(txtcedu, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 122, 158, -1));

        txtedad.setForeground(new java.awt.Color(0, 0, 0));
        txtedad.setText("jLabel1");
        getContentPane().add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 64, 110, -1));

        txtsangres.setForeground(new java.awt.Color(0, 0, 0));
        txtsangres.setText("jLabel1");
        getContentPane().add(txtsangres, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 158, 158, -1));

        txtgenero.setForeground(new java.awt.Color(0, 0, 0));
        txtgenero.setText("jLabel1");
        getContentPane().add(txtgenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 91, 96, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Nombres:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 57, -1, -1));

        txtfecha.setForeground(new java.awt.Color(0, 0, 0));
        txtfecha.setText("jLabel1");
        getContentPane().add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 234, 115, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("FECHA:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 227, 76, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Tipo de Consulta:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 286, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Signos y Sintomas:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 323, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Diagnostico:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 442, -1, -1));

        txtantece.setBackground(new java.awt.Color(204, 204, 204));
        txtantece.setForeground(new java.awt.Color(0, 0, 0));
        txtantece.setText("jLabel1");
        getContentPane().add(txtantece, new org.netbeans.lib.awtextra.AbsoluteConstraints(609, 57, 220, 180));
        getContentPane().add(txttipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 286, 208, -1));

        txtsintomas.setColumns(20);
        txtsintomas.setRows(5);
        jScrollPane1.setViewportView(txtsintomas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 350, 375, -1));

        txtdiagnostico.setColumns(20);
        txtdiagnostico.setRows(5);
        jScrollPane2.setViewportView(txtdiagnostico);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 473, 375, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Tratamiento:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 319, -1, -1));

        txtobservaciones.setColumns(20);
        txtobservaciones.setRows(5);
        jScrollPane3.setViewportView(txtobservaciones);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 473, 380, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Observaciones:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 442, -1, -1));

        txttratamiento.setColumns(20);
        txttratamiento.setRows(5);
        jScrollPane4.setViewportView(txttratamiento);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 350, 380, -1));

        jButton1.setBackground(new java.awt.Color(102, 255, 102));
        jButton1.setText("Agregar Consulta Medica");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 577, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/dafualtt.png"))); // NOI18N
        jLabel18.setText("jLabel5");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 640));

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 610, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
            
        Consulta con = new Consulta(0, Integer.valueOf(txtcedu.getText()), this.doctor, LocalDate.now(), txttipo.getText(), txtsintomas.getText(), 
                txtdiagnostico.getText(), txttratamiento.getText(), txtobservaciones.getText());
        
        if (new MetodosSQL().crearConsulta(con)) {
            JOptionPane.showMessageDialog(null, "Consulta Creada con Exito");
            this.dispose();
        }else{
                JOptionPane.showMessageDialog(null, "Error, verifique sus datos");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCrearConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCrearConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCrearConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCrearConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCrearConsulta(0,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel txtaltura;
    private javax.swing.JLabel txtantece;
    private javax.swing.JLabel txtape;
    private javax.swing.JLabel txtcedu;
    private javax.swing.JTextArea txtdiagnostico;
    private javax.swing.JLabel txtedad;
    private javax.swing.JLabel txtfecha;
    private javax.swing.JLabel txtgenero;
    private javax.swing.JLabel txtnom;
    private javax.swing.JTextArea txtobservaciones;
    private javax.swing.JLabel txtpeso;
    private javax.swing.JLabel txtsangres;
    private javax.swing.JTextArea txtsintomas;
    private javax.swing.JTextField txttipo;
    private javax.swing.JTextArea txttratamiento;
    // End of variables declaration//GEN-END:variables
}
