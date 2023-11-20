package Modelos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author omarperez
 */

public class ModeloAcompañante extends ModeloBaseImpl<Acompañante> {

    @Override
    protected String getSelectAllQuery() {
        return "SELECT * FROM ACOMPAÑANTE";
    }

    @Override
    protected String getSearchQuery() {
        return "SELECT * FROM ACOMPAÑANTE WHERE nombre LIKE ? OR apellido LIKE ?";
    }

    @Override
    protected String getDeleteQuery() {
        return "DELETE FROM ACOMPAÑANTE WHERE id_acompañante = ?";
    }

    @Override
    protected String getInsertQuery() {
        return "INSERT INTO ACOMPAÑANTE (id_det_reserva, nombre, apellido, tipo_doc_identidad, num_doc_identidad, email, id_acompañante) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
    }

    @Override
    protected String getUpdateQuery() {
        return "UPDATE ACOMPAÑANTE SET id_det_reserva=?, nombre=?, apellido=?, tipo_doc_identidad=?, num_doc_identidad=?, "
                + "email=? WHERE id_acompañante=?";
    }

    @Override
    protected String getMaxIdQuery() {
        return "SELECT MAX(id_acompañante) FROM ACOMPAÑANTE";
    }

    @Override
    protected Acompañante mapResultSetToEntity(ResultSet resultSet) throws SQLException {
        int idAcompañante = resultSet.getInt("id_acompañante");
        int idDetReserva = resultSet.getInt("id_det_reserva");
        String nombre = resultSet.getString("nombre");
        String apellido = resultSet.getString("apellido");
        String tipoDocIdentidad = resultSet.getString("tipo_doc_identidad");
        String numDocIdentidad = resultSet.getString("num_doc_identidad");
        String email = resultSet.getString("email");

        return new Acompañante(idAcompañante, idDetReserva, nombre, apellido,
                tipoDocIdentidad, numDocIdentidad, email);
    }

    @Override
    protected void mapEntityToStatement(Acompañante entidad, PreparedStatement statement) throws SQLException {
        statement.setInt(1, entidad.getIdDetReserva());
        statement.setString(2, entidad.getNombre());
        statement.setString(3, entidad.getApellido());
        statement.setString(4, entidad.getTipoDocIdentidad());
        statement.setString(5, entidad.getNumDocIdentidad());
        statement.setString(6, entidad.getEmail());
        statement.setInt(7, entidad.getIdAcompañante());

    }
}
