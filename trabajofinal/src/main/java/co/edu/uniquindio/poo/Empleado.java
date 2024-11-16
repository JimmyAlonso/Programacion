package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.Scanner;

public class Empleado extends Usuario {
    private LinkedList<Vehiculo> vehiculos;


    public Empleado(String nombre, String correo, String usuario, String contraseña) {
        super(nombre, correo, usuario, contraseña);
        vehiculos = new LinkedList<>();
    }

    @Override
    public String toString() {
        return "Empleado []" + super.toString();
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        System.out.println("Vehículo registrado correctamente.");
    }

    public void actualizarVehiculo(int indice, Vehiculo nuevoVehiculo) {
        if (indice >= 0 && indice < vehiculos.size()) {
            vehiculos.set(indice, nuevoVehiculo);
            System.out.println("Vehículo actualizado correctamente.");
        } else {
            System.out.println("Índice de vehículo inválido.");
        }
    }

    public void buscarVehiculoPorMarca() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué tipo de vehículo estás buscando?");
        String tipoBuscado = scanner.nextLine();

        boolean encontrado = false;
        for (Vehiculo vehi : vehiculos) {
            if (scanner.hasNextInt()) {
            if (vehi.getMarca().equalsIgnoreCase(tipoBuscado)) {
                System.out.println("Vehículo encontrado: " + vehi.getMarca());
                encontrado = true;
                break;
            }
        }
        if (scanner.hasNextInt()) {
        if (!encontrado) {
            System.out.println("Lo siento, no se encontró ningún vehículo de tipo: " + tipoBuscado);
        }

        scanner.close();
    }
}
}
}


