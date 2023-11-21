package Modelos;

import Controladores.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public abstract class ModeloBaseImpl<T> implements ModeloBase<T> {

    protected abstract String getSelectAllQuery();

    protected abstract String getSearchQuery();

    protected abstract String getDeleteQuery();

    protected abstract String getInsertQuery();

    protected abstract String getUpdateQuery();

    protected abstract String getMaxIdQuery();

    protected abstract T mapResultSetToEntity(ResultSet resultSet) throws SQLException;

    @Override
    public List<T> obtenerTodos() throws SQLException {
        List<T> entidades = new ArrayList<>();

        try (Connection conexion = ConnectionDB.obtenerConexion(); PreparedStatement statement = conexion.prepareStatement(getSelectAllQuery())) {
            ResultSet resultSet = statement.executeQuery();
            System.out.println(resultSet);
            while (resultSet.next()) {
                T entidad = mapResultSetToEntity(resultSet);
                entidades.add(entidad);
            }
        } finally {
            ConnectionDB.cerrarConexion();
        }

        return entidades;
    }

    @Override
    public List<T> buscar(String textoBuscar) throws SQLException {
        List<T> entidades = new ArrayList<>();

        try (Connection conexion = ConnectionDB.obtenerConexion(); PreparedStatement statement = conexion.prepareStatement(getSearchQuery())) {
            statement.setString(1, "%" + textoBuscar + "%");
            statement.setString(2, "%" + textoBuscar + "%");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                T entidad = mapResultSetToEntity(resultSet);
                entidades.add(entidad);
            }
        } finally {
            ConnectionDB.cerrarConexion();
        }

        return entidades;
    }

    @Override
    public void eliminar(int id) throws SQLException {
        try (Connection conexion = ConnectionDB.obtenerConexion(); PreparedStatement statement = conexion.prepareStatement(getDeleteQuery())) {
            statement.setInt(1, id);

            int filasAfectadas = statement.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Elemento eliminado exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un elemento con el ID especificado", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            // Manejar excepciones específicas, si es necesario
            JOptionPane.showMessageDialog(null, "No se puede eliminar debido a que su clave primaria está asociada en otra tabla", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionDB.cerrarConexion();
        }
    }

    @Override
    public int obtenerNuevoId() throws SQLException {
        int nuevoId = 0;

        // Implementación predeterminada para obtener el máximo ID de la tabla
        try (Connection conexion = ConnectionDB.obtenerConexion(); PreparedStatement statement = conexion.prepareStatement(getMaxIdQuery())) {

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                nuevoId = resultSet.getInt(1) + 1;
            }
        }

        return nuevoId;
    }

    @Override
    public boolean insertar(T entidad) throws SQLException {
        boolean flag = true;

        try (Connection conexion = ConnectionDB.obtenerConexion(); PreparedStatement statement = conexion.prepareStatement(getInsertQuery())) {
            mapEntityToStatement(entidad, statement);
            try {
                int filasAfectadas = statement.executeUpdate();

                if (filasAfectadas > 0) {
                    JOptionPane.showMessageDialog(null, "Elemento registrado exitosamente");
                    flag = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Error al intentar registrar el elemento", "Error", JOptionPane.ERROR_MESSAGE);
                    flag = false;
                }

            } catch (SQLException ex) {
                // Captura la excepción SQL
                ex.printStackTrace(); // Imprime el rastreo de la excepción en la consola (puedes comentar esto en producción)

                // Muestra un JOptionPane con el mensaje de error
                JOptionPane.showMessageDialog(null, "Error, la clave foránea no existe", "Error", JOptionPane.ERROR_MESSAGE);
                flag = false;
            }

        } finally {
            ConnectionDB.cerrarConexion();
        }

        return flag;
    }

    @Override
    public boolean actualizar(T entidad) throws SQLException {
        try (Connection conexion = ConnectionDB.obtenerConexion(); PreparedStatement statement = conexion.prepareStatement(getUpdateQuery())) {
            mapEntityToStatement(entidad, statement);

            int filasAfectadas = statement.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Elemento actualizado exitosamente");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Error al intentar actualizar el elemento", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } finally {
            ConnectionDB.cerrarConexion();
        }

    }

    protected abstract void mapEntityToStatement(T entidad, PreparedStatement statement) throws SQLException;
}
