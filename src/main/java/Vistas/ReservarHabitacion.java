package Vistas;

import Controladores.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author omarperez
 */
public class ReservarHabitacion extends javax.swing.JPanel {

    private Date fechaLlegada = null;
    private Date fechaSalida = null;
    private String tipoHabitacion = null;
    private int idHabitacion = 0;
    private int idCliente = 0;

    public ReservarHabitacion(int idCliente) {
        this.idCliente = idCliente;
        System.out.println(idCliente);
        initComponents();

        this.jTextFieldNombreAcompañanteUno.setEnabled(false);
        this.jTextFieldApellidoAcompañanteUno.setEnabled(false);
        this.jTextFieldNombreAcompañanteDos.setEnabled(false);
        this.jTextFieldApellidoAcompañanteDos.setEnabled(false);
        this.jButtonConfirmarReserva.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelContenido = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButtonVerificarDisponibilidad = new javax.swing.JButton();
        jDateChooserFechaLlegada = new com.toedter.calendar.JDateChooser();
        jDateChooserFechaSalida = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxTipoHabitacion = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaBoleta = new javax.swing.JTextArea();
        jButtonConfirmarReserva = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNombreAcompañanteUno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldApellidoAcompañanteUno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldApellidoAcompañanteDos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldNombreAcompañanteDos = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanelContenido.setBackground(new java.awt.Color(255, 255, 255));
        jPanelContenido.setPreferredSize(new java.awt.Dimension(703, 504));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel2.setText("Generar reserva");

        jButtonVerificarDisponibilidad.setText("Verificar disponibilidad");
        jButtonVerificarDisponibilidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVerificarDisponibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificarDisponibilidadActionPerformed(evt);
            }
        });

        jLabel1.setText("Llegada: ");

        jLabel5.setText("Salida:");

        jComboBoxTipoHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Individual", "Doble", "Triple" }));

        jLabel3.setText("Tipo de Habitación: ");

        jTextAreaBoleta.setColumns(20);
        jTextAreaBoleta.setRows(5);
        jScrollPane1.setViewportView(jTextAreaBoleta);

        jButtonConfirmarReserva.setText("Confirmar reserva");
        jButtonConfirmarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarReservaActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre:");

        jLabel6.setText("Apellido:");

        jLabel7.setText("Acompañantes:");

        jLabel8.setText("Apellido:");

        jLabel9.setText("Nombre:");

        javax.swing.GroupLayout jPanelContenidoLayout = new javax.swing.GroupLayout(jPanelContenido);
        jPanelContenido.setLayout(jPanelContenidoLayout);
        jPanelContenidoLayout.setHorizontalGroup(
            jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenidoLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContenidoLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooserFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonVerificarDisponibilidad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelContenidoLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(jComboBoxTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelContenidoLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(jDateChooserFechaLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanelContenidoLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNombreAcompañanteUno, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldApellidoAcompañanteUno, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelContenidoLayout.createSequentialGroup()
                                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonConfirmarReserva)
                                    .addGroup(jPanelContenidoLayout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldNombreAcompañanteDos, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldApellidoAcompañanteDos, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(jPanelContenidoLayout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelContenidoLayout.setVerticalGroup(
            jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jDateChooserFechaLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooserFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(jButtonVerificarDisponibilidad))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(21, 21, 21)
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldNombreAcompañanteUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldApellidoAcompañanteUno, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldNombreAcompañanteDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldApellidoAcompañanteDos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButtonConfirmarReserva)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)))
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

    private void jButtonVerificarDisponibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarDisponibilidadActionPerformed
        // Obtener los datos seleccionados por el usuario
        fechaLlegada = jDateChooserFechaLlegada.getDate();
        fechaSalida = jDateChooserFechaSalida.getDate();
        tipoHabitacion = (String) jComboBoxTipoHabitacion.getSelectedItem();

        // Validar que las fechas sean correctas
        if (fechaLlegada == null || fechaSalida == null || fechaLlegada.after(fechaSalida)) {
            JOptionPane.showMessageDialog(this, "Selecciona fechas válidas.");
            limpiarFormulario();
            return;
        }

        // Consultar la disponibilidad de habitaciones
        if (consultarDisponibilidad(tipoHabitacion, fechaLlegada, fechaSalida)) {
            // Calcular el costo de la reserva
            double costoReserva = calcularCostoReserva(tipoHabitacion, fechaLlegada, fechaSalida);
            if (tipoHabitacion.equals("Doble")) {
                this.jTextFieldNombreAcompañanteUno.setEnabled(true);
                this.jTextFieldApellidoAcompañanteUno.setEnabled(true);
            } else if (tipoHabitacion.equals("Triple")) {
                this.jTextFieldNombreAcompañanteUno.setEnabled(true);
                this.jTextFieldApellidoAcompañanteUno.setEnabled(true);
                this.jTextFieldNombreAcompañanteDos.setEnabled(true);
                this.jTextFieldApellidoAcompañanteDos.setEnabled(true);
            } else {
                this.jTextFieldNombreAcompañanteUno.setEnabled(false);
                this.jTextFieldApellidoAcompañanteUno.setEnabled(false);
                this.jTextFieldNombreAcompañanteDos.setEnabled(false);
                this.jTextFieldApellidoAcompañanteDos.setEnabled(false);
            }
            // Mostrar la información en el área de texto
            jTextAreaBoleta.setText("Resumen de la Reserva:\n"
                    + "Fecha de Llegada: " + formatDate(fechaLlegada) + "\n"
                    + "Fecha de Salida: " + formatDate(fechaSalida) + "\n"
                    + "Número de Habitación: " + idHabitacion + "\n"
                    + "Tipo de Habitación: " + tipoHabitacion + "\n"
                    + "Costo de la Reserva: $" + costoReserva);
            this.jButtonConfirmarReserva.setEnabled(true);

        } else {
            limpiarFormulario();
            JOptionPane.showMessageDialog(this, "No hay habitaciones disponibles para las fechas seleccionadas.");
            this.jButtonConfirmarReserva.setEnabled(false);

            this.jTextFieldNombreAcompañanteUno.setEnabled(false);
            this.jTextFieldApellidoAcompañanteUno.setEnabled(false);
            this.jTextFieldNombreAcompañanteDos.setEnabled(false);
            this.jTextFieldApellidoAcompañanteDos.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonVerificarDisponibilidadActionPerformed

    private void jButtonConfirmarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarReservaActionPerformed
        int idReserva = insertarReserva();

        int idDetalleReserva = insertarDetalleReserva(idReserva, fechaLlegada, fechaSalida);

        if (idDetalleReserva > 0) {
            double costoReserva = calcularCostoReserva(tipoHabitacion, fechaLlegada, fechaSalida);
            insertarBoleta(idDetalleReserva, costoReserva);
        }
// Insertar acompañantes
        if (tipoHabitacion.equals("Doble")) {
            insertarAcompanantes(idDetalleReserva,
                    jTextFieldNombreAcompañanteUno.getText(),
                    jTextFieldApellidoAcompañanteUno.getText(),
                    "", "");
        } else if (tipoHabitacion.equals("Triple")) {
            insertarAcompanantes(idDetalleReserva,
                    jTextFieldNombreAcompañanteUno.getText(),
                    jTextFieldApellidoAcompañanteUno.getText(),
                    jTextFieldNombreAcompañanteDos.getText(),
                    jTextFieldApellidoAcompañanteDos.getText());
        }
    }//GEN-LAST:event_jButtonConfirmarReservaActionPerformed
