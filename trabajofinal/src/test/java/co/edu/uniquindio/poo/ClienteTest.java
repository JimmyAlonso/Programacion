package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    public void testConstructor() {
        // Crear un cliente con el constructor
        Cliente cliente = new Cliente("Juan", "123456789", "Vegetariano");
        
        // Verificar que el cliente se ha creado correctamente
        assertNotNull(cliente); // Verificar que el objeto cliente no sea nulo
        assertEquals("Juan", cliente.getNombre()); // Verificar el nombre
        assertEquals("123456789", cliente.getIdentificacion()); // Verificar la identificación
        assertEquals("Vegetariano", cliente.getPreferencias()); // Verificar las preferencias
    }

    @Test
    public void testSettersYGetters() {
        // Crear un cliente y probar los setters y getters
        Cliente cliente = new Cliente("Juan", "123456789", "Vegetariano");

        // Cambiar valores usando setters
        cliente.setNombre("Carlos");
        cliente.setIdentificacion("987654321");
        cliente.setPreferencias("Vegano");

        // Verificar que los valores fueron cambiados correctamente
        assertEquals("Carlos", cliente.getNombre()); // Verificar el nuevo nombre
        assertEquals("987654321", cliente.getIdentificacion()); // Verificar la nueva identificación
        assertEquals("Vegano", cliente.getPreferencias()); // Verificar las nuevas preferencias
    }

    @Test
    public void testToString() {
        // Crear un cliente y probar el método toString
        Cliente cliente = new Cliente("Juan", "123456789", "Vegetariano");

        // Crear la cadena esperada que debe devolver toString
        String expected = "Cliente: nombre: Juan, Identificación: 123456789, Preferencias: Vegetariano";
        
        // Verificar que la salida de toString sea la correcta
        assertEquals(expected, cliente.toString());
    }

    @Test
    public void testCambioDeDatos() {
        // Crear un cliente y modificar sus datos
        Cliente cliente = new Cliente("Juan", "123456789", "Vegetariano");
        
        // Modificar los valores
        cliente.setNombre("Ana");
        cliente.setIdentificacion("1122334455");
        cliente.setPreferencias("Omnívoro");

        // Verificar que los valores se hayan actualizado correctamente
        assertEquals("Ana", cliente.getNombre());
        assertEquals("1122334455", cliente.getIdentificacion());
        assertEquals("Omnívoro", cliente.getPreferencias());
}
}
