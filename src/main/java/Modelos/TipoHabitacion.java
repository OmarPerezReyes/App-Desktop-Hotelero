package Modelos;

import java.sql.Time;

/**
 *
 * @author omarperez
 */

public class TipoHabitacion {
    private int idTipo;
    private double precio;
    private int capacidad;
    private Time checkIn;
    private Time checkOut;

    // Constructor
    public TipoHabitacion(int idTipo, double precio, int capacidad, Time checkIn, Time checkOut) {
        this.idTipo = idTipo;
        this.precio = precio;
        this.capacidad = capacidad;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    // Getters y setters
    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Time getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Time checkIn) {
        this.checkIn = checkIn;
    }

    public Time getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Time checkOut) {
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "TipoHabitacion{" +
                "idTipo=" + idTipo +
                ", precio=" + precio +
                ", capacidad=" + capacidad +
                ", checkIn='" + checkIn + '\'' +
                ", checkOut='" + checkOut + '\'' +
                '}';
    }
}
