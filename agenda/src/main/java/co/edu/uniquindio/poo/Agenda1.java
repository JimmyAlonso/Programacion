package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Agenda1 {
    private String nombre;
    private LinkedList<Grupo> grupos;
    private LinkedList<Contacto> contactos;
    private LinkedList<Reunion> reuniones;
    
    public Agenda1(String nombre) {
        this.nombre = nombre;
        grupos = new LinkedList<>();
        contactos = new LinkedList<>();
        reuniones = new LinkedList<>();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(LinkedList<Grupo> grupos) {
        this.grupos = grupos;
    }

    public LinkedList<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(LinkedList<Contacto> contactos) {
        this.contactos = contactos;
    }

    public LinkedList<Reunion> getReuniones() {
        return reuniones;
    }

    public void setReuniones(LinkedList<Reunion> reuniones) {
        this.reuniones = reuniones;
    }

    @Override
    public String toString() {
        return "En la agenda " + nombre + ", se ecuentran los siguientes grupos : " + grupos + ", Los siguientes contactos : " + contactos + ", las reuniones programadas : "
                + reuniones;
    }
    
    public void agregarGrupos(Grupo grupo){
        grupos.add(grupo);
    }

    public void agregarReunion(Reunion reunion){
        reuniones.add(reunion);
    }
    
    public void agregarContacto(Contacto contacto){
        contactos.add(contacto);
    }
}
