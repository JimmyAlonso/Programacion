package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    @Test
    public void testUsuario() {
        // Crear un usuario con los parámetros de prueba
        Usuario usuario = new Usuario("Juan Perez", "juan@example.com", "juanp", 123456);
        
        // Verificar que los atributos se hayan asignado correctamente
        assertEquals("Juan Perez", usuario.getNombre());
        assertEquals("juan@example.com", usuario.getCorreo());
        assertEquals("juanp", usuario.getUsuario());
        assertEquals(123456, usuario.getContraseña());
    }

    @Test
    public void test() {
        // Crear un usuario
        Usuario usuario = new Usuario("Maria Lopez", "maria@example.com", "maria123", 654321);
        
        // Verificar que los getters devuelven los valores correctos
        assertEquals("Maria Lopez", usuario.getNombre());
        assertEquals("maria@example.com", usuario.getCorreo());
        assertEquals("maria123", usuario.getUsuario());
        assertEquals(654321, usuario.getContraseña());
        
        // Cambiar los valores usando los setters
        usuario.setNombre("Ana Garcia");
        usuario.setCorreo("ana@example.com");
        usuario.setUsuario("ana123");
        usuario.setContraseña(987654);
        
        // Verificar que los valores cambiados sean correctos
        assertEquals("Ana Garcia", usuario.getNombre());
        assertEquals("ana@example.com", usuario.getCorreo());
        assertEquals("ana123", usuario.getUsuario());
        assertEquals(987654, usuario.getContraseña());
    }

    @Test
    public void testToString() {
        // Crear un usuario
        Usuario usuario = new Usuario("Carlos Silva", "carlos@example.com", "carlos123", 112233);
        
        // Verificar que el método toString devuelve el formato esperado
        String expected = "Usuario: Nombre: Carlos Silva, Correo: carlos@example.com, Usuario: carlos123, Contraseña: 112233";
        assertEquals(expected, usuario.toString());
    }

    @Test
    public void testContraseña() {
        // Crear un usuario
        Usuario usuario = new Usuario("Luisa Mora", "luisa@example.com", "luisa123", 333222);
        
        // Verificar que la contraseña se haya asignado correctamente
        assertEquals(333222, usuario.getContraseña());
        
        // Cambiar la contraseña usando el setter
        usuario.setContraseña(444555);
        
        // Verificar que la contraseña cambiada sea correcta
        assertEquals(444555, usuario.getContraseña());
    }

}