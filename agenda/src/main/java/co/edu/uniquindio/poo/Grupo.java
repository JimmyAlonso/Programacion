package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Grupo {                                    //Se crean los atributos, setters, getters y toString de la clase grupo
    private String nombre;
    private Categoria categoria;
    private LinkedList<Contacto> listaDeContactos;

    public enum Categoria {
        OFICINA , FIESTA , AMIGOS , FAMILIA }
    
    public Grupo(String nombre, Categoria categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        listaDeContactos = new LinkedList<>();
        assert !nombre.isBlank();

    }

    public String getNombre() {
        return nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public LinkedList<Contacto> getListaDeContactos() {
        return listaDeContactos;
    }

    public void setListaDeContactos(LinkedList<Contacto> listaDeContactos) {
        this.listaDeContactos = listaDeContactos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "El nombre del grupo es : " + nombre + ", la categoria es : " +categoria+ " y se encuentran las siguientes personas : \n"+listaDeContactos;
    }

    public void agregarContacto(Contacto contacto){                                             //Funcion para agregar contactos a lista de contactos
        if(validarNombreyTelefono(contacto.getNombres(), contacto.getTelefono())){
            Contacto.mostrarMensaje("Error el contacto ya esta registrado \n\n");
        }else {
            listaDeContactos.add(contacto);
        }
    }
    
    public boolean validarNombreyTelefono(String nombres, String telefono){                      //Funcion para validar que el nombre y el telfono
        for (Contacto contacto : listaDeContactos) {                                             // no sean los mismos
            if (contacto.getNombres().equals(nombres)){
                if(contacto.getTelefono().equals(telefono))
                return true;
            }
        } return false;
    }

    public void eliminarContacto(String nombres, String telefono){                                //Funcion para eliminar un contacto en clase grupo
        for (Contacto contacto : listaDeContactos) {
            if (contacto.getNombres().equals(nombres)){
                if(contacto.getTelefono().equals(telefono))
                listaDeContactos.remove(contacto);
                break;
            }
        } 
    }

    public void actualizarContactos(String telefono, String nombres, String correo){              //Funcion para actualizar un contacto en clase grupo
        for (Contacto contacto:listaDeContactos){
            if (contacto.getNombres().equals(nombres)){
                contacto.setTelefono(telefono);
                contacto.setCorreo(correo);
                break;
            }
        }
    }

    

}
