package Modelos;

import java.util.Date;

public class Cliente {
    private int idCliente;
    private String nombre;
    private String apellido;
    private String tipoDocIdentidad;
    private String numDocIdentidad;
    private String telefono;
    private String email;
    private String contraseña;
    private String sexo;
    private Date fechaNacimiento;

    // Constructor
    public Cliente(int idCliente, String nombre, String apellido, String tipoDocIdentidad,
                   String numDocIdentidad, String telefono, String email, String contraseña,
                   String sexo, Date fechaNacimiento) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocIdentidad = tipoDocIdentidad;
        this.numDocIdentidad = numDocIdentidad;
        this.telefono = telefono;
        this.email = email;
        this.contraseña = contraseña;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getters y setters
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    // En la clase Cliente

@Override
public String toString() {
    return "Cliente{" +
            "id=" + idCliente +
            ", nombre='" + nombre + '\'' +
            ", apellido='" + apellido + '\'' +
            ", tipoDocIdentidad='" + tipoDocIdentidad + '\'' +
            ", numDocIdentidad='" + numDocIdentidad + '\'' +
            ", telefono='" + telefono + '\'' +
            ", email='" + email + '\'' +
            ", contraseña='" + contraseña + '\'' +
            ", sexo='" + sexo + '\'' +
            ", fechaNacimiento=" + fechaNacimiento +
            '}';
}

}
