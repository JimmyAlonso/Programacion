package co.edu.uniquindio.poo;


public class App {
    public static void main(String[] args) {
        
        //Veterinaria principal
        Veterinaria veterinaria = new Veterinaria("Veterinaria 1");

        //Crear Aves generalmente
        Ave ave1 = new Ave("Teo", 12, 1.3, "sabana", "Agresivo", "Tucan", 2);
        Ave ave2 = new Ave("Lu", 3, 2.2, "sabana", "Amigable", "Tucan", 4);

        //Crear Canarios individualmente
        Canario canario1 = new Canario("Canarioti", 2, 6.6, "Jungla", "Amigable", "Canario", 4);

        //Crear Aguilas individualmente
        Aguila aguila1 = new Aguila("Aguiloti", 5, 3.3, "Jungla", "Amigable", "Aguila", 8);

        //Crear Leones
        Leon leon1 = new Leon("Leon", 2, 33.2, "Selva", "Agresivo", "larga", "Alta");
        Leon leon2 = new Leon("Leon2", 4, 44.2, "Selva", "Agresivo", "Corta", "Alta");

        //Crear Gatos
        Gato gato1 = new Gato("Alvin", 4, 5, null, null, "Villegas", "Amigable", "Amarillo");

        //Crear Perros
        Perro perro1 = new Perro("Kiara", 10, 10, null, null, "Jimmy", "Amigable", "Huzky");


        //Agregar Aves, Leones o Aguilas a Animales
        veterinaria.agregarAnimal(ave1);
        veterinaria.agregarAnimal(ave2);
        
        veterinaria.agregarAnimal(leon1);
        veterinaria.agregarAnimal(leon2);

        veterinaria.agregarAnimal(aguila1);

        //Agregar Gatos, Perros o Canarios a Animales Domesticos
        veterinaria.agregarAnimalDomestico(gato1);
        
        veterinaria.agregarAnimalDomestico(perro1);

        veterinaria.agregarAnimal(canario1);
        
        Veterinaria.mostrarMensaje(veterinaria.toString());

    }
}
