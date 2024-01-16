package interfaces;

import base.MetodosSQL;
import clases.Cita;
import clases.Paciente;
import clases.PersonalMedico;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;


public class FrmBuscarCita extends javax.swing.JFrame {

    private String paciente;

    public FrmBuscarCita(String paciente) {
        initComponents();
        this.paciente = paciente;
        this.setSize(650, 550);
        llenarCitas();
        this.setLocationRelativeTo(null);

    }

    public void llenarCitas() {
        for (Cita cita : new MetodosSQL().llenarCitas(paciente)) {
            cbcita.addItem(cita);
        }
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
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbcita = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtmedico = new javax.swing.JLabel();
        txtfecha = new javax.swing.JLabel();
        txtcedula2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Fecha de la cita");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 352, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Numero De Cita");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 226, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Citas Medicas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 56, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 439, 92, 36));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cédula del paciente");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 162, -1, -1));

        cbcita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbcitaActionPerformed(evt);
            }
        });
        getContentPane().add(cbcita, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 230, 275, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Médico");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 287, -1, -1));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nota: Si no tiene citas entonces no se mostraran datos*");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 474, 314, -1));

        txtmedico.setForeground(new java.awt.Color(0, 0, 0));
        txtmedico.setText("No hay datos");
        getContentPane().add(txtmedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 290, 260, 25));

        txtfecha.setForeground(new java.awt.Color(0, 0, 0));
        txtfecha.setText("No hay datos");
        getContentPane().add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 355, 260, 25));

        txtcedula2.setForeground(new java.awt.Color(0, 0, 0));
        txtcedula2.setText("No hay datos");
        getContentPane().add(txtcedula2, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 165, 260, 25));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/dafualtt.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 510));

        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
       

    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbcitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcitaActionPerformed
        Cita cit = (Cita) cbcita.getSelectedItem();
        txtcedula2.setText(cit.paciente);
        txtmedico.setText(cit.medico);
        LocalDate fecha = cit.fecha;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String fechaFormateada = fecha.format(formatter);

        txtfecha.setText(fechaFormateada);
    }//GEN-LAST:event_cbcitaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmBuscarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBuscarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBuscarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBuscarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBuscarCita("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Cita> cbcita;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel txtcedula2;
    private javax.swing.JLabel txtfecha;
    private javax.swing.JLabel txtmedico;
    // End of variables declaration//GEN-END:variables
}
