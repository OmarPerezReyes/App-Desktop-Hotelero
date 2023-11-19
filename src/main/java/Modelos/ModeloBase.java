package Modelos;
import java.sql.SQLException;
import java.util.List;

public interface ModeloBase<T> {
    List<T> obtenerTodos() throws SQLException;
    List<T> buscar(String textoBuscar) throws SQLException;
    void eliminar(int id) throws SQLException;
    boolean insertar(T entidad) throws SQLException;
    boolean actualizar(T entidad) throws SQLException;
    int obtenerNuevoId() throws SQLException; 
}
