package NivelIntermediario.Desafio06;

import java.util.Comparator;
import java.util.LinkedList;

public class ListaDeNinjas {
    LinkedList<Ninja> listaDeNinjas = new LinkedList<>();

    public Ninja removerPrimeiroNinja() {
        return listaDeNinjas.poll();
    }

    public void adicionarNovoNinja(Ninja ninja) {
        listaDeNinjas.addFirst(ninja);
    }

    public void adicionarNovoNinja(String nome, int idade, String aldeia) {
        listaDeNinjas.addFirst(new Ninja(nome, idade, aldeia));
    }

    public void exibirListaNinja() {
        for (Ninja ninja : listaDeNinjas) {
            System.out.println(ninja);
        }
    }

    public boolean verificarSeEstaVazia() {
        return listaDeNinjas.isEmpty();
    }

    public void ordenarPorIdade() {
        listaDeNinjas.sort(Comparator.comparingInt(Ninja::getIdade));
    }

    public void ordenarPorNome() {
        listaDeNinjas.sort(Comparator.comparing(Ninja::getNome, String.CASE_INSENSITIVE_ORDER));
    }

    public void ordenarPorAldeia() {
        listaDeNinjas.sort(Comparator.comparing(Ninja::getAldeia, String.CASE_INSENSITIVE_ORDER)
                .thenComparing(Ninja::getNome, String.CASE_INSENSITIVE_ORDER));
    }

    public Ninja buscarPorNome(String nome) {
        for (Ninja ninja : listaDeNinjas) {
            if (ninja.getNome().equalsIgnoreCase(nome)) {
                return ninja;
            }
        }
        return null;
    }
}
