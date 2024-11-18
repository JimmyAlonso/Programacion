package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class VehiculoTest {

    @Test
    public void testVehiculoConstructor() {
        // Crear un objeto Vehiculo con los parámetros de prueba
        Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla", "Nuevo", "1.8L", "200 km/h", 
                TipoCombustible.GASOLINA, TipoTransmision.AUTOMATICA);
        
        // Verificar que los atributos se hayan asignado correctamente
        assertEquals("Toyota", vehiculo.getMarca());
        assertEquals("Corolla", vehiculo.getModelo());
        assertEquals("Nuevo", vehiculo.getEstado());
        assertEquals("1.8L", vehiculo.getCilindraje());
        assertEquals("200 km/h", vehiculo.getVelocidadMaxima());
        assertEquals(TipoCombustible.GASOLINA, vehiculo.getTipoDeCombustible());
        assertEquals(TipoTransmision.AUTOMATICA, vehiculo.getTipoDeTransmision());
    }

    @Test
    public void testSettersAndGetters() {
        // Crear un objeto Vehiculo
        Vehiculo vehiculo = new Vehiculo("Honda", "Civic", "Usado", "2.0L", "180 km/h", 
                TipoCombustible.DIESEL, TipoTransmision.MANUAL);
        
        // Verificar que los getters devuelven los valores correctos
        assertEquals("Honda", vehiculo.getMarca());
        assertEquals("Civic", vehiculo.getModelo());
        assertEquals("Usado", vehiculo.getEstado());
        assertEquals("2.0L", vehiculo.getCilindraje());
        assertEquals("180 km/h", vehiculo.getVelocidadMaxima());
        assertEquals(TipoCombustible.DIESEL, vehiculo.getTipoDeCombustible());
        assertEquals(TipoTransmision.MANUAL, vehiculo.getTipoDeTransmision());

        // Cambiar los valores usando los setters
        vehiculo.setMarca("Nissan");
        vehiculo.setModelo("Sentra");
        vehiculo.setEstado("Nuevo");
        vehiculo.setCilindraje("1.6L");
        vehiculo.setVelocidadMaxima("170 km/h");
        vehiculo.setTipoDeCombustible(TipoCombustible.HIBRIDO);
        vehiculo.setTipoDeTransmision(TipoTransmision.AUTOMATICA);

        // Verificar que los valores cambiados sean correctos
        assertEquals("Nissan", vehiculo.getMarca());
        assertEquals("Sentra", vehiculo.getModelo());
        assertEquals("Nuevo", vehiculo.getEstado());
        assertEquals("1.6L", vehiculo.getCilindraje());
        assertEquals("170 km/h", vehiculo.getVelocidadMaxima());
        assertEquals(TipoCombustible.HIBRIDO, vehiculo.getTipoDeCombustible());
        assertEquals(TipoTransmision.AUTOMATICA, vehiculo.getTipoDeTransmision());
    }

    @Test
    public void testToString() {
        // Crear un objeto Vehiculo
        Vehiculo vehiculo = new Vehiculo("Ford", "Focus", "Nuevo", "2.5L", "220 km/h", 
                TipoCombustible.GASOLINA, TipoTransmision.AUTOMATICA);

        // Verificar que el método toString devuelve el formato esperado
        String expected = "Vehiculo: Marca : Ford, Modelo : Focus, Estado : Nuevo, Cilindraje : 2.5L, Velocidad máxima : 220 km/h, Tipo de combustible : GASOLINA, Tipo de transmisión : AUTOMATICA";
        assertEquals(expected, vehiculo.toString());
    }
}

