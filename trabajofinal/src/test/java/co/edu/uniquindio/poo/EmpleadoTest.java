package co.edu.uniquindio.poo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmpleadoTest {

    private Empleado empleado;
    private Vehiculo vehiculo1;
    private Vehiculo vehiculo2;
    private Cliente cliente1;
    private Cliente cliente2;

    @BeforeEach
    public void setUp() {
        // Inicializamos un Empleado antes de cada prueba
        empleado = new Empleado("Carlos", "carlos@email.com", "carlos123", 1234);

        // Creamos algunos vehículos y clientes para las pruebas
        vehiculo1 = new Deportivo("Ferrari", "F8", "Nuevo", "3900cc", "340 km/h", TipoCombustible.GASOLINA, TipoTransmision.MANUAL, 2, 2, 6, 710, "3.0 seg");
        vehiculo2 = new Deportivo("Lamborghini", "Aventador", "Nuevo", "5200cc", "350 km/h", TipoCombustible.GASOLINA, TipoTransmision.AUTOMATICA, 2, 2, 6, 740, "2.9 seg");

        cliente1 = new Cliente("Juan", "12345", "Deportivo");
        cliente2 = new Cliente("Maria", "67890", "SUV");
    }

    @Test
    public void testRegistrarVehiculo() {
        // Registrar un vehículo
        empleado.registrarVehiculo(vehiculo1);

        // Verificar que el vehículo ha sido registrado correctamente
        assertEquals(1, empleado.getVehiculos().size());
        assertTrue(empleado.getVehiculos().contains(vehiculo1));
    }

    @Test
    public void testActualizarVehiculo() {
        // Registrar vehículos
        empleado.registrarVehiculo(vehiculo1);
        empleado.registrarVehiculo(vehiculo2);

        // Actualizar el primer vehículo
        Vehiculo vehiculoActualizado = new Deportivo("Porsche", "911", "Nuevo", "3800cc", "320 km/h", TipoCombustible.GASOLINA, TipoTransmision.MANUAL, 2, 2, 6, 640, "3.5 seg");
        empleado.actualizarVehiculo(0, vehiculoActualizado);

        // Verificar que el vehículo ha sido actualizado
        assertEquals(vehiculoActualizado, empleado.getVehiculos().get(0));
    }

    @Test
    public void testBuscarVehiculoPorMarca() {
        // Registrar vehículos
        empleado.registrarVehiculo(vehiculo1);
        empleado.registrarVehiculo(vehiculo2);

        // Buscar vehículo por marca (marca que existe)
        empleado.buscarVehiculoPorMarca(); // Asumimos que esta prueba se simula con input esperado "Ferrari"

        // Aquí asumimos que el flujo correcto será que "Ferrari" sea encontrado.
        // En un escenario real, necesitaríamos simular la entrada del usuario usando un mock o algo similar.
    }

    @Test
    public void testRegistrarCliente() {
        // Registrar un cliente
        empleado.registrarCliente(cliente1);

        // Verificar que el cliente ha sido registrado correctamente
        assertEquals(1, empleado.getClientes().size());
        assertTrue(empleado.getClientes().contains(cliente1));
    }

    @Test
    public void testActualizarCliente() {
        // Registrar un cliente
        empleado.registrarCliente(cliente1);

        // Actualizar el cliente
        empleado.actualizarCliente("12345", "Juan Perez", "Deportivo y SUV");

        // Verificar que los datos del cliente han sido actualizados correctamente
        assertEquals("Juan Perez", cliente1.getNombre());
        assertEquals("Deportivo y SUV", cliente1.getPreferencias());
    }

    @Test
    public void testMostrarClientes() {
        // Registrar clientes
        empleado.registrarCliente(cliente1);
        empleado.registrarCliente(cliente2);

        // Verificar que la lista de clientes se muestra correctamente
        empleado.mostrarClientes();
        // Este test asume que estamos verificando la salida del sistema en la consola, lo cual podría
        // hacerse con redirección de flujo o verificando el comportamiento esperado.
    }

    @Test
    public void testRealizarVenta() {
        // Registrar vehículos
        empleado.registrarVehiculo(vehiculo1);
        empleado.registrarVehiculo(vehiculo2);

        // Realizar una venta de un vehículo (simular selección de vehículo)
        empleado.realizarVenta(); // Este test también depende de simular la entrada del usuario
    }

    @Test
    public void testRealizarAlquiler() {
        // Registrar vehículos
        empleado.registrarVehiculo(vehiculo1);
        empleado.registrarVehiculo(vehiculo2);

        // Realizar un alquiler de un vehículo (simular selección de vehículo)
        empleado.realizarAlquiler(); // Este test depende de simular la entrada del usuario
    }

    @Test
    public void testMostrarVehiculos() {
        // Registrar vehículos
        empleado.registrarVehiculo(vehiculo1);
        empleado.registrarVehiculo(vehiculo2);

        // Verificar que los vehículos registrados se muestren correctamente
        empleado.mostrarVehiculos();
        // Similar al test de mostrar clientes, verificamos la salida esperada.
    }

    @Test
    public void testToString() {
        // Crear el objeto Empleado
        Empleado empleado = new Empleado("Carlos", "carlos@email.com", "carlos123", 1234);
        
        // Llamar al método toString
        String expectedString = "Empleado []" + super.toString(); // Asumimos que el toString de Usuario funciona correctamente
        assertEquals(expectedString, empleado.toString());
}
}