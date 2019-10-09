package dominio.modelo.accion.compañia;

import dominio.modelo.clases.Compañia;

import java.util.concurrent.CompletionStage;

public interface Modificar {

    CompletionStage<Compañia> crear(Compañia compañia);

}
