package co.edu.uniquindio.poo;

public class AnimalDomestico extends Animal {
    private String dueño;
    private String tipoDeMascota;
    
    public AnimalDomestico(String nombre, int edad, double peso, String habitad, String instinto, String dueño,
            String tipoDeMascota) {
        super(nombre, edad, peso, habitad, instinto);
        this.dueño = dueño;
        this.tipoDeMascota = tipoDeMascota;
    }
    public String getDueño() {
        return dueño;
    }
    public void setDueño(String dueño) {
        this.dueño = dueño;
    }
    public String getTipoDeMascota() {
        return tipoDeMascota;
    }
    public void setTipoDeMascota(String tipoDeMascota) {
        this.tipoDeMascota = tipoDeMascota;
    }
    @Override
    public String toString() {
        return "AnimalDomestico [dueño=" + dueño + ", tipoDeMascota=" + tipoDeMascota + ", getNombre()=" + getNombre()
                + ", getEdad()=" + getEdad() + ", getPeso()=" + getPeso() + "]";
    }

    
    
}
