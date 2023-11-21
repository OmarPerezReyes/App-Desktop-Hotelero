package Modelos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author omarperez
 */
public class ModeloHabitacion extends ModeloBaseImpl<Habitacion> {

    @Override
    protected String getSelectAllQuery() {
        return "SELECT * FROM HABITACION";
    }

    @Override
    protected String getSearchQuery() {
        return "SELECT * FROM HABITACION WHERE numero_habitacion LIKE ? OR piso LIKE ? OR (estado_ocupacion = 0 AND 'disponible' LIKE ?)\n"
                + "OR (estado_ocupacion = 1 AND 'no disponible' LIKE ?);";
    }

    @Override
    protected String getDeleteQuery() {
        return "DELETE FROM HABITACION WHERE numero_habitacion = ?";
    }

    @Override
    protected String getInsertQuery() {
        return "INSERT INTO HABITACION (id_tipo, estado_ocupacion, piso, numero_habitacion) "
                + "VALUES (?, ?, ?, ?)";
    }

    @Override
    protected String getUpdateQuery() {
        return "UPDATE HABITACION SET id_tipo=?, estado_ocupacion=?, piso=? WHERE numero_habitacion=?";
    }

    @Override
    protected String getMaxIdQuery() {
        return "SELECT MAX(numero_habitacion) FROM HABITACION";
    }

    @Override
    protected Habitacion mapResultSetToEntity(ResultSet resultSet) throws SQLException {
        int numeroHabitacion = resultSet.getInt("numero_habitacion");
        int idTipo = resultSet.getInt("id_tipo");
        boolean estadoOcupacion = resultSet.getBoolean("estado_ocupacion");
        int piso = resultSet.getInt("piso");
        return new Habitacion(numeroHabitacion, idTipo, estadoOcupacion, piso);
    }

    @Override
    protected void mapEntityToStatement(Habitacion entidad, PreparedStatement statement) throws SQLException {
        statement.setInt(1, entidad.getIdTipo());
        statement.setBoolean(2, entidad.isEstadoOcupacion());
        statement.setInt(3, entidad.getPiso());
        statement.setInt(4, entidad.getNumeroHabitacion());

    }
}
