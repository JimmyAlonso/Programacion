package co.edu.uniquindio.poo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdministradorTest {

    private Administrador administrador;

    @BeforeEach
    void setUp() {
        administrador = new Administrador("Admin", "admin@gmail.com", "admin", 1234);
    }

    @Test
    void testAgregarEmpleado() {
        
        // Verificar que la lista de empleados inicialmente está vacía
        assertTrue(administrador.empleados.isEmpty());

        // Simular la adición de un empleado
        administrador.empleados.add(new Empleado("Jimmy", "jimmy@gmail.com", "Jimmy Alonso", 3232323));

        // Validar que se agregó el empleado
        assertEquals(1, administrador.empleados.size());
        assertEquals("Jimmy", administrador.empleados.get(0).getNombre());
    }

    @Test
    void testActualizarEmpleado() {
        // Agregar un empleado inicial
        Empleado empleado = new Empleado("Jimmy", "jimmy@gmail.com", "Jimmy Alonso", 3232323);
        administrador.empleados.add(empleado);

        // Simular actualización del empleado
        for (Empleado emp : administrador.empleados) {
            if (emp.getContraseña() == 3232323) {
                emp.setNombre("Jimmy Actualizado");
                emp.setCorreo("nuevoemail@gmail.com");
                emp.setUsuario("UsuarioActualizado");
            }
        }

        // Validar que los datos fueron actualizados
        Empleado empleadoActualizado = administrador.empleados.get(0);
        assertEquals("Jimmy Actualizado", empleadoActualizado.getNombre());
        assertEquals("nuevoemail@gmail.com", empleadoActualizado.getCorreo());
        assertEquals("UsuarioActualizado", empleadoActualizado.getUsuario());
    }

    @Test
    void testMostrarEmpleados() {
        // Agregar varios empleados
        administrador.empleados.add(new Empleado("Empleado1", "email1@gmail.com", "user1", 1111));
        administrador.empleados.add(new Empleado("Empleado2", "email2@gmail.com", "user2", 2222));

        // Validar que los empleados se registraron correctamente
        assertEquals(2, administrador.empleados.size());
        assertEquals("Empleado1", administrador.empleados.get(0).getNombre());
        assertEquals("Empleado2", administrador.empleados.get(1).getNombre());
    }

    @Test
    void testEmpleadoNoEncontrado() {
        // Agregar un empleado
        Empleado empleado = new Empleado("Jimmy", "jimmy@gmail.com", "Jimmy Alonso", 3232323);
        administrador.empleados.add(empleado);

        // Intentar actualizar un empleado que no existe
        boolean encontrado = false;
        for (Empleado emp : administrador.empleados) {
            if (emp.getContraseña() == 9999) {
                encontrado = true;
                emp.setNombre("NoExiste");
            }
        }

        // Verificar que no se encontró el empleado
        assertFalse(encontrado);
        assertNotEquals("NoExiste", administrador.empleados.get(0).getNombre());
    }
}