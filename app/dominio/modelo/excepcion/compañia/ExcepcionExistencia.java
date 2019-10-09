package dominio.modelo.excepcion.compañia;

import java.util.List;

public class ExcepcionExistencia extends RuntimeException {

    public ExcepcionExistencia(List<String> mensajes) {
        super(String.join("/n", mensajes));
    }
}