// Método para consultar la disponibilidad de habitaciones y obtener el id_habitacion

    private int obtenerIdHabitacionDisponible(String tipoHabitacion, Date fechaLlegada, Date fechaSalida) {

        try (Connection conexion = ConnectionDB.obtenerConexion(); PreparedStatement statement = conexion.prepareStatement(
                "SELECT TOP 1 numero_habitacion FROM HABITACION "
                + "WHERE id_tipo = (SELECT id_tipo FROM TIPO_HABITACION WHERE descripcion = ?) "
                + "AND estado_ocupacion = 0 "
                + "AND numero_habitacion NOT IN ("
                + "    SELECT id_habitacion FROM DETALLE_RESERVA "
                + "    WHERE (fecha_salida > ? AND fecha_entrada < ?)"
                + ")")) {

            statement.setString(1, tipoHabitacion);
            statement.setObject(2, fechaLlegada);
            statement.setObject(3, fechaSalida);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                idHabitacion = resultSet.getInt("numero_habitacion");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.cerrarConexion();
        }

        return idHabitacion;
    }

    // Método para consultar la disponibilidad de habitaciones
    private boolean consultarDisponibilidad(String tipoHabitacion, Date fechaLlegada, Date fechaSalida) {
        try (Connection conexion = ConnectionDB.obtenerConexion(); PreparedStatement statement = conexion.prepareStatement(
                "SELECT COUNT(*) FROM HABITACION "
                + "WHERE id_tipo = (SELECT id_tipo FROM TIPO_HABITACION WHERE descripcion = ?) "
                + "AND (estado_ocupacion IS NULL OR estado_ocupacion = 0) "
                + "AND numero_habitacion NOT IN ("
                + "    SELECT id_habitacion FROM DETALLE_RESERVA "
                + "    WHERE (fecha_salida > ? AND fecha_entrada < ?)"
                + ")"
        )) {

            statement.setString(1, tipoHabitacion);
            statement.setObject(2, fechaLlegada);
            statement.setObject(3, fechaSalida);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int cantidadDisponible = resultSet.getInt(1);

                // Verificar que existan al menos una habitación disponible del tipo seleccionado
                if (cantidadDisponible >= 1) {
                    return true;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.cerrarConexion();
        }

        return false;
    }

    private double calcularCostoReserva(String tipoHabitacion, Date fechaLlegada, Date fechaSalida) {
        double costo = 0.0;

        try (Connection connection = ConnectionDB.obtenerConexion()) {
            // Consultar el precio del tipo de habitación
            String consultaPrecio = "SELECT precio FROM TIPO_HABITACION WHERE descripcion = ?";
            try (PreparedStatement statement = connection.prepareStatement(consultaPrecio)) {
                statement.setString(1, tipoHabitacion);

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        double precioHabitacion = resultSet.getDouble("precio");

                        // Calcular la cantidad de días de la reserva
                        long diferenciaEnMilisegundos = fechaSalida.getTime() - fechaLlegada.getTime();
                        int diasReserva = (int) (diferenciaEnMilisegundos / (24 * 60 * 60 * 1000));

                        // Calcular el costo total
                        costo = precioHabitacion * diasReserva;
                    }
                }
            }
        } catch (SQLException e) {
            // Manejar la excepción, por ejemplo, mostrar un mensaje de error o registrar en un log
            e.printStackTrace();
        }

        return costo;
    }

    private String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return sdf.format(date);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    private void limpiarFormulario() {
        // Limpiar los campos del formulario
        jDateChooserFechaLlegada.setDate(null);
        jDateChooserFechaSalida.setDate(null);
        jComboBoxTipoHabitacion.setSelectedIndex(0);
        jTextAreaBoleta.setText("");
        jTextFieldNombreAcompañanteUno.setText("");
        jTextFieldApellidoAcompañanteUno.setText("");
        jTextFieldNombreAcompañanteDos.setText("");
        jTextFieldApellidoAcompañanteDos.setText("");
    }

    // Método para insertar en la tabla RESERVA y obtener el ID generado
    private int insertarReserva() {
        int idReserva = 0;

        try (Connection conexion = ConnectionDB.obtenerConexion(); PreparedStatement statement = conexion.prepareStatement(
                "INSERT INTO RESERVA (id_cliente) VALUES (?)",
                PreparedStatement.RETURN_GENERATED_KEYS)) {

            // Puedes obtener el id_cliente de algún lugar (actualmente está como 0)
            statement.setInt(1, this.idCliente);

            int filasAfectadas = statement.executeUpdate();

            if (filasAfectadas > 0) {
                ResultSet rs = statement.getGeneratedKeys();
                if (rs.next()) {
                    idReserva = rs.getInt(1);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.cerrarConexion();
        }

        return idReserva;
    }

    private int insertarDetalleReserva(int idReserva, Date fechaLlegada, Date fechaSalida) {
        int idDetalleReserva = 0;

        idHabitacion = obtenerIdHabitacionDisponible(tipoHabitacion, fechaLlegada, fechaSalida);

        try (Connection conexion = ConnectionDB.obtenerConexion(); PreparedStatement statementDetalleReserva = conexion.prepareStatement(
                "INSERT INTO DETALLE_RESERVA (id_reserva, id_habitacion, fecha_entrada, fecha_salida) VALUES (?, ?, ?, ?)",
                PreparedStatement.RETURN_GENERATED_KEYS)) {

            statementDetalleReserva.setInt(1, idReserva);
            System.out.println("ID HABITACION: " + idHabitacion);
            statementDetalleReserva.setInt(2, idHabitacion);
            statementDetalleReserva.setObject(3, fechaLlegada);
            statementDetalleReserva.setObject(4, fechaSalida);

            int filasAfectadasDetalleReserva = statementDetalleReserva.executeUpdate();

            if (filasAfectadasDetalleReserva > 0) {
                ResultSet rsDetalleReserva = statementDetalleReserva.getGeneratedKeys();
                if (rsDetalleReserva.next()) {
                    idDetalleReserva = rsDetalleReserva.getInt(1);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.cerrarConexion();
        }

        return idDetalleReserva;
    }

    private void insertarBoleta(int idDetalleReserva, double costoReserva) {
        try (Connection conexion = ConnectionDB.obtenerConexion(); PreparedStatement statementBoleta = conexion.prepareStatement(
                "INSERT INTO BOLETA (id_det_reserva, fecha_pago, monto, metodo_pago) VALUES (?, GETDATE(), ?, 'EFECTIVO')")) {
            statementBoleta.setInt(1, idDetalleReserva);
            statementBoleta.setDouble(2, costoReserva);

            statementBoleta.executeUpdate();
            System.out.println("BOLETA GENERADA");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.cerrarConexion();
        }
    }

    private void insertarAcompanantes(int idDetalleReserva, String nombre1, String apellido1, String nombre2, String apellido2) {
    try (Connection conexion = ConnectionDB.obtenerConexion()) {
        // Insertar acompañante 1
        if (!nombre1.isEmpty() && !apellido1.isEmpty()) {
            try (PreparedStatement statementAcompanante1 = conexion.prepareStatement(
                    "INSERT INTO ACOMPAÑANTE (id_det_reserva, nombre, apellido) VALUES (?, ?, ?)")) {

                statementAcompanante1.setInt(1, idDetalleReserva);
                statementAcompanante1.setString(2, nombre1);
                statementAcompanante1.setString(3, apellido1);
                statementAcompanante1.executeUpdate();

                System.out.println("Primer acompañante insertado correctamente");
            }
        }

        // Insertar acompañante 2
        if (!nombre2.isEmpty() && !apellido2.isEmpty()) {
            try (PreparedStatement statementAcompanante2 = conexion.prepareStatement(
                    "INSERT INTO ACOMPAÑANTE (id_det_reserva, nombre, apellido) VALUES (?, ?, ?)")) {

                statementAcompanante2.setInt(1, idDetalleReserva);
                statementAcompanante2.setString(2, nombre2);
                statementAcompanante2.setString(3, apellido2);
                statementAcompanante2.executeUpdate();

                System.out.println("Segundo acompañante insertado correctamente");
            }
        }

    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        ConnectionDB.cerrarConexion();
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirmarReserva;
    private javax.swing.JButton jButtonVerificarDisponibilidad;
    private javax.swing.JComboBox<String> jComboBoxTipoHabitacion;
    private com.toedter.calendar.JDateChooser jDateChooserFechaLlegada;
    private com.toedter.calendar.JDateChooser jDateChooserFechaSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelContenido;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaBoleta;
    private javax.swing.JTextField jTextFieldApellidoAcompañanteDos;
    private javax.swing.JTextField jTextFieldApellidoAcompañanteUno;
    private javax.swing.JTextField jTextFieldNombreAcompañanteDos;
    private javax.swing.JTextField jTextFieldNombreAcompañanteUno;
    // End of variables declaration//GEN-END:variables
}
