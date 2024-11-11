package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Reporte {
    private String id;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    
    public Reporte(String id, LocalDate fechaInicio, LocalDate fechaFin) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
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
    @Override
    public String toString() {
        return "Reporte [id=" + id + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + "]";
    }

    
    
}
