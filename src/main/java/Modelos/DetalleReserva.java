package Modelos;

import java.util.Date;

/**
 *
 * @author omarperez
 */
public class DetalleReserva {

    private int idDetalleReserva;
    private int idReserva;
    private int idHabitacion;
    private Date fechaEntrada;
    private Date fechaSalida;

    public DetalleReserva(int idDetalleReserva, int idReserva, int idHabitacion, Date fechaEntrada, Date fechaSalida) {
        this.idDetalleReserva = idDetalleReserva;
        this.idReserva = idReserva;
        this.idHabitacion = idHabitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public int getIdDetalleReserva() {
        return idDetalleReserva;
    }

    public void setIdDetalleReserva(int idDetalleReserva) {
        this.idDetalleReserva = idDetalleReserva;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    @Override
    public String toString() {
        return "DetalleReserva{" + "idDetalleReserva=" + idDetalleReserva + ", idReserva=" + idReserva + ", idHabitacion=" + idHabitacion + ", fechaEntrada=" + fechaEntrada + ", fechaSalida=" + fechaSalida + '}';
    }
}
