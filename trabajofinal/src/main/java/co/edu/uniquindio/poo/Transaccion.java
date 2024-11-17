package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Transaccion {
    private String id;
    private LocalDate fecha;
    private TipoTransaccion tipoDeTransaccion;
    private Empleado empleado;

    public Transaccion(String id, LocalDate fecha, TipoTransaccion tipoDeTransaccion, Empleado empleado) {
        this.id = id;
        this.fecha = fecha;
        this.tipoDeTransaccion = tipoDeTransaccion;
        this.empleado = empleado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public TipoTransaccion getTipoDeTransaccion() {
        return tipoDeTransaccion;
    }

    public void setTipoDeTransaccion(TipoTransaccion tipoDeTransaccion) {
        this.tipoDeTransaccion = tipoDeTransaccion;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    

    @Override
    public String toString() {
        return "Transacción: Id: " + id + ", Fecha: " + fecha + ", Tipo de transacción: " + tipoDeTransaccion + "";
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

}
