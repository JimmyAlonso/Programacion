package co.edu.uniquindio.poo;

public class Contacto {             //Se crean los atributos
    private String nombres;
    private String apellidos;      
    private String direccion;
    private String telefono;
    private String correo;
    
    public Contacto(String nombres, String apellidos, String direccion, String telefono, String correo) {           //Se crea el constructor
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getNombres() {                //Se crean los Setters y Getters
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {                                                                          // Se crea el toString
        return " - " + nombres + " " + apellidos + "\nDireccion : " + direccion + "\nTelefono : "
                + telefono + "\nCorreo : " + correo+"\n\n";
    }
    
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    
}
