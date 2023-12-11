
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

    // Constructor
    public Acompañante(int idAcompañante, int idDetReserva, String nombre, String apellido) {
        this.idAcompañante = idAcompañante;
        this.idDetReserva = idDetReserva;
        this.nombre = nombre;
        this.apellido = apellido;
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
    @Override
    public String toString() {
        return "Acompañante{" +
                "idAcompañante=" + idAcompañante +
                ", idDetReserva=" + idDetReserva +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido +  '\'' +
                '}';
    }
}
