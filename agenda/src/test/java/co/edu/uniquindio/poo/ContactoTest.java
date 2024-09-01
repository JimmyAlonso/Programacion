package co.edu.uniquindio.poo;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ContactoTest {
    private static final Logger LOG = Logger.getLogger(ContactoTest.class.getName());

    @Test
    public void datosvacios() {
        LOG.info("Inicializando test datos vacios");
        assertThrows(Throwable.class, ()->new Contacto(" ", " ", " ", " ", " "));
        LOG.info("Finalizando test datos vacios");
    }
    @Test
    public void validarcorreo() {
        LOG.info("Inicializando test validar correo");
        assertThrows(Throwable.class, ()->new Contacto("Jimmy", "Alonso", "Cra 13", "3122047519", "Jimmy"));
        LOG.info("Finalizando test validar correo");
    }
    @Test
    public void datosvaciosGrupo() {
        LOG.info("Inicializando test datos vacios en grupo");
        assertThrows(Throwable.class, ()-> new Grupo(" ", null));
        LOG.info("Finalizando test datos vacios en grupo");
    }
    @Test
    public void datosvaciosReunion() {
        LOG.info("Inicializando test datos vacios en reunion");
        assertThrows(Throwable.class, ()-> new Reunion(" ", null, null));
        LOG.info("Finalizando test datos vacios en reunion");
    }
}
