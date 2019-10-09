package dominio.casosDeUso.compañia;

import dominio.modelo.accion.compañia.Listar;
import dominio.modelo.clases.Compañia;
import lombok.AllArgsConstructor;

import javax.inject.Inject;
import java.math.BigInteger;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletionStage;


public class ListarCompañia {

    private final Listar listar;

    @Inject
    public ListarCompañia(Listar listar) {
        this.listar = listar;
    }

    public CompletionStage<Compañia> listarIdentificacion(BigInteger identificacion) {
        return this.listar.listarIdentificacion(identificacion);
    }

    public CompletionStage<List<Compañia>> listarTodos() {
        return this.listar.listarTodos();
    }

    private Boolean validacionSumaMayorDiezMil(BigInteger numero) {
        return Boolean.TRUE;
    }


}
