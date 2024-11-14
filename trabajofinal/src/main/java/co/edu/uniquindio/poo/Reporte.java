package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

public class Reporte {
    private String id;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private LinkedList<Transaccion> transacciones;

    public Reporte(String id, LocalDate fechaInicio, LocalDate fechaFin) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        transacciones = new LinkedList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public LinkedList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(LinkedList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    @Override
    public String toString() {
        return "Reporte [id=" + id + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", transacciones="
                + transacciones + "]";
    }

    public void agregarTransaccion(Transaccion transaccion){
        transacciones.add(transaccion);

    }
}
