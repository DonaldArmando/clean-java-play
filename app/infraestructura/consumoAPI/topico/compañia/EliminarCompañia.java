package infraestructura.consumoAPI.topico.compañia;

import dominio.modelo.accion.compañia.Eliminar;

import java.util.concurrent.CompletionStage;

public class EliminarCompañia implements Eliminar {

    @Override
    public CompletionStage<Void> eliminar(String identificacion) {
        return null;
    }
}
