package Modelos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class ModeloCliente extends ModeloBaseImpl<Cliente> {

    @Override
    protected String getSelectAllQuery() {
        return "SELECT * FROM CLIENTE";
    }

    @Override
    protected String getSearchQuery() {
        return "SELECT * FROM CLIENTE WHERE nombre LIKE ? OR apellido LIKE ?";
    }

    @Override
    protected String getDeleteQuery() {
        return "DELETE FROM CLIENTE WHERE id_cliente = ?";
    }

    @Override
    protected String getInsertQuery() {
        return "INSERT INTO CLIENTE (nombre, apellido, tipo_doc_identidad, num_doc_identidad, telefono, email, contraseña, sexo, fecha_nacimiento, id_cliente) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    }

 @Override
protected String getUpdateQuery() {
    return "UPDATE CLIENTE SET nombre=?, apellido=?, tipo_doc_identidad=?, num_doc_identidad=?, "
            + "telefono=?, email=?, contraseña=?, sexo=?, fecha_nacimiento=? WHERE id_cliente=?";
}

    
       @Override
    protected String getMaxIdQuery() {
        return "SELECT MAX(id_cliente) FROM CLIENTE";
    }
    

    @Override
    protected Cliente mapResultSetToEntity(ResultSet resultSet) throws SQLException {
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

        return new Cliente(idCliente, nombre, apellido, tipoDocIdentidad,
                numDocIdentidad, telefono, email, contraseña, sexo, fechaNacimiento);
    }

    @Override
    protected void mapEntityToStatement(Cliente entidad, PreparedStatement statement) throws SQLException {
        statement.setString(1, entidad.getNombre());
        statement.setString(2, entidad.getApellido());
        statement.setString(3, entidad.getTipoDocIdentidad());
        statement.setString(4, entidad.getNumDocIdentidad());
        statement.setString(5, entidad.getTelefono());
        statement.setString(6, entidad.getEmail());
        statement.setString(7, entidad.getContraseña());
        statement.setString(8, entidad.getSexo());
        statement.setDate(9, new java.sql.Date(entidad.getFechaNacimiento().getTime()));
        statement.setInt(10, entidad.getIdCliente());
    }
    
       
}


