package co.edu.uniquindio.poo;

public class Autenticacion {
    private String nombreUsuario;
    private String contraseña;
    private boolean sesionIniciada;

    // Constructor
    public Autenticacion(String nombreUsuario, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.sesionIniciada = false;
    }

    // Getters y Setters
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean isSesionIniciada() {
        return sesionIniciada;
    }

    public void setSesionIniciada(boolean sesionIniciada) {
        this.sesionIniciada = sesionIniciada;
    }

    // Método para verificar la contraseña
    public boolean verificarContraseña(String contraseñaIngresada) {
        return this.contraseña.equals(contraseñaIngresada);
    }
}



