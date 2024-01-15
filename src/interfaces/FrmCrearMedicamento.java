/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import base.Conexion;
import base.MetodosSQL;
import clases.Medicamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author aliso
 */
public class FrmCrearMedicamento extends javax.swing.JFrame {

    /**
     * Creates new form FrmCM
     */
    public FrmCrearMedicamento() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnCrearMedicamento = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtregisan = new javax.swing.JTextField();
        txtcantidad = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtespecificaciones = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        btnregresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setText("Especificaciones");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 240, 40));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setText("ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 40, 40));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel4.setText("Precio");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 120, 40));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel5.setText("Registro Sanitario");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 260, 40));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel6.setText("Cantidad");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, 120, 40));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel7.setText("Nombre");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 120, 40));

        btnCrearMedicamento.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnCrearMedicamento.setText("CREAR MEDICAMENTO");
        btnCrearMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearMedicamentoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrearMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 530, 220, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/medicamento.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 210, 200));
        getContentPane().add(txtregisan, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 280, 40));
        getContentPane().add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 200, 40));
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 340, 40));
        getContentPane().add(txtespecificaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 360, 40));
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 280, 40));
        getContentPane().add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 200, 40));

        btnregresar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnregresar.setText("REGRESAR");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnregresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 530, 130, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/crearmedicamento.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearMedicamentoActionPerformed
         // Validaciones de los campos
    if (txtid.getText().trim().isEmpty() ||
        txtnombre.getText().trim().isEmpty() ||
        txtespecificaciones.getText().trim().isEmpty() ||
        txtregisan.getText().trim().isEmpty() ||
        txtprecio.getText().trim().isEmpty() ||
        txtcantidad.getText().trim().isEmpty()) {
        
        JOptionPane.showMessageDialog(this, "Todos los campos deben ser completados.");
        return;
    }
    
    int id;
    try {
        id = Integer.parseInt(txtid.getText().trim());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El ID debe ser un número entero válido.");
        return;
    }

    if (idYaExiste(id)) {
        JOptionPane.showMessageDialog(this, "El ID ya está en uso. Por favor, ingrese un ID diferente.");
        return;
    }

    // Verificar que el nombre solo contenga letras
    if (!txtnombre.getText().matches("[a-zA-Z ]+")) {
        JOptionPane.showMessageDialog(this, "El nombre debe contener solo letras.");
        return;
    }

    // Verificar que especificaciones y regisan contengan letras y números
    if (!txtespecificaciones.getText().matches("[a-zA-Z0-9 ]+") ||
        !txtregisan.getText().matches("[a-zA-Z0-9 ]+")) {
        JOptionPane.showMessageDialog(this, "Solo deben contener letras y números.");
        return;
    }

    // Verificar que el precio sea un número decimal válido
    try {
        Double.valueOf(txtprecio.getText());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El precio debe ser un número válido.");
        return;
    }

    // Verificar que la cantidad sea un número entero
    try {
        Integer.valueOf(txtcantidad.getText());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "La cantidad debe ser un número entero válido.");
        return;
    }
    
    Medicamento medi = new Medicamento(Integer.parseInt(txtid.getText()), txtnombre.getText(), txtespecificaciones.getText(),
        txtregisan.getText(), Double.parseDouble(txtprecio.getText()), Integer.parseInt(txtcantidad.getText()));
        
    if (new MetodosSQL().crearMedicamento(medi)) {
        JOptionPane.showMessageDialog(null, "Medicamento agregado correctamente");
        
        // Borrar el contenido de los campos de texto
        txtid.setText("");
        txtnombre.setText("");
        txtespecificaciones.setText("");
        txtregisan.setText("");
        txtprecio.setText("");
        txtcantidad.setText("");
    } else {
        JOptionPane.showMessageDialog(null, "Verifique sus datos");
        }
    }//GEN-LAST:event_btnCrearMedicamentoActionPerformed
private boolean idYaExiste(int id) {
   
    Connection con = Conexion.getConnection();
    String sql = "SELECT COUNT(*) FROM Medicamento WHERE id = ?";
    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return rs.getInt(1) > 0; // Retorna true si el ID ya existe
        }
    } catch (SQLException e) {
        System.out.println(e);
    }
    return false; // Por defecto, asume que el ID no existe
}
    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        FrmMenuMedicamento menumedi= new FrmMenuMedicamento();
        menumedi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnregresarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCrearMedicamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCrearMedicamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCrearMedicamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCrearMedicamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCrearMedicamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCrearMedicamento;
    public javax.swing.JButton btnregresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JTextField txtcantidad;
    public javax.swing.JTextField txtespecificaciones;
    public javax.swing.JTextField txtid;
    public javax.swing.JTextField txtnombre;
    public javax.swing.JTextField txtprecio;
    public javax.swing.JTextField txtregisan;
    // End of variables declaration//GEN-END:variables
}
