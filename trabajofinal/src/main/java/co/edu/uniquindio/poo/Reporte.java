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
        return "Reporte: Id" + id + ", Fecha de inicio : " + fechaInicio + ", Fecha de fin : " + fechaFin
                + ", Transacciones : "
                + transacciones;
    }

    public void agregarTransaccion(Transaccion transaccion) {
        transacciones.add(transaccion);
    }

    // Método para generar el reporte filtrando por empleado, tipo de transacción y fechas
    public void generarReporte(Empleado empleado, TipoTransaccion tipoTransaccion) {
        boolean transaccionesEncontradas = false;

        System.out.println("\n--- Reporte de Transacciones ---");
        System.out.println("Reporte ID: " + id);
        System.out.println("Fecha de inicio: " + fechaInicio);
        System.out.println("Fecha de fin: " + fechaFin);
        System.out.println("Empleado: " + empleado.getNombre());
        System.out.println("Tipo de Transacción: " + tipoTransaccion);

        // Filtramos las transacciones por empleado, tipo de transacción y rango de fechas
        for (Transaccion transaccion : transacciones) {
            if (transaccion.getEmpleado().equals(empleado) &&
                transaccion.getTipoDeTransaccion().equals(tipoTransaccion) &&
                !transaccion.getFecha().isBefore(fechaInicio) &&
                !transaccion.getFecha().isAfter(fechaFin)) {

                System.out.println(transaccion);
                transaccionesEncontradas = true;
            }
        }

        if (!transaccionesEncontradas) {
            System.out.println("No se encontraron transacciones para el empleado con ese tipo de transacción en el rango de fechas especificado.");
        }
    }

}
