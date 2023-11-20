package Modelos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class ModeloEmpleado extends ModeloBaseImpl<Empleado> {

    @Override
    protected String getSelectAllQuery() {
        return "SELECT * FROM EMPLEADO";
    }

    @Override
    protected String getSearchQuery() {
        return "SELECT * FROM EMPLEADO WHERE nombre LIKE ? OR apellido LIKE ?";
    }

    @Override
    protected String getDeleteQuery() {
        return "DELETE FROM EMPLEADO WHERE id_empleado = ?";
    }

    @Override
    protected String getInsertQuery() {
        return "INSERT INTO EMPLEADO (nombre, apellido, tipo_doc_identidad, num_doc_identidad, telefono, email, contraseña, sexo, fecha_nacimiento, id_empleado) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    }

 @Override
protected String getUpdateQuery() {
    return "UPDATE EMPLEADO SET nombre=?, apellido=?, tipo_doc_identidad=?, num_doc_identidad=?, "
            + "telefono=?, email=?, contraseña=?, sexo=?, fecha_nacimiento=? WHERE id_empleado=?";
}

    
       @Override
    protected String getMaxIdQuery() {
        return "SELECT MAX(id_empleado) FROM EMPLEADO";
    }
    

    @Override
    protected Empleado mapResultSetToEntity(ResultSet resultSet) throws SQLException {
        int idEmpleado = resultSet.getInt("id_empleado");
        String nombre = resultSet.getString("nombre");
        String apellido = resultSet.getString("apellido");
        String tipoDocIdentidad = resultSet.getString("tipo_doc_identidad");
        String numDocIdentidad = resultSet.getString("num_doc_identidad");
        String telefono = resultSet.getString("telefono");
        String email = resultSet.getString("email");
        String contraseña = resultSet.getString("contraseña");
        String sexo = resultSet.getString("sexo");
        Date fechaNacimiento = resultSet.getDate("fecha_nacimiento");

        return new Empleado(idEmpleado, nombre, apellido, tipoDocIdentidad,
                numDocIdentidad, telefono, email, contraseña, sexo, fechaNacimiento);
    }

    @Override
    protected void mapEntityToStatement(Empleado entidad, PreparedStatement statement) throws SQLException {
        statement.setString(1, entidad.getNombre());
        statement.setString(2, entidad.getApellido());
        statement.setString(3, entidad.getTipoDocIdentidad());
        statement.setString(4, entidad.getNumDocIdentidad());
        statement.setString(5, entidad.getTelefono());
        statement.setString(6, entidad.getEmail());
        statement.setString(7, entidad.getContraseña());
        statement.setString(8, entidad.getSexo());
        statement.setDate(9, new java.sql.Date(entidad.getFechaNacimiento().getTime()));
        statement.setInt(10, entidad.getIdEmpleado());
    }
    
       
}


