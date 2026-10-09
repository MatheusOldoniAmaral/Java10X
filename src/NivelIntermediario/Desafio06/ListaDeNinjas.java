package NivelIntermediario.Desafio06;

import java.util.LinkedList;

public class ListaDeNinjas {
    LinkedList<Ninja> listaDeNinjas = new LinkedList<>();

    public Ninja removerPrimeiroNinja() {
        return listaDeNinjas.poll();
    }

    public void adicionarNovoNinja(Ninja ninja) {
        listaDeNinjas.add(ninja);
    }

    public void adicionarNovoNinja(String nome, int idade, String aldeia) {
        listaDeNinjas.add(new Ninja(nome, idade, aldeia));
    }

    public void exibirListaNinja() {
        for (Ninja ninja : listaDeNinjas) {
            System.out.println(ninja);
        }
    }

    public boolean verificarSeEstaVazia() {
        return listaDeNinjas.isEmpty();
    }
}
