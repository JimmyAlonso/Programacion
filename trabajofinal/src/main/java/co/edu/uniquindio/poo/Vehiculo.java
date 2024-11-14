package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String estado;
    private String cilindraje;
    private String velocidadMaxima;
    private TipoCombustible tipoDeCombustible;
    private TipoTransmision tipoDeTransmision;

    public Vehiculo(String marca, String modelo, String estado, String cilindraje, String velocidadMaxima,
            TipoCombustible tipoDeCombustible, TipoTransmision tipoDeTransmision) {
        this.marca = marca;
        this.modelo = modelo;
        this.estado = estado;
        this.cilindraje = cilindraje;
        this.velocidadMaxima = velocidadMaxima;
        this.tipoDeCombustible = tipoDeCombustible;
        this.tipoDeTransmision = tipoDeTransmision;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(String velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public TipoCombustible getTipoDeCombustible() {
        return tipoDeCombustible;
    }

    public void setTipoDeCombustible(TipoCombustible tipoDeCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;
    }

    public TipoTransmision getTipoDeTransmision() {
        return tipoDeTransmision;
    }

    public void setTipoDeTransmision(TipoTransmision tipoDeTransmision) {
        this.tipoDeTransmision = tipoDeTransmision;
    }


    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", estado=" + estado + ", cilindraje=" + cilindraje
                + ", velocidadMaxima=" + velocidadMaxima + ", tipoDeCombustible=" + tipoDeCombustible
                + ", tipoDeTransmision=" + tipoDeTransmision + "]";
    }

    //Registrar un vehiculo
    public void registrarVehiculo() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Registro de Vehículo");
        
        System.out.print("Ingrese la marca: ");
        String marca = scanner.nextLine();
        
        System.out.print("Ingrese el modelo: ");
        String modelo = scanner.nextLine();
        
        System.out.print("Ingrese el estado: ");
        String estado = scanner.nextLine();

        System.out.print("Ingrese el cilindraje: ");
        String cilindraje = scanner.nextLine();

        System.out.print("Ingrese la velociad maxima: ");
        String velocidadMaxima = scanner.nextLine();

         // Crear un nuevo objeto Vehiculo
        Vehiculo nuevoVehiculo = new Vehiculo(marca, modelo, estado, cilindraje, velocidadMaxima, tipoDeCombustible, tipoDeTransmision);

         // Mostrar información del vehículo registrado
        
        System.out.println("\nVehículo Registrado:");
        System.out.println("Marca: " + nuevoVehiculo.getMarca());
        System.out.println("Modelo: " + nuevoVehiculo.getModelo());
        System.out.println("Año: " + nuevoVehiculo.getEstado());
        System.out.println("Placa: " + nuevoVehiculo.getCilindraje());
        System.out.println("Placa: " + nuevoVehiculo.getVelocidadMaxima());
        System.out.println("Tipo de combustible: " + nuevoVehiculo.getTipoDeCombustible());
        System.out.println("Tipo de transmision: " + nuevoVehiculo.getTipoDeTransmision());

        guardarVehiculos(nuevoVehiculo);

    }

    private static List<Vehiculo> vehiculosRegistrados = new ArrayList<>();

    public static void guardarVehiculos(Vehiculo vehiculo) {
        vehiculosRegistrados.add(vehiculo);
    }

    
}
