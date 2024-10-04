package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Prestamo {
    private double valor;
    private Estudiante estudiante;
    private LocalDate fechaPrestamo;

    public Prestamo(double valor, Estudiante estudiante, LocalDate fechaPrestamo) {
        this.valor = valor;
        this.estudiante = estudiante;
        this.fechaPrestamo = fechaPrestamo;
    }
    public Estudiante getEstudiante() {
        return estudiante;
    }
    @Override
    public String toString() {
        return "Valor : " + valor + ", estudiante : " + estudiante + ", fechaPrestamo : " + fechaPrestamo;
    }
}

