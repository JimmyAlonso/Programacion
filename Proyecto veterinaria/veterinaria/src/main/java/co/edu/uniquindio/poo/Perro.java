package co.edu.uniquindio.poo;

public class Perro extends AnimalDomestico {
    private String raza;

    public Perro(String nombre, int edad, double peso, String habitad, String instinto, String dueño,
            String tipoDeMascota, String raza) {
        super(nombre, edad, peso, habitad, instinto, dueño, tipoDeMascota);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro [raza=" + raza + ", getDueño()=" + getDueño() + ", getNombre()=" + getNombre() + ", getEdad()="
                + getEdad() + ", getPeso()=" + getPeso() + "]";
    }




    
    
}
