package dominio.modelo.fabrica.compañia;


import dominio.modelo.clases.Compañia;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FabricaCompañia {


    public static Compañia construirCompañia(
            String nombre,
            String direccion,
            BigInteger identificacion
    ) {
        return Compañia
                .builder()
                .direccion(direccion)
                .identificacion(identificacion)
                .nombre(nombre)
                .build();
    }


}
