package one.digitalinnovation.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTest {
    @Test
    @EnabledForJreRange(min=JRE.JAVA_11, max =JRE.JAVA_21)
    void validarAlgoSomenteNoUsuarioLeonardo(){
        Assertions.assertEquals(10, 5+5);
    }
}
