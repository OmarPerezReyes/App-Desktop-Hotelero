
package Modelos;

/**
 *
 * @author omarperez
 */

public class Acompañante {
    private int idAcompañante;
    private int idDetReserva;
    private String nombre;
    private String apellido;
    private String tipoDocIdentidad;
    private String numDocIdentidad;
    private String email;

    // Constructor
    public Acompañante(int idAcompañante, int idDetReserva, String nombre, String apellido,
                       String tipoDocIdentidad, String numDocIdentidad, String email) {
        this.idAcompañante = idAcompañante;
        this.idDetReserva = idDetReserva;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocIdentidad = tipoDocIdentidad;
        this.numDocIdentidad = numDocIdentidad;
        this.email = email;
    }

    // Getters y setters
    public int getIdAcompañante() {
        return idAcompañante;
    }

    public void setIdAcompañante(int idAcompañante) {
        this.idAcompañante = idAcompañante;
    }

    public int getIdDetReserva() {
        return idDetReserva;
    }

    public void setIdDetReserva(int idDetReserva) {
        this.idDetReserva = idDetReserva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoDocIdentidad() {
        return tipoDocIdentidad;
    }

    public void setTipoDocIdentidad(String tipoDocIdentidad) {
        this.tipoDocIdentidad = tipoDocIdentidad;
    }

    public String getNumDocIdentidad() {
        return numDocIdentidad;
    }

    public void setNumDocIdentidad(String numDocIdentidad) {
        this.numDocIdentidad = numDocIdentidad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Acompañante{" +
                "idAcompañante=" + idAcompañante +
                ", idDetReserva=" + idDetReserva +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", tipoDocIdentidad='" + tipoDocIdentidad + '\'' +
                ", numDocIdentidad='" + numDocIdentidad + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
