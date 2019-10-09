package infraestructura.baseDeDatos.compañia;

import java.math.BigInteger;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class ExistenciaCompañia implements dominio.modelo.accion.compañia.Existencia {

    @Override
    public CompletionStage<Boolean> existencia(BigInteger identificacion) {
        return CompletableFuture.completedStage(Boolean.FALSE);
    }
}
