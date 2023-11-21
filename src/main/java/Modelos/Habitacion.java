package Modelos;

/**
 *
 * @author omarperez
 */

public class Habitacion {
    private int numeroHabitacion;
    private int idTipo;
    private boolean estadoOcupacion;
    private int piso;

    // Constructor
    public Habitacion(int numeroHabitacion, int idTipo, boolean estadoOcupacion, int piso) {
        this.numeroHabitacion = numeroHabitacion;
        this.idTipo = idTipo;
        this.estadoOcupacion = estadoOcupacion;
        this.piso = piso;
    }

    // Getters y setters
    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public boolean isEstadoOcupacion() {
        return estadoOcupacion;
    }

    public void setEstadoOcupacion(boolean estadoOcupacion) {
        this.estadoOcupacion = estadoOcupacion;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "numeroHabitacion=" + numeroHabitacion +
                ", idTipo=" + idTipo +
                ", estadoOcupacion=" + estadoOcupacion +
                ", piso=" + piso +
                '}';
    }
}
