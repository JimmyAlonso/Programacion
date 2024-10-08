package co.edu.uniquindio.poo;

public class Leon extends Animal {
    private String melena; 
    private String habilidadCazar;

    public Leon(String nombre, int edad, double peso, String habitad, String instinto, String melena,
            String habilidadCazar) {
        super(nombre, edad, peso, habitad, instinto);
        this.melena = melena;
        this.habilidadCazar = habilidadCazar;
    }

    public String getMelena() {
        return melena;
    }

    public String getHabilidadCazar() {
        return habilidadCazar;
    }

    public void setMelena(String melena) {
        this.melena = melena;
    }

    public void setHabilidadCazar(String habilidadCazar) {
        this.habilidadCazar = habilidadCazar;
    }

    @Override
    public String toString() {
        return "Leon [melena=" + melena + ", habilidadCazar=" + habilidadCazar + ", getNombre()=" + getNombre()
                + ", getEdad()=" + getEdad() + ", getHabitad()=" + getHabitad() + ", getInstinto()=" + getInstinto()
                + ", getPeso()=" + getPeso() + "]";
    }

    

    
}
