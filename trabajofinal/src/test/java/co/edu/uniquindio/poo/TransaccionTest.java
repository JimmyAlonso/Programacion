package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class TransaccionTest {

    @Test
    public void testTransaccionConstructor() {
        // Crear un empleado simulado para la prueba
        Empleado empleado = new Empleado("Juan", "Perez@gmail", "12345", 2500);
        
        // Crear una transacción con los parámetros de prueba
        LocalDate fecha = LocalDate.of(2024, 11, 18);
        Transaccion transaccion = new Transaccion("T001", fecha, TipoTransaccion.COMPRA, empleado);
        
        // Verificar que la transacción se haya creado correctamente
        assertEquals("T001", transaccion.getId());
        assertEquals(fecha, transaccion.getFecha());
        assertEquals(TipoTransaccion.COMPRA, transaccion.getTipoDeTransaccion());
        assertEquals(empleado, transaccion.getEmpleado());
    }

    @Test
    public void testSettersAndGetters() {
        // Crear un empleado simulado para la prueba
        Empleado empleado = new Empleado("Carlos", "Gomez@gmail", "67890", 3500);
        
        // Crear una transacción
        Transaccion transaccion = new Transaccion("T002", LocalDate.of(2024, 11, 19), TipoTransaccion.VENTA, empleado);
        
        // Verificar que los getters devuelvan los valores correctos
        assertEquals("T002", transaccion.getId());
        assertEquals(LocalDate.of(2024, 11, 19), transaccion.getFecha());
        assertEquals(TipoTransaccion.VENTA, transaccion.getTipoDeTransaccion());
        assertEquals(empleado, transaccion.getEmpleado());
        
        // Modificar los valores con los setters
        transaccion.setId("T003");
        transaccion.setFecha(LocalDate.of(2024, 11, 20));
        transaccion.setTipoDeTransaccion(TipoTransaccion.ALQUILER);
        transaccion.setEmpleado(new Empleado("Ana", "lopes@gmail", "54321", 3000));
        
        // Verificar que los valores modificados sean correctos
        assertEquals("T003", transaccion.getId());
        assertEquals(LocalDate.of(2024, 11, 20), transaccion.getFecha());
        assertEquals(TipoTransaccion.ALQUILER, transaccion.getTipoDeTransaccion());
        assertNotEquals(empleado, transaccion.getEmpleado()); // El empleado debe haber cambiado
    }

    @Test
    public void testToString() {
        // Crear un empleado simulado para la prueba
        Empleado empleado = new Empleado("Luis", "Martinez@gmail", "13579", 2200);
        
        // Crear una transacción con los parámetros de prueba
        LocalDate fecha = LocalDate.of(2024, 11, 18);
        Transaccion transaccion = new Transaccion("T004", fecha, TipoTransaccion.COMPRA, empleado);
        
        // Verificar que el método toString devuelve el formato esperado
        String expected = "Transacción: Id: T004, Fecha: 2024-11-18, Tipo de transacción: COMPRA";
        assertEquals(expected, transaccion.toString());
    }

    @Test
    public void testEmpleadoNull() {
        // Crear una transacción con un empleado nulo
        LocalDate fecha = LocalDate.of(2024, 11, 18);
        Transaccion transaccion = new Transaccion("T005", fecha, TipoTransaccion.VENTA, null);
        
        // Verificar que el empleado sea nulo
        assertNull(transaccion.getEmpleado());
}
}
