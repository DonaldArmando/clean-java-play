package infraestructura.controllers;

import akka.http.scaladsl.model.HttpHeader;
import dominio.casosDeUso.compañia.CrearCompañia;
import dominio.casosDeUso.compañia.ListarCompañia;
import dominio.modelo.fabrica.compañia.FabricaCompañia;
import infraestructura.controllers.DTO.CompañiaDTO;
import play.libs.Json;
import play.mvc.*;

import javax.inject.Inject;
import java.math.BigInteger;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class HomeController extends Controller {

    private final ListarCompañia listarCompañia;
    private final CrearCompañia crearCompañia;

    @Inject
    public HomeController(ListarCompañia listarCompañia, CrearCompañia crearCompañia) {
        this.listarCompañia = listarCompañia;
        this.crearCompañia = crearCompañia;
    }

    public CompletionStage<Result> index() {
        return this.listarCompañia
                .listarTodos()
                .thenApply(compañias -> ok(Json.toJson(compañias)));
    }

    public CompletionStage<Result> listarPorId(String id) {
        return this.listarCompañia
                .listarIdentificacion(new BigInteger(id))
                .thenApply(compañia -> {
                    if (Objects.isNull(compañia)) {
                        return notFound();
                    }
                    return ok(Json.toJson(compañia));
                });
    }

    public CompletionStage<Result> crear(Http.Request request) {
        return CompletableFuture
                .completedStage(
                        Json.fromJson(request.body().asJson(), CompañiaDTO.class)
                )
                .thenCompose(
                        compañiaDTO ->
                                this.crearCompañia.crear(
                                        FabricaCompañia.construirCompañia(
                                                compañiaDTO.getNombre(),
                                                compañiaDTO.getDireccion(),
                                                compañiaDTO.getIdentificacion()
                                        )
                                )
                )
                .thenApply(compañia -> ok(Json.toJson(compañia)));


    }


    public CompletionStage<Result> update(Http.Request request, String id) {
        return CompletableFuture.completedStage(ok(Json.toJson(request.getHeaders().toMap())));
    }


}


