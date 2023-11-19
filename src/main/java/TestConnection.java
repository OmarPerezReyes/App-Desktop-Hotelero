import Controladores.ConnectionDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection {

    public static void main(String[] args) {
        // Obtener la conexión desde el controlador
        Connection conexion = ConnectionDB.obtenerConexion();

        if (conexion != null) {
            Statement statement = null;
            try {
                // Crear una declaración SQL
                statement = ConnectionDB.crearStatement();

                // Ejecutar la consulta para obtener todos los datos de la tabla cliente
                String consulta = "SELECT * FROM cliente";
                ResultSet resultSet = statement.executeQuery(consulta);

                // Procesar los resultados
                while (resultSet.next()) {
                    // Supongamos que la tabla tiene columnas "id", "nombre", "apellido", etc.
                    int id = resultSet.getInt("id_cliente");
                    String nombre = resultSet.getString("nombre");
                    String apellido = resultSet.getString("apellido");

                    // Hacer algo con los datos, por ejemplo, imprimirlos en la consola
                    System.out.println("ID: " + id + ", Nombre: " + nombre + ", Apellido: " + apellido);
                }

            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                // Cerrar la conexión después de usarla
                ConnectionDB.cerrarStatement(statement);
            }
        } else {
            System.out.println("La conexión a la base de datos no se ha establecido correctamente.");
        }
    }
}
