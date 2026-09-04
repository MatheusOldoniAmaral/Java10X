package NivelIntermediario.Desafio05;

import java.util.List;
import java.util.ArrayList;

public class Banco {

    private List<ContaBancaria> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    public void transferir(ContaBancaria origem, ContaBancaria destino, double valor) {

    }

    public void transferir(int indiceOrigem, int indiceDestino, double valor) {

    }
}