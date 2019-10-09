package dominio.modelo.accion.compañia;

import java.util.concurrent.CompletionStage;

public interface Eliminar {

    CompletionStage<Void> eliminar(String identificacion);


}
