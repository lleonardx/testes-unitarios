package one.digitalinnovation.junit;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    void validarLancamentos(){
        int[] primeiroLancamento = {10,20,30,40,50};
        int[] segundoLancamento = {10,20,30,40,50};

        assertArrayEquals(primeiroLancamento, segundoLancamento);
    }
    @Test
    void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;

        assertNull(pessoa);

        pessoa = new Pessoa("Luciano", LocalDateTime.now());
        assertNotNull(pessoa);
    }
    @Test
    void validarNumerosDeTiposDiferentes(){
        double valor = 5.0;
        double Outrovalor = 5.0;

        assertEquals(valor, Outrovalor);

    }
}
