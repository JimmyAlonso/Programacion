package co.edu.uniquindio.poo;

public class Cliente {

    private String nombre;
    private String identificacion;
    private String preferencias;

    public Cliente(String nombre, String identificacion, String preferencias) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.preferencias = preferencias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(String preferencias) {
        this.preferencias = preferencias;
    }

    @Override
    public String toString() {
        return "Cliente: nombre: " + nombre + ", Identificación: " + identificacion + ", Preferencias: "
                + preferencias
                + "";
    }

}
