package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.LocalTime;

public class App {
    public static void main(String[] args) {
        Contacto contacto1 = new Contacto("Jimmy", "Alonso", "Cra 13", "3122047519", "Jimmy@gmail.com");
        Contacto contacto2 = new Contacto("Sebas", "Alonso", "Cra 13", "31467047519", "sebas@gmail.com");
        Contacto contacto3 = new Contacto("Guider", "Alonso", "Cra 13", "3122047568", "guider@gmail.com");
        Contacto contacto4 = new Contacto("Yeimy", "Daniela", "Cra 16", "3126747568", "yeimy@gmail.com");
        Contacto contacto5 = new Contacto("Daniel", "calderon", "Cra 17", "3127847568", "daniel@gmail.com");
        Contacto contacto6 = new Contacto("Maicol", "murillo", "Cra 19", "312235568", "maicol@gmail.com");
        Contacto contacto7 = new Contacto("Juanes", "herrera", "Cra 12", "3129867568", "juanes@gmail.com");

        //Se creo la reunion y se agregaron los integrantes

        Reunion reunion = new Reunion("Reunion de familia", LocalDate.now(), LocalTime.now());
        reunion.agregarContactoReunion(contacto1);
        reunion.agregarContactoReunion(contacto2);
        reunion.agregarContactoReunion(contacto3);

        Contacto.mostrarMensaje(reunion.toString());

        //Se crearon los grupos y/o categorias FAMILIA, AMIGOS, OFICINA, FIESTA

        Grupo contactos = new Grupo("Familia", Grupo.Categoria.FAMILIA);
        contactos.agregarContacto(contacto1);
        contactos.agregarContacto(contacto2);
        contactos.agregarContacto(contacto3);
        contactos.agregarContacto(contacto4);
        contactos.agregarContacto(contacto5);

        Contacto.mostrarMensaje(contactos.toString());

        Grupo contactos2 = new Grupo("Amigos", Grupo.Categoria.AMIGOS);
        contactos2.agregarContacto(contacto6);
        contactos2.agregarContacto(contacto2);
        contactos2.agregarContacto(contacto7);
        contactos2.agregarContacto(contacto4);
        contactos2.agregarContacto(contacto5);

        Contacto.mostrarMensaje(contactos2.toString());

        Grupo contactos3 = new Grupo("Oficina", Grupo.Categoria.OFICINA);
        contactos3.agregarContacto(contacto3);
        contactos3.agregarContacto(contacto2);
        contactos3.agregarContacto(contacto1);
        contactos3.agregarContacto(contacto4);
        contactos3.agregarContacto(contacto7);

        Contacto.mostrarMensaje(contactos3.toString());

        Grupo contactos4 = new Grupo("Fiesta", Grupo.Categoria.FIESTA);
        contactos4.agregarContacto(contacto6);
        contactos4.agregarContacto(contacto7);
        contactos4.agregarContacto(contacto3);
        contactos4.agregarContacto(contacto4);
        contactos4.agregarContacto(contacto2);

        Contacto.mostrarMensaje(contactos4.toString());


        //Verificar si el contacto ya existe en grupos
        
        String apodo = "Maria";
        String numero = "3314677519";
        boolean existe = contactos.validarNombreyTelefono(apodo, numero);
        if(existe){ 
            Contacto.mostrarMensaje("El estudiante " +apodo+ " con el telefono " +numero+ " ya existe");
        }else{
            Contacto.mostrarMensaje("El estudiante " +apodo+ " con el telefono " +numero+ " no existe");
        }

        //Verificar si el contacto ya existe en reunion

        String apodoDos = "Maria";
        String numeroDos = "3314677519";
        boolean existeDos = reunion.validarNombreyTelefonoReunion(apodoDos, numeroDos);
        if(existeDos){ 
            Contacto.mostrarMensaje("El estudiante " +apodo+ " con el telefono " +numero+ " ya existe");
        }else{
            Contacto.mostrarMensaje("El estudiante " +apodo+ " con el telefono " +numero+ " no existe");
        }

        //Eliminar un contacto en grupos

        contactos.eliminarContacto("Jimmy", "3122047519");
        Contacto.mostrarMensaje(reunion.toString());
        Contacto.mostrarMensaje(contactos.toString());
        Contacto.mostrarMensaje(contactos2.toString());
        Contacto.mostrarMensaje(contactos3.toString());
        Contacto.mostrarMensaje(contactos4.toString());

        //Eliminar un contacto en reunion
        reunion.eliminarContacto("Jimmy", "3122047519");
        Contacto.mostrarMensaje(reunion.toString());
        Contacto.mostrarMensaje(contactos.toString());
        Contacto.mostrarMensaje(contactos2.toString());
        Contacto.mostrarMensaje(contactos3.toString());
        Contacto.mostrarMensaje(contactos4.toString());

        //Actualizar un contacto en grupos

        contactos.actualizarContactos("Juanito", "3324847738", "juantito@gmail.com");
        Contacto.mostrarMensaje(reunion.toString());
        Contacto.mostrarMensaje(contactos.toString());
        Contacto.mostrarMensaje(contactos2.toString());
        Contacto.mostrarMensaje(contactos3.toString());
        Contacto.mostrarMensaje(contactos4.toString());

        //Actualizar un contacto en reunion

        reunion.actualizarContactosReunion("Juanito", "3324847738", "juantito@gmail.com");
        Contacto.mostrarMensaje(reunion.toString());
        Contacto.mostrarMensaje(contactos.toString());
        Contacto.mostrarMensaje(contactos2.toString());
        Contacto.mostrarMensaje(contactos3.toString());
        Contacto.mostrarMensaje(contactos4.toString());   
    }
}
