package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        GestorAutenticacion gestor = new GestorAutenticacion();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Sistema de Autenticación ---");

        boolean ejecutar = true;
        while (ejecutar) {
            System.out.println("\n1. Registrar");
            System.out.println("2. Iniciar Sesión");
            System.out.println("3. Cerrar Sesión");
            System.out.println("4. Continuar al sistema del concesionario");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    registrarUsuario(gestor, scanner);
                    break;
                case 2:
                    iniciarSesion(gestor, scanner);
                    break;
                case 3:
                    cerrarSesion(gestor, scanner);
                    break;
                case 4:
                    iniciarSistemaConcesionario();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    ejecutar = false;
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
        scanner.close();
    }

    private static void registrarUsuario(GestorAutenticacion gestor, Scanner scanner) {
        System.out.print("Ingrese nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();
        System.out.print("Ingrese contraseña: ");
        String contraseña = scanner.nextLine();
        gestor.registrar(nombreUsuario, contraseña);
    }

    private static void iniciarSesion(GestorAutenticacion gestor, Scanner scanner) {
        System.out.print("Ingrese nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();
        System.out.print("Ingrese contraseña: ");
        String contraseña = scanner.nextLine();
        gestor.iniciarSesion(nombreUsuario, contraseña);
    }

    private static void cerrarSesion(GestorAutenticacion gestor, Scanner scanner) {
        System.out.print("Ingrese nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();
        gestor.cerrarSesion(nombreUsuario);
    }

    public static void iniciarSistemaConcesionario() {
        Scanner scanner = new Scanner(System.in);
        Empleado empleado = new Empleado("Jimmy", "jimmy@gmail.com", "Jimmy Alonso", 3232323);
        Administrador administrador = new Administrador("Juan", "j@gmail.com", "JuanAA", 232424);
        Concesionario concesionario = new Concesionario("Honda");

        System.out.println("Bienvenido al concesionario: " + concesionario.getNombre());
        boolean ejecutar = true;

        while (ejecutar) {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Gestionar Clientes");
            System.out.println("2. Gestionar Empleados");
            System.out.println("3. Registrar y Mostrar Vehículos");
            System.out.println("4. Buscar Vehículo");
            System.out.println("5. Detalles de Vehículo");
            System.out.println("6. Realizar Compra o Alquiler");
            System.out.println("7. Generar Reporte");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    empleado.menu();
                    break;
                case 2:
                    administrador.gestionarEmpleados();
                    break;
                case 3:
                    registrarYMostrarVehiculos(empleado);
                    break;
                case 4:
                    empleado.buscarVehiculoPorMarca();
                    break;
                case 5:
                    mostrarDetallesVehiculos(empleado);
                    break;
                case 6:
                    mostrarMenu(empleado);
                    break;
                case 7:
                    Reporte reporte = new Reporte("234234", LocalDate.now(), LocalDate.of(2025, 2, 21));
                    reporte.agregarTransaccion(new Transaccion("122122", LocalDate.of(2025, 12, 3), TipoTransaccion.COMPRA, empleado));
                    reporte.generarReporte(empleado, TipoTransaccion.COMPRA);
                    break;
                case 8:
                    System.out.println("Saliendo del sistema del concesionario...");
                    ejecutar = false;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intente nuevamente.");
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
    }

    
    public static void registrarYMostrarVehiculos(Empleado empleado) {
        registrarVehiculos(empleado);
        System.out.println("\nVehículos registrados:");
        empleado.mostrarVehiculos();
    }

    public static void registrarVehiculos(Empleado empleado) {
        Van van = new Van("Van", "2008", "Buen estado", "Bajo cilindraje", "200km/h", TipoCombustible.GASOLINA,
                TipoTransmision.MANUAL, 6, 4, 5, true, true, 4, false);
        Bus bus = new Bus("Bus", "1999", "Estado regular", "Bajo cilindraje", "80km/h", TipoCombustible.DIESEL,
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

        // Registro de vehículos
        empleado.registrarVehiculo(van);
        empleado.registrarVehiculo(bus);
        empleado.registrarVehiculo(camion);
        empleado.registrarVehiculo(camioneta);
        empleado.registrarVehiculo(deportivo);
        empleado.registrarVehiculo(moto);
        empleado.registrarVehiculo(sedan);
        empleado.registrarVehiculo(pickUp);
    }

    public static void mostrarDetallesVehiculos(Empleado empleado) {
        Scanner scanner = new Scanner(System.in);
        
        // Mostrar menú para seleccionar el vehículo
        System.out.println("\nSeleccione el vehículo para ver los detalles:");
        System.out.println("1. Van");
        System.out.println("2. Camión");
        System.out.println("3. Camioneta");
        System.out.println("4. Sedan");
        System.out.println("5. Moto");
        System.out.println("6. Bus");
        System.out.println("7. Deportivo");
        System.out.println("8. PickUp");
        System.out.println("9. Salir");
        System.out.print("Seleccione una opción: ");
        
        int opcion = scanner.nextInt();
        
        // Usamos un switch para mostrar los detalles según el vehículo seleccionado
        switch (opcion) {
            case 1:
                mostrarDetallesDeVehiculo(empleado, 0); // Van
                break;
            case 2:
                mostrarDetallesDeVehiculo(empleado, 1); // Camión
                break;
            case 3:
                mostrarDetallesDeVehiculo(empleado, 2); // Camioneta
                break;
            case 4:
                mostrarDetallesDeVehiculo(empleado, 3); // Sedan
                break;
            case 5:
                mostrarDetallesDeVehiculo(empleado, 4); // Moto
                break;
            case 6:
                mostrarDetallesDeVehiculo(empleado, 5); // Bus
                break;
            case 7:
                mostrarDetallesDeVehiculo(empleado, 6); // Deportivo
                break;
            case 8:
                mostrarDetallesDeVehiculo(empleado, 7); // PickUp
                break;
            case 9:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    public static void mostrarDetallesDeVehiculo(Empleado empleado, int indice) {
        if (indice < 0 || indice >= empleado.getVehiculos().size()) {
            System.out.println("Vehículo no encontrado.");
            return;
        }
        
        Vehiculo vehiculo = empleado.getVehiculos().get(indice);
        
        // Mostrar los detalles comunes
        System.out.println("\nDetalles del " + vehiculo.getModelo() + ":");
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Modelo: " + vehiculo.getModelo());
        System.out.println("Estado: " + vehiculo.getEstado());
        System.out.println("Cilindraje: " + vehiculo.getCilindraje());
        System.out.println("Velocidad Máxima: " + vehiculo.getVelocidadMaxima());
        System.out.println("Tipo de Combustible: " + vehiculo.getTipoDeCombustible());
        System.out.println("Tipo de Transmisión: " + vehiculo.getTipoDeTransmision());
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




}




