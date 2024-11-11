package co.edu.uniquindio.poo;

public class Administrador extends Usuario{

    public Administrador(String nombre, String correo, String usuario, String contraseña) {
        super(nombre, correo, usuario, contraseña);
    }

    @Override
    public String toString() {
        return "Administrador []"+super.toString();
    }

    //Falta un implements con Empleado
    
    
}
