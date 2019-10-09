package dominio.modelo.excepcion.compañia.mensajes;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ExcepcionExistenciaMensajes {

    public static final String NOMBRE_OBLIGATORIO = "El nombre debe ser obligatorio";
    public static final String DIRECCION_OBLIGATORIO = "La direccion debe ser obligatoria";
    public static final String IDENTIFICACION_OBLIGATORIO = "La identificacion debe ser obligatoria";

}
