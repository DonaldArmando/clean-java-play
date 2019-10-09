package dominio.modelo.excepcion.compañia.mensajes;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ExcepcionExistenciaPreviaMensajes {

    public static final String COMPAÑIA_EXISTENTE = "Esta compañia ya fue creada";

}
