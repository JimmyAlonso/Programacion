package co.edu.uniquindio.poo;
import java.util.LinkedList;

public class Veterinaria {
    private String nombre;
    private LinkedList<AnimalDomestico> animalesDomesticos;
    private LinkedList<Animal> animales;


        public Veterinaria(String nombre) {
        this.nombre = nombre;
        animalesDomesticos = new LinkedList<>();
        animales = new LinkedList<>();
    }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public LinkedList<AnimalDomestico> getAnimalDomesticos() {
            return animalesDomesticos;
        }
        public void setAnimalDomesticos(LinkedList<AnimalDomestico> animalDomesticos) {
            this.animalesDomesticos = animalDomesticos;
        }
        public LinkedList<Animal> getAnimales() {
            return animales;
        }
        public void setAnimales(LinkedList<Animal> animales) {
            this.animales = animales;
        }

        @Override
        public String toString() {
            return "Veterinaria [nombre=" + nombre + ", animalDomesticos=" + animalesDomesticos + ", animales=" + animales
                    + "]";
        }

        public void agregarAnimal(Animal animal){
            animales.add(animal);
        }
        
        public void agregarAnimalDomestico(AnimalDomestico animalDomestico){
            animalesDomesticos.add(animalDomestico);
        }

        public static void mostrarMensaje(String mensaje){
            System.out.println(mensaje);
        }


}
