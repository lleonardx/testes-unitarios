package one.digitalinnovation.junit;

import java.util.logging.Logger;

public class BancoDeDados {
    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());
    public static void iniciarConexao(){
        LOGGER.info("Iniciou conexão");
    }
    public static void finalizarConexao(){
        LOGGER.info("Finalizou conexão");
    }
    public static void insereDados(Pessoa pessoa){
        //Insere no BD
        LOGGER.info("Inseriu Dados");
    }
    public static void removeDados(Pessoa pessoa){
        //Remove no BD
        LOGGER.info("Removeu Dados");
    }
}
