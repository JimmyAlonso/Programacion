package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedList;

public class Reunion {                                                      //Se crean Atributos, constructor, getters, setters y toString
    private String descripcion;                                             //para la clase reunion
    private LocalDate fecha;
    private LocalTime hora;
    private LinkedList<Contacto> asistentes;
    
    public Reunion(String descripcion, LocalDate fecha, LocalTime hora) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        asistentes = new LinkedList<>();
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public LocalTime getHora() {
        return hora;
    }
    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    public LinkedList<Contacto> getAsistentes() {
        return asistentes;
    }
    public void setAsistentes(LinkedList<Contacto> asistentes) {
        this.asistentes = asistentes;
    }
    @Override
    public String toString() {
        return "" + descripcion + "\nFecha de la reunion : " + fecha + "\nHora de la reunion : " + hora + "\n\nPersonas asistentes a la reunion : \n\n"
                + asistentes;
    }
    
    public void agregarContactoReunion(Contacto contacto){                                             //Funcion para agregar contactos a lista de contactos
        if(validarNombreyTelefono(contacto.getNombres(), contacto.getTelefono())){
            Contacto.mostrarMensaje("Error el contacto ya esta registrado \n\n");
        }else {
            asistentes.add(contacto);
        }
    }
    
    public boolean validarNombreyTelefono(String nombres, String telefono){                      //Funcion para validar que el nombre y el telfono
        for (Contacto contacto : asistentes) {                                                   // no sean los mismos
            if (contacto.getNombres().equals(nombres)){
                if(contacto.getTelefono().equals(telefono))
                return true;
            }
        } return false;
    }
    
    public void eliminarContacto(String nombres, String telefono){              //Funcion para eliminar un contacto en reunion
        for (Contacto contacto : asistentes) {
            if (contacto.getNombres().equals(nombres)){
                if(contacto.getTelefono().equals(telefono))
                asistentes.remove(contacto);
                break;
            }
        }
    }

    public void actualizarContactosReunion(String telefono, String nombres, String correo){             //Funcion para actualizar un contacto en reunion
        for (Contacto contacto:asistentes){
            if (contacto.getNombres().equals(nombres)){
                contacto.setTelefono(telefono);
                contacto.setCorreo(correo);
                break;
            }
        }
    }
}



