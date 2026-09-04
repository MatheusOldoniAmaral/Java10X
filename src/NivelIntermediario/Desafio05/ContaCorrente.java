package NivelIntermediario.Desafio05;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo, TipoConta.CORRENTE);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }
}
