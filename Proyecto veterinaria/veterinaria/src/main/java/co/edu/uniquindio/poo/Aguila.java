package co.edu.uniquindio.poo;

public class Aguila extends Ave{

    public Aguila(String nombre, int edad, double peso, String habitad, String instinto, String ave, int alas) {
        super(nombre, edad, peso, habitad, instinto, ave, alas);
    }   

    @Override
    public String toString() {
        return " getNombre()=" + getNombre() + ", getEdad()=" + getEdad()
                + ", getHabitad()=" + getHabitad() + ", getInstinto()=" + getInstinto() + ", getPeso()=" + getPeso()
                + "]";
    } 
    
}