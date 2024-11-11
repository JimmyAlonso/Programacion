package co.edu.uniquindio.poo;

public class Usuario {
    private String nombre;
    private String correo;
    private String usuario;
    private String contraseña;
    public Usuario(String nombre, String correo, String usuario, String contraseña) {
        this.nombre = nombre;
        this.correo = correo;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
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
    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", correo=" + correo + ", usuario=" + usuario + ", contraseña="
                + contraseña + "]";
    }

    
    
}
