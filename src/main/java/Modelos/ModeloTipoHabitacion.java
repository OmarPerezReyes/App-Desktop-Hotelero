package Modelos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;

/**
 *
 * @author omarperez
 */
public class ModeloTipoHabitacion extends ModeloBaseImpl<TipoHabitacion> {

    @Override
    protected String getSelectAllQuery() {
        return "SELECT * FROM TIPO_HABITACION";
    }

    @Override
    protected String getSearchQuery() {
        return "SELECT * FROM TIPO_HABITACION WHERE precio = ? OR capacidad = ?";
    }

    @Override
    protected String getDeleteQuery() {
        return "DELETE FROM TIPO_HABITACION WHERE id_tipo = ?";
    }

    @Override
    protected String getInsertQuery() {
        return "INSERT INTO TIPO_HABITACION (precio, capacidad, check_in, check_out, id_tipo) "
                + "VALUES (?, ?, ?, ?, ?)";
    }

    @Override
    protected String getUpdateQuery() {
        return "UPDATE TIPO_HABITACION SET precio=?, capacidad=?, check_in=?, check_out=? WHERE id_tipo=?";
    }

    @Override
    protected String getMaxIdQuery() {
        return "SELECT MAX(id_tipo) FROM TIPO_HABITACION";
    }

    @Override
    protected TipoHabitacion mapResultSetToEntity(ResultSet resultSet) throws SQLException {
        int idTipo = resultSet.getInt("id_tipo");
        double precio = resultSet.getDouble("precio");
        int capacidad = resultSet.getInt("capacidad");
        Time checkIn = resultSet.getTime("check_in");
        Time checkOut = resultSet.getTime("check_out");

        return new TipoHabitacion(idTipo, precio, capacidad, checkIn, checkOut);
    }

    @Override
    protected void mapEntityToStatement(TipoHabitacion entidad, PreparedStatement statement) throws SQLException {
        statement.setDouble(1, entidad.getPrecio());
        statement.setInt(2, entidad.getCapacidad());
        statement.setTime(3, entidad.getCheckIn());
        statement.setTime(4, entidad.getCheckOut());
        statement.setInt(5, entidad.getIdTipo());
    }
}