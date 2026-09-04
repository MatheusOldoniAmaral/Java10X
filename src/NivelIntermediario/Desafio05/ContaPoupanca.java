package NivelIntermediario.Desafio05;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo, TipoConta.POUPANCA);
    }

    private static final double TAXA_DEPOSITO = 0.01;

    @Override
    public void depositar(double valor) {
        saldo += valor - (valor * TAXA_DEPOSITO);
    }
}
