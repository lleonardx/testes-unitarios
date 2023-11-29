package one.digitalinnovation.junit;

public class Conta {
    private String numeroConta;
    private int saldo;

    public String getNumeroConta() {
        return numeroConta;
    }
    public int getSaldo() {
        return saldo;
    }
    public Conta(String numeroConta, int saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    public void lancaCredito(int valor) {
        this.saldo += valor;
    }

    public void lancaDebito(int valor) {
        this.saldo -= valor;
    }
}
