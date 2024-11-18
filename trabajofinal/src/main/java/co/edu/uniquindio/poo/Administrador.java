package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.Scanner;

public class Administrador extends Usuario {
    LinkedList<Empleado> empleados;

    public Administrador(String nombre, String correo, String usuario, int contraseña) {
        super(nombre, correo, usuario, contraseña);
        empleados = new LinkedList<>();
    }

    @Override
    public String toString() {
        return "Administrador: " + super.toString();
    }

    public void gestionarEmpleados() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- Gestión de Empleados ---");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Actualizar empleado");
            System.out.println("3. Mostrar empleados");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    agregarEmpleado(scanner);
                    break;
                case 2:
                    actualizarEmpleado(scanner);
                    break;
                case 3:
                    mostrarEmpleados();
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Saliendo del sistema de gestión.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    // Método para agregar un empleado
    private void agregarEmpleado(Scanner scanner) {
        System.out.println("\n--- Agregar Empleado ---");
        System.out.print("Ingrese la contraseña del empleado: ");
        int contraseña = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el correo del empleado: ");
        String correo= scanner.nextLine();
        System.out.print("Ingrese el usuario del empleado: ");
        String usuario  = scanner.nextLine(); 
        Empleado empleado = new Empleado("Jimmy", "jimmy@gmail.com", "Jimmy Alonso", 3232323);
        empleados.add(empleado);
        System.out.println("Empleado agregado: " + nombre + ""+contraseña+""+correo+""+usuario);
    }

    // Método para actualizar un empleado
    private void actualizarEmpleado(Scanner scanner) {
        System.out.println("\n--- Actualizar Empleado ---");
        System.out.print("Ingrese la contraseña del empleado a actualizar: ");
        int contraseña= scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        // Buscar el empleado por ID
        for (Empleado empleado : empleados) {
            if (empleado.getContraseña() == contraseña) {
                System.out.println("Empleado encontrado: " + empleado);
                System.out.print("Ingrese el nuevo nombre del empleado: ");
                String nuevoNombre = scanner.nextLine();
                System.out.print("Ingrese el nuevo correo del empleado: ");
                String nuevoCorreo = scanner.nextLine();
                System.out.print("Ingrese el nuevo usuario del empleado: ");
                String nuevoUsuario = scanner.nextLine();

                empleado.setNombre(nuevoNombre);
                empleado.setCorreo(nuevoCorreo);
                empleado.setUsuario(nuevoUsuario);

                System.out.println("Empleado actualizado exitosamente.");
                return;
            }
        }
        System.out.println("Empleado con ID " + contraseña + " no encontrado.");
    } 

    // Método para mostrar todos los empleados
    private void mostrarEmpleados() {
        System.out.println("\n--- Lista de Empleados ---");
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            for (Empleado empleado : empleados) {
                System.out.println(empleado);
            }
        }
    }

}
