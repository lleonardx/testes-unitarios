
package one.digitalinnovation.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest  {

@Test
  void validarCenarioDeExcecaoNaTransferencia(){
      Conta contaOrigem = new Conta("123456",0);
      Conta contaDestino = new Conta("456789",100);

      TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

      Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));

      Assertions.assertThrows(IllegalArgumentException.class, () ->
              transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));

  }
}
