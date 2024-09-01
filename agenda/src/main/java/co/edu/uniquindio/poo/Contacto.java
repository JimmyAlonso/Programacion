package co.edu.uniquindio.poo;

public class Contacto {      //Se crean los atributos 
    private String nombres;
    private String alias;      
    private String direccion;
    private String telefono;
    private String email;
    
    public Contacto(String nombres, String alias, String direccion, String telefono, String email) {   //Se crea el constructor
        this.nombres = nombres;
        this.alias = alias;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        assert !nombres.isBlank();
        assert !alias.isBlank();
        assert !direccion.isBlank();
        assert !telefono.isBlank();
        assert !email.isBlank();
        assert email.contains("@");
    }


    
    public String getNombres() {                
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
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

    public String getEmail() {
        return email;
    }

    public void setCorreo(String email) {
        this.email = email;
    }

    @Override
    public String toString() {                                                            // Se crea el toString
        return "\nNombre: " + nombres + "\nAlias:" + alias + "\nDireccion : " + direccion + "\nTelefono : "
                + telefono + "\nCorreo : " + email+"\n\n";
    }
    
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    
}
