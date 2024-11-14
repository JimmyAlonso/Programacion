package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
    
        Vehiculo vehiculo = new Vehiculo(null, null, null, null, null, TipoCombustible.DIESEL, TipoTransmision.AUTOMATICA);
        Vehiculo vehiculo2 = new Vehiculo(null, null, null, null, null, TipoCombustible.DIESEL, TipoTransmision.AUTOMATICA);
        vehiculo.registrarVehiculo();
        vehiculo2.registrarVehiculo();

        
        Empleado empleado = new Empleado("Jimmy", "jimmy@gmail.com", "Jimmy Alonso", "31212331");


        Transaccion transaccion = new Transaccion("32323", LocalDate.now(), TipoTransaccion.COMPRA);

        
        Reporte reporte = new Reporte("323", LocalDate.now(), LocalDate.now());
        reporte.agregarTransaccion(transaccion);





        Cliente cliente = new Cliente("Sebas", "109283629", "Deportivos");


































































































































    }

}
