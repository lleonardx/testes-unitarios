package one.digitalinnovation.junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

public class ConsultarDadosDePessoaTest {

    @BeforeAll
    static void configuraConexao(){
        BancoDeDados.iniciarConexao();
    }
    @BeforeEach
    void insereDadosParaTeste(){
        BancoDeDados.insereDados("Joao", LocalDateTime.of(2000, 1,1,13,0,0));
    }
    @AfterEach
    void removeDadosParaTeste(){
        BancoDeDados.removeDados("Joao", LocalDateTime.of(2000, 1,1,13,0,0));
    }
    @Test
    void validarDadosDeRetorno(){
        assertTrue(true);
    }
    @Test
    void validarDadosDeRetorno2(){
        assertNull(null);
    }
    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
    }
}
