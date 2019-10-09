package dominio.modelo.accion.compañia;

import java.math.BigInteger;
import java.util.concurrent.CompletionStage;

public interface Existencia {

    CompletionStage<Boolean> existencia(BigInteger identificacion);

}
