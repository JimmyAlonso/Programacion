package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        // Crear objeto empresa
        Concesionario concesionario = new Concesionario("Honda");
        
        //Ceear objeto empleado
        Empleado empleado = new Empleado("Jimmy", "jimmy@gmail.com", "Jimmy Alonso", 3232323);

        //Gestionar Clientes
        empleado.menu();
        
        //Crear objeto administrador 
        Administrador administrador = new Administrador("Juan", "j@gmail.com", "JuanAA", 232424);
        
        //Gestionar los empleados
        administrador.gestionarEmpleados();

        // Crear objeto reporte
        Reporte reporte = new Reporte("234234", LocalDate.now(), LocalDate.of(2025, 2, 21));

        reporte.agregarTransaccion(new Transaccion("122122", LocalDate.of(2025,12 ,3), TipoTransaccion.COMPRA, empleado));
        reporte.generarReporte(empleado, TipoTransaccion.COMPRA);

        //Crear fechas de transaccion


        // Creacion de todos los tipos de vehiculos

        Van van = new Van("Van", "2008", "Buen estado", "Bajo cilindraje", "200km/h", TipoCombustible.GASOLINA,
                TipoTransmision.MANUAL, 6, 4, 5, true, true, 4, false);
        Bus bus = new Bus("Bus", "1999", "Estado regular ", "Bajo cilindraje", "80km/h", TipoCombustible.DIESEL,
                TipoTransmision.MANUAL, 19, 3, 3.4, false, false, 2, false, 2, 0);
        Camion camion = new Camion("Camion", "2020", "Excelente estado", "Cilindraje medio", "100km/h",
                TipoCombustible.GASOLINA, TipoTransmision.MANUAL, 10000, true, true, false, 2, "Internacional");
        Camioneta camioneta = new Camioneta("Camioneta", "2011", "Buen estado", "Cilindraje medio", "150km/h",
                TipoCombustible.HIBRIDO, TipoTransmision.AUTOMATICA, 5, 4, 4.5, true, false, "20km/h", 2, true, true,
                true, false, true);
        Deportivo deportivo = new Deportivo("Deportivo", "2022", "Excelente estado", "Alto cilindraje", "300km/h",
                TipoCombustible.HIBRIDO, TipoTransmision.AUTOMATICA, 2, 2, 2, 4, "3.4s");
        Moto moto = new Moto("Moto", "2024", "Nuevo", "Alto cilindraje", "200km/h", TipoCombustible.HIBRIDO,
                TipoTransmision.MANUAL);
        Sedan sedan = new Sedan("Sedan", "2024", "Nuevo", "Alto cilindraje", "180km/h", TipoCombustible.ELECTRICO,
                TipoTransmision.MANUAL, 4, 4, 4.6, true, true, "40km/h", 4, true, true, false, false);
        PickUp pickUp = new PickUp("PickUp", "2024", "Nuevo", "Alto cilindraje", "180km/h", TipoCombustible.ELECTRICO,
                TipoTransmision.MANUAL, 4, 4, true, true, 4, false, true, "7 maletas de carga");

        // Registro de los vehiculos

        empleado.registrarVehiculo(van);
        System.out.println("\n");
        empleado.registrarVehiculo(bus);
        System.out.println("\n");
        empleado.registrarVehiculo(camion);
        System.out.println("\n");
        empleado.registrarVehiculo(camioneta);
        System.out.println("\n");
        empleado.registrarVehiculo(deportivo);
        System.out.println("\n");
        empleado.registrarVehiculo(moto);
        System.out.println("\n");
        empleado.registrarVehiculo(sedan);
        System.out.println("\n");
        empleado.registrarVehiculo(pickUp);
        System.out.println("\n");

        System.out.println("A continuacion se muestra la lista de vehiculos que fueron registrados");
        empleado.mostrarVehiculos();


        System.out.println("\nBIENVENIDOS, a continuacion podra hacer una busqueda y ver si el vehiculo que te interesa esta en nuestro almacen\n \n");

        empleado.buscarVehiculoPorMarca();

        // empleado.mostrarVehiculos();

        System.out.println("Ahora, podras ver los detalles de vehiculo individualmente: \n");

        boolean menu = true;
        while (menu) {
            int autoSeleccionado = Vehiculo.ingresarEntero("Seleccione el vehiculo el cual fue buscado o seleccione otro vehiculo para ver los detalles. \n 1. Van \n 2.Camion \n 3. Camioneta \n 4.Sedan \n 5. Moto \n 6. Bus \n 7. Deportivo \n 8. PickUp \n 9. Ir a menu de compra y alquiler de vehiculos \n  10.Salir");

            switch (autoSeleccionado) {
                case 1:
                    Vehiculo.mostrarMensaje("Has seleccionado una Van." + van.toString());
                    break;
                case 2:
                    Vehiculo.mostrarMensaje("Has seleccionado un Camion." + camion.toString());
                    break;
                case 3:
                    Vehiculo.mostrarMensaje("Has seleccionado una Camioneta." + camioneta.toString());
                    break;
                case 4:
                    Vehiculo.mostrarMensaje("Has seleccionado una Sedan." + sedan.toString());
                    break;
                case 5:
                    Vehiculo.mostrarMensaje("Has seleccionado una Moto." + moto.toString());
                    break;
                case 6:
                    Vehiculo.mostrarMensaje("Has seleccionado un Bus." + bus.toString());
                    break;
                case 7:
                    Vehiculo.mostrarMensaje("Has seleccionado una Deportivo." + deportivo.toString());
                    break;
                case 8:
                    Vehiculo.mostrarMensaje("Has seleccionado un PickUp." + pickUp.toString());
                    break;
                case 9:
                    mostrarMenu(empleado);
                case 10:
                    menu = false;
                    Vehiculo.mostrarMensaje("Saliendo de la pestaña de eleccion de vehiculo. ¡Hasta luego!");
                    break;
                default:
                    Vehiculo.mostrarMensaje("Opción no válida. Por favor, selecciona una opción del 1 al 9.");
                    break;
            }
        }
    }

    public static void mostrarMenu(Empleado empleado) {
        boolean continuarMenu = true;
        while (continuarMenu) {
            int opcionCompra = Vehiculo.ingresarEntero( "Seleccione la opcion de compra o alquiler a la cualquieres acceder: \n 1. Compra  \n 2. Alquiler \n 3.Salir");

            switch (opcionCompra) {
                case 1:
                    empleado.realizarVenta();
                    break;
                case 2:
                    empleado.realizarAlquiler();
                    break;
                case 3:
                    continuarMenu = false;
                    Vehiculo.mostrarMensaje("Saliendo de la pestaña de ventas. ¡Hasta luego!");
                    break;
                default:
                    Vehiculo.mostrarMensaje("Opción no válida. Por favor, selecciona una opción del 1 al 3.");
                    break;
            }
        }

        /*
         * Actualizar vehiculos por indice o posicion en la lista
         * 
         * Van nuevoVan = new Van(null, null, null, null, null, null, null, 0, 0, 0,
         * false, false, 0, false);
         * empleado.actualizarVehiculo(0, nuevoVan);
         * 
         * Bus nuevoBus = new Bus(null, null, null, null, null, null, null, 0, 0, 0,
         * false, false, 0, false, 0, 0);
         * empleado.actualizarVehiculo(0, nuevoBus);
         * 
         * Camion nuevoCamion = new Camion(null, null, null, null, null, null, null, 0,
         * false, false, false, 0, null);
         * empleado.actualizarVehiculo(0, nuevoCamion);
         * 
         * Camioneta nuevoCamioneta = new Camioneta(null, null, null, null, null, null,
         * null, 0, 0, 0, false, false, null, 0, false, false, false, false, false);
         * empleado.actualizarVehiculo(0, nuevoCamioneta);
         * 
         * Deportivo nuevoDeportivo = new Deportivo(null, null, null, null, null, null,
         * null, 0, 0, 0, 0, null);
         * empleado.actualizarVehiculo(0, nuevoDeportivo);
         * 
         * Moto nuevoMoto = new Moto(null, null, null, null, null, null, null);
         * empleado.actualizarVehiculo(0, nuevoMoto);
         * 
         * Sedan nuevoSedan = new Sedan(null, null, null, null, null, null, null, 0, 0,
         * 0, false, false, null, 0, false, false, false, false);
         * empleado.actualizarVehiculo(0, nuevoSedan);
         * 
         * PickUp nuevoPickUp = new PickUp(null, null, null, null, null, null, null, 0,
         * 0, false, false, 0, false, false, null);
         * empleado.actualizarVehiculo(0, nuevoPickUp);
         */

        // Creacion de los clientes

    }
}
