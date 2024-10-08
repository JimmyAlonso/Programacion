package co.edu.uniquindio.poo;

public class Ave extends Animal {
    private String Ave; 
    private int Alas;

    public Ave(String nombre, int edad, double peso, String habitad, String instinto, String ave, int alas) {
        super(nombre, edad, peso, habitad, instinto);
        Ave = ave;
        Alas = alas;
    }

    public String getAve() {
        return Ave;
    }

    public void setAve(String ave) {
        Ave = ave;
    }

    public int getAlas() {
        return Alas;
    }

    public void setAlas(int alas) {
        Alas = alas;
    }

    @Override
    public String toString() {
        return "Ave [Ave=" + Ave + ", Alas=" + Alas + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad()
                + ", getHabitad()=" + getHabitad() + ", getInstinto()=" + getInstinto() + ", getPeso()=" + getPeso()
                + "]";
    } 
    
}
