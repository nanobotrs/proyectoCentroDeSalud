/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import base.MetodosSQL;
import clases.Medicamento;
import clases.Paciente;
import clases.RecetaMedica;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class FrmCrearRM extends javax.swing.JFrame {

    /**
     * Creates new form FrmCrearRM
     */
    MetodosSQL con = new MetodosSQL();
    public static ArrayList<Medicamento> medicamentosList = new ArrayList<>();
    Paciente pacR;
    private Map<String, Integer> stockMedicamentos = new HashMap<>();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private JFrame formularioAnterior;

    public FrmCrearRM(JFrame formularioAnterior) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        LocalDate ahora = LocalDate.now();

        this.txt_fecha.setText(ahora.format(formatter));
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Cantidad");
        table_medicamentos.setModel(model);
        txt_id.setText(con.codRM());
        this.formularioAnterior = formularioAnterior;

        //this.con.llenarComboRM(cbx_medicamento);
    }

    public FrmCrearRM() {
        initComponents();

        //this.con.llenarComboRM(cbx_medicamento);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_id = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_buscarP = new javax.swing.JTextField();
        btn_agregarMed = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_NomMed = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_idNameMed = new javax.swing.JTextField();
        btn_buscarMed = new javax.swing.JButton();
        btn_eliminarMed = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_fecha = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_medicamentos = new javax.swing.JTable();
        txt_indicaciones = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_NomApe = new javax.swing.JTextField();
        txt_edad = new javax.swing.JTextField();
        btn_buscarP = new javax.swing.JButton();
        cbx_medicamento = new javax.swing.JComboBox<>();
        btn_guardar = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();
        txt_N = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("N°");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, -1, -1));

        txt_id.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txt_id.setText("jLabel1");
        jPanel1.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, -1, -1));

        jLabel1.setText("CANTIDAD");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, -1, -1));

        txt_buscarP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_buscarPKeyTyped(evt);
            }
        });
        jPanel1.add(txt_buscarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 220, -1));

        btn_agregarMed.setText("AGREGAR");
        btn_agregarMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarMedActionPerformed(evt);
            }
        });
        jPanel1.add(btn_agregarMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("DATOS DEL PACIENTE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        txt_NomMed.setEditable(false);
        jPanel1.add(txt_NomMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 120, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("MEDICAMENTOS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        txt_cantidad.setEditable(false);
        txt_cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cantidadKeyTyped(evt);
            }
        });
        jPanel1.add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 90, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Ingrese ID/nombre:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));
        jPanel1.add(txt_idNameMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 130, -1));

        btn_buscarMed.setText("Buscar");
        btn_buscarMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarMedActionPerformed(evt);
            }
        });
        jPanel1.add(btn_buscarMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, -1));

        btn_eliminarMed.setText("ELIMINAR MEDICAMENTO");
        btn_eliminarMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarMedActionPerformed(evt);
            }
        });
        jPanel1.add(btn_eliminarMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("INDICACIONES");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, -1, -1));

        txt_fecha.setEditable(false);
        jPanel1.add(txt_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 130, -1));

        table_medicamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table_medicamentos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 300, 150));
        jPanel1.add(txt_indicaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 350, 260));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("NOMBRES Y APELLIDOS:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("EDAD");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("EDAD");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        jLabel11.setText("NOMBRE");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("FECHA DE PRESCRIPCIÓN:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Ingrese CI del Paciente:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        txt_NomApe.setEditable(false);
        jPanel1.add(txt_NomApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 240, -1));

        txt_edad.setEditable(false);
        txt_edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_edadActionPerformed(evt);
            }
        });
        jPanel1.add(txt_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 90, -1));

        btn_buscarP.setText("Buscar");
        btn_buscarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarPActionPerformed(evt);
            }
        });
        jPanel1.add(btn_buscarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));

        cbx_medicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_medicamentoActionPerformed(evt);
            }
        });
        jPanel1.add(cbx_medicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 120, -1));

        btn_guardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_guardar.setText("GUARDAR");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 630, 130, -1));

        btn_regresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_regresar.setText("REGRESAR");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 630, 110, 30));

        txt_N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/pngCrearRM.png"))); // NOI18N
        jPanel1.add(txt_N, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarMedActionPerformed
        if (!txt_NomMed.getText().isEmpty() && !txt_cantidad.getText().isEmpty()) {
            Medicamento medicamento = null;
            if (txt_idNameMed.getText().matches("\\d+")) {
                // Búsqueda por ID
                medicamento = con.buscarMedicamento(txt_idNameMed.getText(), cbx_medicamento);
            } else if (!txt_idNameMed.getText().isEmpty()) {
                // Búsqueda por nombre
                medicamento = (Medicamento) cbx_medicamento.getSelectedItem();
            }

            if (medicamento != null) {
                int cantidad = Integer.parseInt(txt_cantidad.getText());
                if (cantidad >= 0) {
                    // Obtener el stock inicial del medicamento
                    int stockInicial = con.obtenerStockMedicamento(medicamento.nombre);
                    int stockDisponible = stockMedicamentos.getOrDefault(medicamento.nombre, stockInicial);

                    if (cantidad <= stockDisponible) {
                        DefaultTableModel model = (DefaultTableModel) table_medicamentos.getModel();
                        boolean medicamentoExistente = false;
                        for (int i = 0; i < model.getRowCount(); i++) {
                            String nombreTabla = (String) model.getValueAt(i, 0);
                            if (nombreTabla.equals(medicamento.nombre)) {
                                // Ya existe el medicamento, suma la cantidad
                                int cantidadExistente = (int) model.getValueAt(i, 1);
                                model.setValueAt(cantidadExistente + cantidad, i, 1);
                                medicamentoExistente = true;
                                break;
                            }
                        }
                        if (!medicamentoExistente) {
                            // No existe en la tabla, agrega una nueva fila
                            Object[] rowData = {medicamento.nombre, cantidad};
                            model.addRow(rowData);
                        }

                        // Actualiza el stock en el mapa
                        stockMedicamentos.put(medicamento.nombre, stockDisponible - cantidad);

                        // Limpia los campos
                        txt_idNameMed.setText("");
                        txt_NomMed.setText("");
                        txt_cantidad.setText("");
                        cbx_medicamento.removeAllItems();

                        // Agrega el medicamento a la lista y actualiza la cantidad total
                        agregarMedicamentoALista(medicamento, cantidad);
                    } else {
                        JOptionPane.showMessageDialog(null, "La cantidad ingresada supera el stock disponible.\n Stock Disponible: "+ stockDisponible);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La cantidad debe ser un número positivo.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un medicamento válido.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Uno o más campos están vacíos.");
        }

 
    }//GEN-LAST:event_btn_agregarMedActionPerformed

    private void btn_buscarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarPActionPerformed
        Paciente paciente = con.obtenerPacientePorCedula(txt_buscarP.getText());
        if (paciente != null) {

            this.txt_NomApe.setText(paciente.nombre + " " + paciente.apellido);
            this.txt_edad.setText(Integer.toString(paciente.edad()));
            this.pacR = new Paciente(paciente.nombre, paciente.apellido, paciente.cedula,
                    paciente.fechaNaci, paciente.tipoSagre, paciente.genero, paciente.altura,
                    paciente.peso, paciente.antededentes);

        } else {
            JOptionPane.showMessageDialog(null, "No existe un paciente registrado con este id");
        }
    }//GEN-LAST:event_btn_buscarPActionPerformed

    private void txt_edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_edadActionPerformed

    private void btn_buscarMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarMedActionPerformed
        Medicamento medicamento = null;
        if (txt_idNameMed.getText().matches("\\d+")) {
            medicamento = con.buscarMedicamento(txt_idNameMed.getText(), cbx_medicamento);
            if (medicamento != null) {
                // Búsqueda por ID exitosa
                this.txt_NomMed.setText(medicamento.nombre);
                this.txt_cantidad.setEditable(true);
                this.cbx_medicamento.removeAllItems();
            } else {
                // No se encontró un medicamento con el ID proporcionado
                JOptionPane.showMessageDialog(null, "No existe un medicamento registrado con este ID");
                this.txt_idNameMed.setText("");
                this.txt_NomMed.setText("");
            }
        } else if (!txt_idNameMed.getText().isEmpty()) {
            // Si no es un número y no está vacío, es un nombre
            con.llenarComboRM(cbx_medicamento, txt_idNameMed.getText());
            this.txt_cantidad.setEditable(true);

        } else {
            // Si no coincide con ID ni con nombre y está vacío
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID o un nombre válido");

        }


    }//GEN-LAST:event_btn_buscarMedActionPerformed

    private void cbx_medicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_medicamentoActionPerformed
        if (cbx_medicamento.getItemCount() > 0) {
            Medicamento med = (Medicamento) cbx_medicamento.getSelectedItem();
            this.txt_NomMed.setText(med.nombre);
        }

    }//GEN-LAST:event_cbx_medicamentoActionPerformed

    private void btn_eliminarMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarMedActionPerformed
        // Obtén la fila seleccionada
        int selectedRow = table_medicamentos.getSelectedRow();

        // Asegúrate de que se haya seleccionado una fila
        if (selectedRow >= 0) {
            // Elimina la fila de la tabla
            DefaultTableModel model = (DefaultTableModel) table_medicamentos.getModel();
            String nombreMedicamento = (String) model.getValueAt(selectedRow, 0);
            model.removeRow(selectedRow);

            // Elimina el medicamento de la lista y actualiza la cantidad total
            eliminarMedicamentoDeLista(nombreMedicamento);
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona un medicamento para eliminar.");
        }

    }//GEN-LAST:event_btn_eliminarMedActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        if (validarCampos()) {
            RecetaMedica receta = new RecetaMedica(txt_id.getText(), pacR, txt_indicaciones.getText(), LocalDate.parse(txt_fecha.getText(), formatter), this.obtenerCantidadTotal());

            if (con.guardarRecM(receta) == true) {
                JOptionPane.showMessageDialog(null, "Receta Guardada");
                if (formularioAnterior instanceof FrmMenuRM) {
                    ((FrmMenuRM) formularioAnterior).setVisible(true);
                } else if (formularioAnterior instanceof FrmBuscarRM) {
                    ((FrmBuscarRM) formularioAnterior).setVisible(true);
                    ((FrmBuscarRM) formularioAnterior).con.llenarTablaRecetas(((FrmBuscarRM) formularioAnterior).table_recetas);
                }
                medicamentosList.clear();
                this.dispose();
                // Cierra el frame actual

            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos antes de continuar.");
        }

    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        if (formularioAnterior instanceof FrmMenuRM) {
            ((FrmMenuRM) formularioAnterior).setVisible(true);
        } else if (formularioAnterior instanceof FrmBuscarRM) {
            ((FrmBuscarRM) formularioAnterior).setVisible(true);
        }

        // Cierra el formulario actual
        this.dispose();

    }//GEN-LAST:event_btn_regresarActionPerformed

    private void txt_buscarPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarPKeyTyped
        if (evt.getSource() == this.txt_buscarP) {
            char c = evt.getKeyChar();
            // Permite dígitos
            if (!Character.isDigit(c)) {
                evt.consume(); // Consume el evento si el carácter no es un dígito 
            }
        }
    }//GEN-LAST:event_txt_buscarPKeyTyped

    private void txt_cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cantidadKeyTyped
       if (evt.getSource() == this.txt_cantidad) {
            char c = evt.getKeyChar();
            // Permite dígitos
            if (!Character.isDigit(c)) {
                evt.consume(); // Consume el evento si el carácter no es un dígito 
            }
        }
    }//GEN-LAST:event_txt_cantidadKeyTyped

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
            java.util.logging.Logger.getLogger(FrmCrearRM.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCrearRM.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCrearRM.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCrearRM.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCrearRM().setVisible(true);
            }
        });
    }

    private void agregarMedicamentoALista(Medicamento medicamento, int cantidad) {
        boolean medicamentoExistente = false;
        for (Medicamento med : medicamentosList) {
            if (med.nombre.equals(medicamento.nombre)) {
                // Ya existe en la lista, suma la cantidad
                med.setCantidad(med.cantidad + cantidad);
                medicamentoExistente = true;
                break;
            }
        }
        if (!medicamentoExistente) {
            // No existe en la lista, agrégalo
            medicamento.setCantidad(cantidad);
            medicamento.setNumRM(txt_id.getText());
            medicamentosList.add(medicamento);
        }
    }

    private void eliminarMedicamentoDeLista(String nombreMedicamento) {
        for (int i = 0; i < medicamentosList.size(); i++) {
            if (medicamentosList.get(i).nombre.equals(nombreMedicamento)) {
                // Elimina el medicamento de la lista
                medicamentosList.remove(i);
                break;
            }
        }
    }

    private int obtenerCantidadTotal() {
        int total = 0;
        for (Medicamento medicamento : medicamentosList) {
            total += medicamento.cantidad;
        }
        return total;
    }

    private boolean validarCampos() {
        String buscarP = txt_buscarP.getText();
        String nomApe = txt_NomApe.getText();
        String edad = txt_edad.getText();
        String indicaciones = txt_indicaciones.getText();
        int rowCount = table_medicamentos.getModel().getRowCount();

        return !buscarP.isEmpty() && !nomApe.isEmpty() && !edad.isEmpty() && rowCount > 0 && !indicaciones.isEmpty();
    }

    public boolean actualizarMedicamentoEnLista(Medicamento medicamento, int cantidad) {
        boolean medicamentoArrayListExistente = false;
        for (Medicamento med : medicamentosList) {
            if (med.nombre.equals(medicamento.nombre)) {
                // Ya existe en el ArrayList, suma la cantidad
                med.setCantidad(med.cantidad + cantidad);
                medicamentoArrayListExistente = true;
                break;
            }
        }
        return medicamentoArrayListExistente;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregarMed;
    private javax.swing.JButton btn_buscarMed;
    private javax.swing.JButton btn_buscarP;
    private javax.swing.JButton btn_eliminarMed;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JComboBox<Medicamento> cbx_medicamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_medicamentos;
    private javax.swing.JLabel txt_N;
    private javax.swing.JTextField txt_NomApe;
    private javax.swing.JTextField txt_NomMed;
    private javax.swing.JTextField txt_buscarP;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_edad;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JLabel txt_id;
    private javax.swing.JTextField txt_idNameMed;
    private javax.swing.JTextField txt_indicaciones;
    // End of variables declaration//GEN-END:variables
}
