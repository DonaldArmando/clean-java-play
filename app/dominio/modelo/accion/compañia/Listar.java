package dominio.modelo.accion.compañia;

import dominio.modelo.clases.Compañia;

import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.CompletionStage;

public interface Listar {

    CompletionStage<Compañia> listarIdentificacion(BigInteger identificacion);

    CompletionStage<List<Compañia>> listarTodos();


}
