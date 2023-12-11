package Modelos;

import java.util.Date;

/**
 *
 * @author omarperez
 */
public class Boleta {
    private int idPago;
    private int idDetalleReserva;
    private Date fechaPago;
    private double monto;
    private String metodoPago;

    public Boleta(int idPago, int idDetalleReserva, Date fechaPago, double monto, String metodoPago) {
        this.idPago = idPago;
        this.idDetalleReserva = idDetalleReserva;
        this.fechaPago = fechaPago;
        this.monto = monto;
        this.metodoPago = metodoPago;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public int getIdDetalleReserva() {
        return idDetalleReserva;
    }

    public void setIdDetalleReserva(int idDetalleReserva) {
        this.idDetalleReserva = idDetalleReserva;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }


    @Override
    public String toString() {
        return "Boleta{" + "idPago=" + idPago + ", idDetalleReserva=" + idDetalleReserva + ", fechaPago=" + fechaPago + ", monto=" + monto + ", metodoPago=" + metodoPago + '}';
    }
    
}
