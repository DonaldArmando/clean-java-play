package infraestructura.consumoAPI.topico.compañia;

import dominio.modelo.accion.compañia.Crear;
import dominio.modelo.clases.Compañia;
import dominio.modelo.fabrica.compañia.FabricaCompañia;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class CrearCompañia implements Crear {

    @Override
    public CompletionStage<Compañia> crear(Compañia compañia) {
        return CompletableFuture.completedStage(
                FabricaCompañia.construirCompañia(
                        Optional
                                .of(compañia)
                                .map(Compañia::getNombre)
                                .orElse(null),
                        Optional
                                .of(compañia)
                                .map(Compañia::getDireccion)
                                .orElse(null),
                        Optional
                                .of(compañia)
                                .map(Compañia::getIdentificacion)
                                .orElse(null)
                )
        );
    }
}
