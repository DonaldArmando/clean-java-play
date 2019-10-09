package infraestructura.consumoAPI.topico.compañia;

import dominio.modelo.accion.compañia.Modificar;
import dominio.modelo.clases.Compañia;
import dominio.modelo.fabrica.compañia.FabricaCompañia;

import java.math.BigInteger;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class ActualizarCompañia implements Modificar {

    @Override
    public CompletionStage<Compañia> crear(Compañia compañia) {
        return CompletableFuture.completedStage(
                FabricaCompañia.construirCompañia("Nombre", "Direccion", BigInteger.valueOf(123456789))
        );
    }
}
