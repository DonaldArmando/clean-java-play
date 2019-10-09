package infraestructura.baseDeDatos.compañia;

import dominio.modelo.accion.compañia.Listar;
import dominio.modelo.clases.Compañia;
import dominio.modelo.fabrica.compañia.FabricaCompañia;

import javax.inject.Singleton;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

@Singleton
public class ConsultaCompañia implements Listar {

    @Override
    public CompletionStage<Compañia> listarIdentificacion(BigInteger identificacion) {
        return CompletableFuture.completedStage(
                FabricaCompañia.construirCompañia("Nombre", "Direccion", BigInteger.valueOf(123456789))
        );
    }

    @Override
    public CompletionStage<List<Compañia>> listarTodos() {
        return  CompletableFuture.completedStage(
                Arrays.asList(
                        FabricaCompañia.construirCompañia("Nombre 1", "Direccion 1", BigInteger.valueOf(123456789)),
                        FabricaCompañia.construirCompañia("Nombre 2", "Direccion 2", BigInteger.valueOf(123456789))
                )
        );
    }
}
