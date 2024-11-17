package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.Scanner;

public class Empleado extends Usuario {
    private LinkedList<Vehiculo> vehiculos;
    private LinkedList<Cliente> clientes;

    public Empleado(String nombre, String correo, String usuario, int contraseña) {
        super(nombre, correo, usuario, contraseña);
        vehiculos = new LinkedList<>();
        clientes = new LinkedList<>();
    }

    public LinkedList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(LinkedList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public LinkedList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(LinkedList<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Empleado []" + super.toString();
    }

    // Registrar vehiculo

    public void registrarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    // Actualizar Vehiculo

    public void actualizarVehiculo(int indice, Vehiculo nuevoVehiculo) {
        if (indice >= 0 && indice < vehiculos.size()) {
            vehiculos.set(indice, nuevoVehiculo);
            System.out.println("Vehículo actualizado correctamente.");
        } else {
            System.out.println("Índice de vehículo inválido.");
        }
    }

    // Buscar vehiculo por marca

    public void buscarVehiculoPorMarca() {
        if (vehiculos == null || vehiculos.isEmpty()) {
            System.out.println("No hay vehículos registrados para buscar.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué marca de vehículo estás buscando?");
        String marcaBuscada = scanner.nextLine();

        boolean encontrado = false;

        for (Vehiculo vehi : vehiculos) {
            if (vehi.getMarca().equalsIgnoreCase(marcaBuscada)) {
                System.out.println("Vehículo encontrado: " + vehi);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Lo siento, no se encontró ningún vehículo de la marca: " + marcaBuscada);
        }
    }

    // Registrar el cliente

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente registrado correctamente.");
    }

    // Método para actualizar la información de un cliente
    public void actualizarCliente(String identificacionCliente, String nuevoNombre, String nuevaPreferencia) {
        for (Cliente cliente : clientes) {
            if (cliente.getIdentificacion().equals(identificacionCliente)) {
                cliente.setNombre(nuevoNombre);
                cliente.setPreferencias(nuevaPreferencia);
                System.out.println("Cliente actualizado correctamente.");
                return;
            }
        }
        System.out.println("Cliente no encontrado.");
    }

    // Método para mostrar la lista de clientes
    public void mostrarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            System.out.println("Lista de clientes registrados:");
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        }
    }

    // Menú principal para gestionar clientes
    public void menu() {
        Scanner scanner = new Scanner(System.in);  // Mantén el Scanner abierto aquí

        int opcion = 0;
        do {
            System.out.println("\n--- Menú de Gestión de Clientes ---");
            System.out.println("1. Registrar nuevo cliente");
            System.out.println("2. Actualizar cliente");
            System.out.println("3. Mostrar clientes");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            // Validación para asegurar que se ingrese un número
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();  // Limpiar el buffer del scanner después de nextInt
            } else {
                System.out.println("Entrada inválida, por favor ingresa un número entero.");
                scanner.nextLine();  // Limpiar el buffer
                continue;  // Volver al inicio del ciclo para pedir la opción nuevamente
            }

            switch (opcion) {
                case 1:
                    // Registrar nuevo cliente
                    System.out.println("Ingrese los datos del nuevo cliente:");
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Identificación: ");
                    String identificacion = scanner.nextLine();
                    System.out.print("Preferencias: ");
                    String preferencias = scanner.nextLine();

                    Cliente clienteNuevo = new Cliente(nombre, identificacion, preferencias);
                    registrarCliente(clienteNuevo);
                    break;

                case 2:
                    // Actualizar cliente
                    System.out.print("Ingrese la identificación del cliente a actualizar: ");
                    String identificacionClienteActualizar = scanner.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = scanner.nextLine();
                    System.out.print("Nueva preferencia: ");
                    String nuevaPreferencia = scanner.nextLine();

                    actualizarCliente(identificacionClienteActualizar, nuevoNombre, nuevaPreferencia);
                    break;

                case 3:
                    // Mostrar todos los clientes
                    mostrarClientes();
                    break;

                case 4:
                    // Salir del programa
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida, por favor intente nuevamente.");
                    break;
            }
        } while (opcion != 4);

    }

    public void realizarVenta() {
        Scanner scanner = new Scanner(System.in);

        // Verificar si hay vehículos disponibles
        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehículos disponibles para la venta.");
            return;
        }

        // Mostrar la lista de vehículos disponibles
        System.out.println("Vehículos disponibles para la venta:");
        for (int i = 0; i < vehiculos.size(); i++) {
            System.out.println((i + 1) + ". " + vehiculos.get(i).toString());
        }

        // Solicitar al usuario que seleccione un vehículo
        System.out.println("Seleccione el número del vehículo que desea vender (o 0 para cancelar):");
        int opcion = scanner.nextInt();

        // Validar la opción ingresada
        if (opcion == 0) {
            System.out.println("Venta cancelada.");
            return;
        }

        if (opcion < 1 || opcion > vehiculos.size()) {
            System.out.println("Opción no válida. Por favor, intente de nuevo.");
            return;
        }

        // Realizar la venta
        Object vehiculoVendido = vehiculos.remove(opcion - 1);
        System.out.println("¡Venta exitosa! El siguiente vehículo ha sido vendido:");
        System.out.println(vehiculoVendido.toString());
    }

        //Realizar alquiler
        public void realizarAlquiler() {
        Scanner scanner = new Scanner(System.in);

        // Verificar si hay vehículos disponibles
        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehículos disponibles para un alquiler.");
            return;
        }

        // Mostrar la lista de vehículos disponibles
        System.out.println("Vehículos disponibles para un alquiler:");
        for (int i = 0; i < vehiculos.size(); i++) {
            System.out.println((i + 1) + ". " + vehiculos.get(i).toString());
        }

        // Solicitar al usuario que seleccione un vehículo
        System.out.println("Seleccione el número del vehículo que desea alquilar (o 0 para cancelar):");
        int opcion = scanner.nextInt();

        // Validar la opción ingresada
        if (opcion == 0) {
            System.out.println("Alquiler cancelada.");
            return;
        }

        if (opcion < 1 || opcion > vehiculos.size()) {
            System.out.println("Opción no válida. Por favor, intente de nuevo.");
            return;
        }

        // Realizar la venta
        Object vehiculoVendido = vehiculos.remove(opcion - 1);
        System.out.println("¡Alquiler exitoso! El siguiente vehículo ha sido Alquilado:");
        System.out.println(vehiculoVendido.toString());
    }

    // Método para mostrar todos los vehículos (opcional)

    public void mostrarVehiculos() {
        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehículos registrados.");
        } else {
            System.out.println("Vehículos registrados:");
            for (Object vehiculo : vehiculos) {
                System.out.println(vehiculo.toString());
            }
        }
    }

}
