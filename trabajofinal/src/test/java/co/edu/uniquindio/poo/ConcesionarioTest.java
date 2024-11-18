package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConcesionarioTest {

    @Test
    public void testConstructor() {
        // Crear un concesionario con el constructor
        Concesionario concesionario = new Concesionario("Concesionario XYZ");

        // Verificar que el concesionario se ha creado correctamente
        assertNotNull(concesionario); // Verificar que el objeto concesionario no sea nulo
        assertEquals("Concesionario XYZ", concesionario.getNombre()); // Verificar el nombre
    }

    @Test
    public void testSettersYGetters() {
        // Crear un concesionario y probar los setters y getters
        Concesionario concesionario = new Concesionario("Concesionario ABC");

        // Cambiar el nombre usando el setter
        concesionario.setNombre("Concesionario 123");

        // Verificar que el valor del nombre se ha actualizado correctamente
        assertEquals("Concesionario 123", concesionario.getNombre());
    }

    @Test
    public void testToString() {
        // Crear un concesionario y probar el método toString
        Concesionario concesionario = new Concesionario("Concesionario XYZ");

        // Crear la cadena esperada que debe devolver toString
        String expected = "Concesionario: nombre: Concesionario XYZ";
        
        // Verificar que la salida de toString sea la correcta
        assertEquals(expected, concesionario.toString());
    }

    @Test
    public void testCambioDeDatos() {
        // Crear un concesionario y modificar sus datos
        Concesionario concesionario = new Concesionario("Concesionario ABC");

        // Modificar el nombre
        concesionario.setNombre("Concesionario 456");

        // Verificar que el nombre se ha actualizado correctamente
        assertEquals("Concesionario 456", concesionario.getNombre());
}
}
