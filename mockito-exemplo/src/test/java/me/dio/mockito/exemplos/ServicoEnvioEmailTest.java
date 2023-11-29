package me.dio.mockito.exemplos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ServicoEnvioEmailTest {

    @Mock
    private PlataformaDeEnvio plataforma;

    @InjectMocks
    private ServicoEnvioEmail servico;
    @Captor
    private ArgumentCaptor<Email> captor;

    @Test
    void validarDadosEnviadosParaAPlataforma(){
        String enderecoEmail = "usuario@test.com.br";
        String mensagem = "Olá mundo, teste mensagem";
        boolean ehFormatoHtml = true;

        servico.enviaEmail(enderecoEmail, mensagem, ehFormatoHtml);

        Mockito.verify(plataforma).enviaEmail(captor.capture());
        Email emailCapturado = captor.getValue();

        Assertions.assertEquals(enderecoEmail,emailCapturado.getEnderecoEmail());
        Assertions.assertEquals(mensagem,emailCapturado.getMensagem());
        Assertions.assertEquals(Formato.HTML ,emailCapturado.getFormato());
    }

}
