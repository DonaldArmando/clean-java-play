package dominio.modelo.validacion;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.Objects;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ValidacionNumero {

    public static Boolean esNulo(BigInteger bigInteger) {

        if (Objects.isNull(bigInteger)) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

}
