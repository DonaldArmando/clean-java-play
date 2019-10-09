package dominio.casosDeUso.compañia;

import dominio.modelo.accion.compañia.Crear;
import dominio.modelo.accion.compañia.Existencia;
import dominio.modelo.clases.Compañia;
import dominio.modelo.excepcion.compañia.ExcepcionExistenciaPrevia;
import dominio.modelo.excepcion.compañia.mensajes.ExcepcionExistenciaPreviaMensajes;
import dominio.modelo.fabrica.compañia.FabricaCompañia;

import javax.inject.Inject;
import java.util.concurrent.CompletionStage;

public class CrearCompañia {

    private final Crear crearCompañia;
    private final Existencia existenciaCompañia;

    @Inject
    public CrearCompañia(Crear crearCompañia, Existencia existenciaCompañia) {
        this.crearCompañia = crearCompañia;
        this.existenciaCompañia = existenciaCompañia;
    }

    public CompletionStage<Compañia> crear(Compañia compañia) {
        return this.existenciaCompañia
                .existencia(compañia.getIdentificacion())
                .thenApply(existe -> {
                    if (existe) {
                        return new ExcepcionExistenciaPrevia(ExcepcionExistenciaPreviaMensajes.COMPAÑIA_EXISTENTE);
                    }
                    return compañia;
                })
                .thenCompose(ignorar -> this.crearCompañia
                        .crear(
                                FabricaCompañia
                                        .construirCompañia(
                                                compañia.getNombre(),
                                                compañia.getDireccion(),
                                                compañia.getIdentificacion()
                                        )
                        )
                );

    }


}
