package Modelos;

import Controladores.ConnectionDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

        try (Connection conexion = ConnectionDB.obtenerConexion();
             PreparedStatement statement = conexion.prepareStatement(consulta)) {

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
}
