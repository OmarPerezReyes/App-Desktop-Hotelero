package Modelos;

/**
 *
 * @author omarperez
 */
public interface InicioSesionListener {
    void onInicioSesionExitoso();
    void onTipoUsuario(String tipoUsuario);
    void onIdUsuario(int idUsuario);

}
