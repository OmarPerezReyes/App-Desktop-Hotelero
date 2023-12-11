package Vistas;

import Controladores.ConnectionDB;
import Modelos.InicioSesionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author omarperez
 */
public class IniciarSesion extends javax.swing.JPanel {
    private InicioSesionListener inicioSesionListener;
    private int idUsuario = 0;
    public IniciarSesion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelContenido = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jFormattedTextFieldCorreo = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonIniciarSesion = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanelContenido.setBackground(new java.awt.Color(255, 255, 255));
        jPanelContenido.setPreferredSize(new java.awt.Dimension(703, 504));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel2.setText("Iniciar Sesión");

        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });

        jFormattedTextFieldCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCorreoActionPerformed(evt);
            }
        });

        jLabel3.setText("Correo: ");

        jLabel4.setText("Contraseña:");

        jButtonIniciarSesion.setText("Iniciar sesión");
        jButtonIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelContenidoLayout = new javax.swing.GroupLayout(jPanelContenido);
        jPanelContenido.setLayout(jPanelContenidoLayout);
        jPanelContenidoLayout.setHorizontalGroup(
            jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenidoLayout.createSequentialGroup()
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContenidoLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelContenidoLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel2))
                            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPasswordField)
                                .addComponent(jFormattedTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelContenidoLayout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jButtonIniciarSesion)))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanelContenidoLayout.setVerticalGroup(
            jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenidoLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel2)
                .addGap(71, 71, 71)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jButtonIniciarSesion)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 493, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarSesionActionPerformed
        String correo = this.jFormattedTextFieldCorreo.getText();
        char[] contrasenaArray = jPasswordField.getPassword();
        String contrasena = new String(contrasenaArray);
        
        String tipoUsuario = validarInicioSesion(correo, contrasena);

        // Validar las credenciales en la base de datos
        if (tipoUsuario != null) {
            JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso");
            // Notificar al listener que el inicio de sesión fue exitoso
            if (inicioSesionListener != null) {
                inicioSesionListener.onInicioSesionExitoso();
                inicioSesionListener.onTipoUsuario(tipoUsuario);
                inicioSesionListener.onIdUsuario(idUsuario);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error en el inicio de sesión. Verifica el correo y la contraseña.", "Error", JOptionPane.ERROR_MESSAGE);
            limpiarFormulario();
        }
    }//GEN-LAST:event_jButtonIniciarSesionActionPerformed

    private void jFormattedTextFieldCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCorreoActionPerformed

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }
    
    private void limpiarFormulario() {
    // Limpiar los campos del formulario
    jFormattedTextFieldCorreo.setText("");
    jPasswordField.setText("");
}
    public void setInicioSesionListener(InicioSesionListener listener) {
        this.inicioSesionListener = listener;
    }   

// Método para validar las credenciales en la base de datos y obtener el tipo de usuario
    private String validarInicioSesion(String correo, String contrasena) {
        try (Connection conexion = ConnectionDB.obtenerConexion();
             PreparedStatement clienteStatement = conexion.prepareStatement("SELECT id_cliente FROM CLIENTE WHERE email = ? AND contraseña = ?");
             PreparedStatement empleadoStatement = conexion.prepareStatement("SELECT id_empleado FROM EMPLEADO WHERE email = ? AND contraseña = ?")) {

            clienteStatement.setString(1, correo);
            clienteStatement.setString(2, contrasena);
            ResultSet clienteResultSet = clienteStatement.executeQuery();

            empleadoStatement.setString(1, correo);
            empleadoStatement.setString(2, contrasena);
            ResultSet empleadoResultSet = empleadoStatement.executeQuery();

            // Verificar si el usuario es un cliente
            if (clienteResultSet.next()) {
                this.idUsuario = clienteResultSet.getInt("id_cliente");
                return "Cliente";
            } else if (empleadoResultSet.next()) {
                this.idUsuario = empleadoResultSet.getInt("id_empleado");
                return "Empleado";
            }

            // Si no se encuentra ningún usuario, las credenciales no son válidas
            return null;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            ConnectionDB.cerrarConexion();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIniciarSesion;
    private javax.swing.JFormattedTextField jFormattedTextFieldCorreo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelContenido;
    private javax.swing.JPasswordField jPasswordField;
    // End of variables declaration//GEN-END:variables
}
