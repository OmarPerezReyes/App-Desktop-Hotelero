package Controladores;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConnectionDB {

    private static Connection conexion;

    static {
        try {
            // Cargar el controlador JDBC
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Cargar la configuración de la base de datos desde application.properties
            Properties propiedades = new Properties();
            propiedades.load(ConnectionDB.class.getClassLoader().getResourceAsStream("DatesDB.properties"));

            // Establecer la conexión
            conexion = DriverManager.getConnection(
                    propiedades.getProperty("db.url"),
                    propiedades.getProperty("db.usuario"),
                    propiedades.getProperty("db.contrasena")
            );

        } catch (ClassNotFoundException | SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    public static Connection obtenerConexion() {
        return conexion;
    }

    public static void cerrarConexion() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Statement crearStatement() {
        Statement statement = null;
        try {
            if (conexion != null && !conexion.isClosed()) {
                statement = conexion.createStatement();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statement;
    }

    public static void cerrarStatement(Statement statement) {
        try {
            if (statement != null && !statement.isClosed()) {
                statement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static boolean estaCerrada() {
        try {
            return conexion == null || conexion.isClosed();
        } catch (SQLException e) {
            e.printStackTrace();
            return true;
        }
    }
}
