package co.edu.uniquindio.poo;

public class Empleado extends Usuario {

    public Empleado(String nombre, String correo, String usuario, String contraseña) {
        super(nombre, correo, usuario, contraseña);
    }

    @Override
    public String toString() {
        return "Empleado []" + super.toString();
    }

}
