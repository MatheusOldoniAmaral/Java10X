package NivelIntermediario.Desafio05;

public abstract class ContaBancaria implements Conta {
    protected String titular;
    protected double saldo;
    TipoConta tipoConta;

    public ContaBancaria(String titular, double saldo, TipoConta tipoConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual " + getSaldo());
    }

    public abstract void depositar(double valor);
}
