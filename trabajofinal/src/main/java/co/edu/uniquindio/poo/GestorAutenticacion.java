package co.edu.uniquindio.poo;
import java.util.ArrayList;

public class GestorAutenticacion {
    private ArrayList<Autenticacion> usuarios;

    public GestorAutenticacion() {
        this.usuarios = new ArrayList<>();
    }

    // Método para registrar un nuevo usuario
    public boolean registrar(String nombreUsuario, String contraseña) {
        if (buscarUsuario(nombreUsuario) != null) {
            System.out.println("El usuario ya existe.");
            return false;
        }
        usuarios.add(new Autenticacion(nombreUsuario, contraseña));
        System.out.println("Usuario registrado correctamente.");
        return true;
    }

    // Método para iniciar sesión
    public boolean iniciarSesion(String nombreUsuario, String contraseña) {
        Autenticacion usuario = buscarUsuario(nombreUsuario);
        if (usuario == null) {
            System.out.println("Usuario no encontrado.");
            return false;
        }
        if (usuario.verificarContraseña(contraseña)) {
            usuario.setSesionIniciada(true);
            System.out.println("Inicio de sesión exitoso.");
            return true;
        } else {
            System.out.println("Contraseña incorrecta.");
            return false;
        }
    }

    // Método para cerrar sesión
    public boolean cerrarSesion(String nombreUsuario) {
        Autenticacion usuario = buscarUsuario(nombreUsuario);
        if (usuario == null) {
            System.out.println("Usuario no encontrado.");
            return false;
        }
        if (usuario.isSesionIniciada()) {
            usuario.setSesionIniciada(false);
            System.out.println("Sesión cerrada correctamente.");
            return true;
        } else {
            System.out.println("El usuario no tiene la sesión iniciada.");
            return false;
        }
    }

    // Método privado para buscar un usuario en la lista
    private Autenticacion buscarUsuario(String nombreUsuario) {
        for (Autenticacion usuario : usuarios) {
            if (usuario.getNombreUsuario().equals(nombreUsuario)) {
                return usuario;
            }
        }
        return null;
    }
}
