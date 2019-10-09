package dominio.modelo.excepcion.compañia;

public class ExcepcionExistenciaPrevia extends RuntimeException {
    public ExcepcionExistenciaPrevia(String message) {
        super(message);
    }
}
