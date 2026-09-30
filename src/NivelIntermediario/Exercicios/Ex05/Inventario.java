package NivelIntermediario.Exercicios.Ex05;

import java.util.ArrayList;
import java.util.List;

public class Inventario<T> {
    private List<T> itens = new ArrayList<>();

    public void adicionarItem(T item) {
        itens.add(item);
    }

    public void removerItem(T item) {
        itens.remove(item);
    }

    public boolean possuiItem(T item) {
        return itens.contains(item);
    }

    public void listarItens() {
        for (T item : itens) {
            System.out.println(item);
        }
    }
}
