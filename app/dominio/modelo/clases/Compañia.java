package dominio.modelo.clases;

import dominio.modelo.excepcion.compañia.ExcepcionExistencia;
import dominio.modelo.excepcion.compañia.mensajes.ExcepcionExistenciaMensajes;
import dominio.modelo.validacion.ValidacionNumero;
import dominio.modelo.validacion.ValidacionString;
import lombok.Builder;
import lombok.Value;

import java.math.BigInteger;
import java.util.ArrayList;

@Builder(toBuilder = true)
@Value
public class Compañia {

    private String nombre;
    private String direccion;
    private BigInteger identificacion;

    public Compañia(String nombre, String direccion, BigInteger identificacion) {

        ArrayList<String> listadoExcepciones = new <String>ArrayList<String>();

        if (ValidacionString.estaVacioONulo(nombre)) {
            listadoExcepciones.add(ExcepcionExistenciaMensajes.NOMBRE_OBLIGATORIO);
        }

        if (ValidacionString.estaVacioONulo(direccion)) {
            listadoExcepciones.add(ExcepcionExistenciaMensajes.DIRECCION_OBLIGATORIO);
        }

        if (ValidacionNumero.esNulo(identificacion)) {
            listadoExcepciones.add(ExcepcionExistenciaMensajes.IDENTIFICACION_OBLIGATORIO);
        }

        if (!listadoExcepciones.isEmpty()) {
            throw new ExcepcionExistencia(listadoExcepciones);
        }

        this.nombre = nombre;
        this.direccion = direccion;
        this.identificacion = identificacion;
    }
}
