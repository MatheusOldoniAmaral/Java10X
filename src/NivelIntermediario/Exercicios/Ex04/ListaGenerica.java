package NivelIntermediario.Exercicios.Ex04;

import java.util.ArrayList;
import java.util.List;

public class ListaGenerica<T> {
    private List<T> itens = new ArrayList<>();

    public ListaGenerica() {
    }

    public ListaGenerica(List<T> itens) {
        this.itens = itens;
    }

    public List<T> getItens() {
        return itens;
    }

    public void setItens(List<T> itens) {
        this.itens = itens;
    }

    public void adicionar(T item) {
        itens.add(item);
    }

    public void remover(T item) {
        itens.remove(item);
    }

    public boolean verificar(T item) {
        return itens.contains(item);
    }

    public void mostrarTodos() {
        for (T item : itens) {
            System.out.println(item);
        }
    }

    @Override
    public String toString() {
        return "ListaGenerica{" +
                "itens=" + itens +
                '}';
    }
}
