package Modelos;

import Controladores.ConnectionDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class ModelosCliente {

    public ModelosCliente() {
    }

    public List<Cliente> obtenerTodosClientes() throws SQLException {
        // Usa la conexión del objeto connectionDB
        return obtenerClientesDesdeBD("SELECT * FROM CLIENTE");
    }

    public List<Cliente> buscarClientes(String textoBuscar) throws SQLException {
        String consulta = "SELECT * FROM CLIENTE WHERE nombre LIKE ? OR apellido LIKE ?";
        return obtenerClientesDesdeBD(consulta, "%" + textoBuscar + "%", "%" + textoBuscar + "%");
    }

    private List<Cliente> obtenerClientesDesdeBD(String consulta, String... parametros) throws SQLException {
        List<Cliente> clientes = new ArrayList<>();

        try (Connection conexion = ConnectionDB.obtenerConexion(); PreparedStatement statement = conexion.prepareStatement(consulta)) {

            // Establecer los parámetros de la consulta
            for (int i = 0; i < parametros.length; i++) {
                statement.setString(i + 1, parametros[i]);
            }

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int idCliente = resultSet.getInt("id_cliente");
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");
                String tipoDocIdentidad = resultSet.getString("tipo_doc_identidad");
                String numDocIdentidad = resultSet.getString("num_doc_identidad");
                String telefono = resultSet.getString("telefono");
                String email = resultSet.getString("email");
                String contraseña = resultSet.getString("contraseña");
                String sexo = resultSet.getString("sexo");
                Date fechaNacimiento = resultSet.getDate("fecha_nacimiento");

                Cliente cliente = new Cliente(idCliente, nombre, apellido, tipoDocIdentidad,
                        numDocIdentidad, telefono, email, contraseña, sexo, fechaNacimiento);
                clientes.add(cliente);
            }
        } finally {
            // Cerrar la conexión después de usarla
            ConnectionDB.cerrarConexion();
        }

        return clientes;
    }

    public void eliminarCliente(int idCliente) throws SQLException {
        String consulta = "DELETE FROM CLIENTE WHERE id_cliente = ?";

        try (Connection conexion = ConnectionDB.obtenerConexion(); PreparedStatement statement = conexion.prepareStatement(consulta)) {

            statement.setInt(1, idCliente);
            int filasAfectadas = statement.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Cliente eliminado exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un cliente con el ID especificado", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(  null, "No se puede eliminar el cliente debido a restricciones de clave externa", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al intentar eliminar el cliente, debido a que cuenta con campos asociados", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionDB.cerrarConexion();
        }
    }

    public boolean insertarCliente(Cliente cliente) throws SQLException {
        boolean flag = true;
        try {
            String consulta = "INSERT INTO CLIENTE (id_cliente, nombre, apellido, tipo_doc_identidad, num_doc_identidad, telefono, email, contraseña, sexo, fecha_nacimiento) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            try (Connection conexion = ConnectionDB.obtenerConexion(); PreparedStatement statement = conexion.prepareStatement(consulta)) {

                // Obtener el último ID existente en la tabla
                int ultimoId = obtenerUltimoIdCliente();
                //int ultimoId = 14;
                System.out.println("ULTIMO ID: "+ultimoId);

                // Asignar el próximo ID al nuevo cliente
                cliente.setIdCliente(ultimoId + 1);

                statement.setInt(1, cliente.getIdCliente());
                statement.setString(2, cliente.getNombre());
                statement.setString(3, cliente.getApellido());
                statement.setString(4, cliente.getTipoDocIdentidad());
                statement.setString(5, cliente.getNumDocIdentidad());
                statement.setString(6, cliente.getTelefono());
                statement.setString(7, cliente.getEmail());
                statement.setString(8, cliente.getContraseña());
                statement.setString(9, cliente.getSexo());
                statement.setDate(10, new java.sql.Date(cliente.getFechaNacimiento().getTime()));

                System.out.println(statement.toString());
                int filasAfectadas = statement.executeUpdate();

                if (filasAfectadas > 0) {
                    JOptionPane.showMessageDialog(null, "Cliente registrado exitosamente");
                    flag = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Error al intentar registrar el cliente", "Error", JOptionPane.ERROR_MESSAGE);
                    flag = false;
                }

            } finally {
                ConnectionDB.cerrarConexion();
            }
            return flag;
            
        } catch (SQLException ex) {
            // Manejar la excepción, si es necesario
            //Logger.getLogger(NewCliente.class.getName()).log(Level.SEVERE, null, ex);
            // Si la inserción falla, devolver false
            return false;

        }

    }

   private int obtenerUltimoIdCliente() throws SQLException {
    Connection conexion = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;

    try {
        // Establecer la conexión a la base de datos
        conexion = ConnectionDB.obtenerConexion();

        // Consulta SQL para obtener el último ID de la tabla cliente
        String sql = "SELECT MAX(id_cliente) AS ultimo_id FROM cliente";
        statement = conexion.prepareStatement(sql);
        resultSet = statement.executeQuery();

        // Obtener el último ID
        if (resultSet.next()) {
            return resultSet.getInt("ultimo_id");
        } else {
            // Si no hay registros en la tabla, devolver 0
            return 0;
        }
    } finally {
        // Cerrar recursos después de obtener el resultado
        if (resultSet != null) {
            resultSet.close();
        }
        if (statement != null) {
            statement.close();
        }
        // No cierres la conexión aquí, hazlo después de utilizar el último ID
    }
}
   
   public boolean actualizarCliente(Cliente cliente) throws SQLException {
    try {
        // Consulta SQL para actualizar un cliente
        String consulta = "UPDATE CLIENTE SET nombre=?, apellido=?, tipo_doc_identidad=?, num_doc_identidad=?, "
                + "telefono=?, email=?, contraseña=?, sexo=?, fecha_nacimiento=? WHERE id_cliente=?";

        try (Connection conexion = ConnectionDB.obtenerConexion(); PreparedStatement statement = conexion.prepareStatement(consulta)) {

            statement.setString(1, cliente.getNombre());
            statement.setString(2, cliente.getApellido());
            statement.setString(3, cliente.getTipoDocIdentidad());
            statement.setString(4, cliente.getNumDocIdentidad());
            statement.setString(5, cliente.getTelefono());
            statement.setString(6, cliente.getEmail());
            statement.setString(7, cliente.getContraseña());
            statement.setString(8, cliente.getSexo());
            statement.setDate(9, new java.sql.Date(cliente.getFechaNacimiento().getTime()));
            statement.setInt(10, cliente.getIdCliente());

            int filasAfectadas = statement.executeUpdate();

            if (filasAfectadas > 0) {
                return true;
            } else {
                return false;
            }
        } finally {
            ConnectionDB.cerrarConexion();
        }
    } catch (SQLException ex) {
        // Manejar la excepción, si es necesario
        // Logger.getLogger(NewCliente.class.getName()).log(Level.SEVERE, null, ex);
        // Si la actualización falla, devolver false
        return false;
    }
}


}
