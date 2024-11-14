package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Transaccion {
    private String id;
    private LocalDate fecha;
    private TipoTransaccion tipoDeTransaccion;

    public Transaccion(String id, LocalDate fecha, TipoTransaccion tipoDeTransaccion) {
        this.id = id;
        this.fecha = fecha;
        this.tipoDeTransaccion = tipoDeTransaccion;
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
        return "Transaccion [id=" + id + ", fecha=" + fecha + ", tipoDeTransaccion=" + tipoDeTransaccion + "]";
    }

}
