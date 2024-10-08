package co.edu.uniquindio.poo;

public class Animal {
    private String nombre;
    private int edad;
    private double peso;
    private String habitad;
    private String instinto;

    public Animal(String nombre, int edad, double peso, String habitad, String instinto) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.habitad = habitad;
        this.instinto = instinto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    public String getInstinto() {
        return instinto;
    }

    public void setInstinto(String instinto) {
        this.instinto = instinto;
    }

    public double getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Animal [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", habitad=" + habitad + ", instinto="
                + instinto + "]";
    }
    
}
