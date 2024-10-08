package co.edu.uniquindio.poo;

public class Gato extends AnimalDomestico {
    private String colorPelaje;

    public Gato(String nombre, int edad, double peso, String habitad, String instinto, String dueño,
            String tipoDeMascota, String colorPelaje) {
        super(nombre, edad, peso, habitad, instinto, dueño, tipoDeMascota);
        this.colorPelaje = colorPelaje;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    @Override
    public String toString() {
        return "Gato [colorPelaje=" + colorPelaje + ", getDueño()=" + getDueño() + ", getNombre()=" + getNombre()
                + ", getEdad()=" + getEdad() + ", getPeso()=" + getPeso() + "]";
    }




}
