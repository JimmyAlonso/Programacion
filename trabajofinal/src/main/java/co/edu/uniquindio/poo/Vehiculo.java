package co.edu.uniquindio.poo;

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



    public static int ingresarEntero(String mensaje){
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        return scanner.nextInt();


    }

    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    
}
