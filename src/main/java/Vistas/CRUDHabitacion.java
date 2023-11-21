package Vistas;

import Modelos.ModeloHabitacion;

import Modelos.Habitacion;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author omarperez
 */
public class CRUDHabitacion extends javax.swing.JFrame {

    private final ModeloHabitacion modelo;

    public CRUDHabitacion() {
        initComponents();
        setLocationRelativeTo(null); // Centrar en la pantalla
        modelo = new ModeloHabitacion();
        cargarDatosEnTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButtonNuevo = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jTextFieldBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonVolver = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonNuevo.setText("Nuevo");
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEliminarMouseClicked(evt);
            }
        });

        jTextFieldBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldBuscarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonNuevo)
                .addGap(18, 18, 18)
                .addComponent(jButtonModificar)
                .addGap(18, 18, 18)
                .addComponent(jButtonEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNuevo)
                    .addComponent(jButtonModificar)
                    .addComponent(jButtonEliminar)
                    .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel1.setText(" CRUD Habitación");

        jButtonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/volver-flecha.png"))); // NOI18N
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "ID Tipo", "Disponibilidad", "Piso"
            }
        ));
        jScrollPane2.setViewportView(jTableDatos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        nuevo();
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jTextFieldBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscarKeyTyped
        buscar();
    }//GEN-LAST:event_jTextFieldBuscarKeyTyped

    private void jButtonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarMouseClicked
        eliminar();
    }//GEN-LAST:event_jButtonEliminarMouseClicked

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        modificar();
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        this.dispose();
        MenuTemporal menu = new MenuTemporal();
        menu.setVisible(true);
    }//GEN-LAST:event_jButtonVolverActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDHabitacion().setVisible(true);
            }
        });
    }

    private void cargarDatosEnTabla() {
        try {
            List<Habitacion> datos = modelo.obtenerTodos();
            //System.out.println(datos);
            DefaultTableModel model = (DefaultTableModel) jTableDatos.getModel();
            model.setRowCount(0); // Limpiar la tabla antes de cargar nuevos datos

            for (Habitacion dato : datos) {
                
                Object[] fila = {
                    dato.getNumeroHabitacion(),
                    dato.getIdTipo(),
                    dato.isEstadoOcupacion()?"Disponible":"No disponible",
                    dato.getPiso()
                };
                model.addRow(fila);
            }

        } catch (SQLException e) {
            // Manejar el error
        }
    }

    private void buscar() {
        try {
            String textoBuscar = jTextFieldBuscar.getText();
            List<Habitacion> datos = modelo.buscar(textoBuscar);

            DefaultTableModel model = (DefaultTableModel) jTableDatos.getModel();
            model.setRowCount(0); // Limpiar la tabla antes de cargar nuevos datos

            for (Habitacion dato : datos) {
                Object[] fila = {
                    dato.getNumeroHabitacion(),
                    dato.getIdTipo(),
                    dato.isEstadoOcupacion(),
                    dato.getPiso()
                };
                model.addRow(fila);
            }

        } catch (SQLException e) {
            // Manejar el error

        }
    }

    private void eliminar() {
        int filaSeleccionada = jTableDatos.getSelectedRow();

        if (filaSeleccionada != -1) {
            int confirmacion = JOptionPane.showConfirmDialog(this,
                    "¿Seguro que deseas eliminar este tipo de habitación?",
                    "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                try {
                    int id = (int) jTableDatos.getValueAt(filaSeleccionada, 0);
                    modelo.eliminar(id);

                    // Actualizar la tabla después de eliminar la fila
                    cargarDatosEnTabla();

                } catch (SQLException e) {
                    // Manejar el error

                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una fila para eliminar.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void modificar() {
        int filaSeleccionada = jTableDatos.getSelectedRow();

        if (filaSeleccionada != -1) {
            // Obtener datos de la fila seleccionada
            int id = (int) jTableDatos.getValueAt(filaSeleccionada, 0);
            int idTipo = (int) jTableDatos.getValueAt(filaSeleccionada, 1);
            String disponibilidad = (String) jTableDatos.getValueAt(filaSeleccionada, 2);
            boolean disponible = disponibilidad.equals("Disponible") ? true : false;

            int piso = (int) jTableDatos.getValueAt(filaSeleccionada, 3);

            // Crear un objeto Habitacion con los datos obtenidos
            Habitacion obj = new Habitacion(id, idTipo, disponible,piso);

            // Crear y mostrar el formulario NewHabitacion con los datos del Habitacion
            NewHabitacion newForm = new NewHabitacion();
            newForm.setDatos(obj);
            newForm.setModoEdicion(true, id);
            newForm.setLocationRelativeTo(null); // Centrar en la pantalla
            newForm.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    cargarDatosEnTabla(); // Actualizar la tabla después de cerrar el formulario
                }
            });
            newForm.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una fila para modificar.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void nuevo() {
        NewHabitacion newForm = new NewHabitacion();
        newForm.setLocationRelativeTo(null); // Centrar en la pantalla
        // Agregar un WindowListener al formulario llamado
        newForm.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                // Este método se llamará cuando el formulario llamado se cierre con dispose()
                System.out.println("El formulario llamado se ha cerrado con dispose()");

                // Realiza aquí las acciones que deseas después de cerrar el formulario llamado
                cargarDatosEnTabla();
            }
        });
        newForm.setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableDatos;
    private javax.swing.JTextField jTextFieldBuscar;
    // End of variables declaration//GEN-END:variables
}
