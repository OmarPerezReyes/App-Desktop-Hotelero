package Vistas;

import Modelos.Habitacion;
import Modelos.ModeloHabitacion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author omarperez
 */
public class NewHabitacion extends javax.swing.JFrame {

    private boolean modoEdicion;
    private int idEditar;

    public NewHabitacion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jFormattedTextFieldPiso = new javax.swing.JFormattedTextField();
        jComboBoxDisponibilidad = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jFormattedTextFieldIDTipoHab = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel1.setText("Agregar Habitacion");

        jLabel2.setText("Disponibilidad: ");

        jLabel3.setText("Piso:");

        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jButtonRegistrar)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancelar)
                .addGap(11, 11, 11))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegistrar)
                    .addComponent(jButtonCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jFormattedTextFieldPiso.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jComboBoxDisponibilidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "Ocupado" }));

        jLabel4.setText("ID Tipo de Habitación: ");

        jFormattedTextFieldIDTipoHab.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jFormattedTextFieldPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jFormattedTextFieldIDTipoHab, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addComponent(jComboBoxDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBoxDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 78, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jFormattedTextFieldPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jFormattedTextFieldIDTipoHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        registrar();
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        limpiarFormulario();
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewHabitacion().setVisible(true);
            }
        });
    }

    private void limpiarFormulario() {
        jComboBoxDisponibilidad.setSelectedIndex(0);
        jFormattedTextFieldIDTipoHab.setText("");
        jFormattedTextFieldPiso.setText("");
    }

    public void setDatos(Habitacion obj) {
        //false=no disponible;true=disponible
        jComboBoxDisponibilidad.setSelectedItem(obj.isEstadoOcupacion() ? "Disponible" : "Ocupado");
        jFormattedTextFieldIDTipoHab.setText(String.valueOf(obj.getIdTipo()));
        jFormattedTextFieldPiso.setText(String.valueOf(obj.getPiso()));

    }

    public void setModoEdicion(boolean modoEdicion, int idEditar) {
        this.modoEdicion = modoEdicion;
        this.idEditar = idEditar;
        // Cambia el título del formulario según el modo
        if (modoEdicion) {
            jFormattedTextFieldIDTipoHab.setEnabled(false);
            jLabel1.setText("Editar Habitación");
            jButtonRegistrar.setText("Actualizar");
            // Aquí puedes personalizar cualquier otro cambio necesario para el modo de edición
        } else {
            jFormattedTextFieldIDTipoHab.setEnabled(true);

            jLabel1.setText("Agregar Habitación");
            jButtonRegistrar.setText("Registrar");
            // Reinicia el formulario en modo de inserción
            limpiarFormulario();
        }

    }

    private void registrar() {
        try {
            // Obtener los datos del formulario
            String disponibilidad = (String) jComboBoxDisponibilidad.getSelectedItem();
            //disponible=true, no disponible = false
            boolean disponible = disponibilidad.equals("Disponible") ? true : false;
            int piso = Integer.parseInt(jFormattedTextFieldPiso.getText());
            int idTipoHabitacion = Integer.parseInt(jFormattedTextFieldIDTipoHab.getText());

            ModeloHabitacion modelos = new ModeloHabitacion();

            if (modoEdicion) {
                Habitacion editado = new Habitacion(idEditar, idTipoHabitacion, disponible, piso);
                if (modelos.actualizar(editado)) {
                    // Cerrar la ventana después de la edición
                    this.dispose();
                }
            } else {

                // Obtener el nuevo ID basado en el valor máximo actual
                int nuevoId = modelos.obtenerNuevoId();
                Habitacion nuevo = new Habitacion(nuevoId, idTipoHabitacion, disponible, piso);

                // Llamar al método para insertar el Acompañante en la base de datos
                if (modelos.insertar(nuevo)) {
                    limpiarFormulario();
                    // Cerrar la ventana si la inserción es correcta
                    this.dispose();
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(NewHabitacion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JComboBox<String> jComboBoxDisponibilidad;
    private javax.swing.JFormattedTextField jFormattedTextFieldIDTipoHab;
    private javax.swing.JFormattedTextField jFormattedTextFieldPiso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
