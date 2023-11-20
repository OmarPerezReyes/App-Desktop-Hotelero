package Vistas;

import Modelos.ModeloCliente;

import Modelos.Cliente;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author omarperez
 */
public class CRUDCliente extends javax.swing.JFrame {

    private final ModeloCliente modelo;

    public CRUDCliente() {
        initComponents();
        setLocationRelativeTo(null); // Centrar en la pantalla
        modelo = new ModeloCliente();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDatos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

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
                .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido", "Tipo Doc. Identidad", "Número Doc. Identidad", "Teléfono", "Email", "Contraseña", "Sexo", "Fecha de Nacimiento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableDatos);
        if (jTableDatos.getColumnModel().getColumnCount() > 0) {
            jTableDatos.getColumnModel().getColumn(0).setResizable(false);
            jTableDatos.getColumnModel().getColumn(1).setResizable(false);
            jTableDatos.getColumnModel().getColumn(2).setResizable(false);
            jTableDatos.getColumnModel().getColumn(3).setResizable(false);
            jTableDatos.getColumnModel().getColumn(4).setResizable(false);
            jTableDatos.getColumnModel().getColumn(5).setResizable(false);
            jTableDatos.getColumnModel().getColumn(6).setResizable(false);
            jTableDatos.getColumnModel().getColumn(7).setResizable(false);
            jTableDatos.getColumnModel().getColumn(8).setResizable(false);
            jTableDatos.getColumnModel().getColumn(9).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel1.setText(" CRUD Clientes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDCliente().setVisible(true);
            }
        });
    }

    private void cargarDatosEnTabla() {
        try {
            List<Cliente> datos = modelo.obtenerTodos();
            DefaultTableModel model = (DefaultTableModel) jTableDatos.getModel();
            model.setRowCount(0); // Limpiar la tabla antes de cargar nuevos datos

            for (Cliente dato : datos) {
                Object[] fila = {
                    dato.getIdCliente(),
                    dato.getNombre(),
                    dato.getApellido(),
                    dato.getTipoDocIdentidad(),
                    dato.getNumDocIdentidad(),
                    dato.getTelefono(),
                    dato.getEmail(),
                    dato.getContraseña(),
                    dato.getSexo(),
                    dato.getFechaNacimiento()
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
            List<Cliente> datos = modelo.buscar(textoBuscar);

            DefaultTableModel model = (DefaultTableModel) jTableDatos.getModel();
            model.setRowCount(0); // Limpiar la tabla antes de cargar nuevos datos

            for (Cliente dato : datos) {
                Object[] fila = {
                    dato.getIdCliente(),
                    dato.getNombre(),
                    dato.getApellido(),
                    dato.getTipoDocIdentidad(),
                    dato.getNumDocIdentidad(),
                    dato.getTelefono(),
                    dato.getEmail(),
                    dato.getContraseña(),
                    dato.getSexo(),
                    dato.getFechaNacimiento()
                };
                model.addRow(fila);
            }

        } catch (SQLException e) {
            // Manejar el error

        }
    }
    
    private void eliminar(){
         int filaSeleccionada = jTableDatos.getSelectedRow();

        if (filaSeleccionada != -1) {
            int confirmacion = JOptionPane.showConfirmDialog(this,
                    "¿Seguro que deseas eliminar este cliente?",
                    "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
 try {
            int idCliente = (int) jTableDatos.getValueAt(filaSeleccionada, 0);
            // Llamada al método del modelo para eliminar el dato
            modelo.eliminar(idCliente);

            // Actualizar la tabla después de eliminar la fila
            cargarDatosEnTabla();

        } catch (SQLException e) {
            // Manejar el error

        }            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una fila para eliminar.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void nuevo(){
        NewCliente newForm = new NewCliente();
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
    
    private void modificar(){
        int filaSeleccionada = jTableDatos.getSelectedRow();

        if (filaSeleccionada != -1) {
            // Obtener datos de la fila seleccionada
            int id = (int) jTableDatos.getValueAt(filaSeleccionada, 0);
            String nombre = (String) jTableDatos.getValueAt(filaSeleccionada, 1);
            String apellido = (String) jTableDatos.getValueAt(filaSeleccionada, 2);
            String tipoDocIdentidad = (String) jTableDatos.getValueAt(filaSeleccionada, 3);
            String numDocIdentidad = (String) jTableDatos.getValueAt(filaSeleccionada, 4);
            String telefono = (String) jTableDatos.getValueAt(filaSeleccionada, 5);
            String email = (String) jTableDatos.getValueAt(filaSeleccionada, 6);
            String contraseña = (String) jTableDatos.getValueAt(filaSeleccionada, 7);
            String sexo = (String) jTableDatos.getValueAt(filaSeleccionada, 8);
            Date fechaNacimiento = (Date) jTableDatos.getValueAt(filaSeleccionada, 9);

            // Crear un objeto Cliente con los datos obtenidos
            Cliente obj = new Cliente(id, nombre, apellido, tipoDocIdentidad, numDocIdentidad,
                    telefono, email, contraseña, sexo, fechaNacimiento);

            // Crear y mostrar el formulario NewCliente con los datos del dato
            NewCliente newForm = new NewCliente();
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDatos;
    private javax.swing.JTextField jTextFieldBuscar;
    // End of variables declaration//GEN-END:variables
}
