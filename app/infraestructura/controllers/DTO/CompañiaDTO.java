package infraestructura.controllers.DTO;

import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.Value;

import java.math.BigInteger;


public class CompañiaDTO {

    private String nombre;
    private String direccion;
    private BigInteger identificacion;

    public CompañiaDTO() {
    }

    public CompañiaDTO(String nombre, String direccion, BigInteger identificacion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public BigInteger getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(BigInteger identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public String toString() {
        return "CompañiaDTO{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", identificacion=" + identificacion +
                '}';
    }
}
