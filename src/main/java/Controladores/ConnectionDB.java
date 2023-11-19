package Controladores;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionDB {

    private static Connection conexion;

    static {
        try {
            // Cargar el controlador JDBC
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Cargar la configuración de la base de datos desde application.properties
           
        } catch (ClassNotFoundException e) {
        }
    }

    public static Connection obtenerConexion() {
        try {
             Properties propiedades = new Properties();
            propiedades.load(ConnectionDB.class.getClassLoader().getResourceAsStream("DatesDB.properties"));


            if (conexion == null || conexion.isClosed()) {
                // La conexión está cerrada o es nula, obtén una nueva conexión
                conexion = DriverManager.getConnection(
                        propiedades.getProperty("db.url"),
                        propiedades.getProperty("db.usuario"),
                        propiedades.getProperty("db.contrasena")
                );
            }
        } catch (SQLException e) {
        } catch (IOException ex) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }

    public static void cerrarConexion() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
            }
        } catch (SQLException e) {
        }
    }
}
