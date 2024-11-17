package co.edu.uniquindio.poo;

public class Autenticacion {
    private String usuario;
    private String contraseña;
    private boolean estadoSesion;

    public Autenticacion(String usuario, String contraseña, boolean estadoSesion) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.estadoSesion = estadoSesion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean isEstadoSesion() {
        return estadoSesion;
    }

    public void setEstadoSesion(boolean estadoSesion) {
        this.estadoSesion = estadoSesion;
    }

    @Override
    public String toString() {
        return "Autenticacion: Usuario: " + usuario + ", Contraseña: " + contraseña + ", Estado de Sesión: "
                + estadoSesion
                + "";
    }

}
