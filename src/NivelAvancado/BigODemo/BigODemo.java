package NivelAvancado.BigODemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class BigODemo {
    static final int N = 100_000;
    static final int REPETICOES = 1000;

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        System.out.printf("%-15s %12s %12s%n", "Operação", "ArrayList", "LinkedList");

        comparar("get(meio)", arrayList, linkedList, l -> l.get(N / 2));
        comparar("add(início)", arrayList, linkedList, l -> l.add(0, -1));
        comparar("remove(início)", arrayList, linkedList, l -> l.remove(0));
        comparar("contains", arrayList, linkedList, l -> l.contains(-2));
    }

    static void comparar(String nome, List<Integer> a, List<Integer> b, Consumer<List<Integer>> op) {
        long tempoA = medir(a, op);
        long tempoB = medir(b, op);
        System.out.printf("%-15s %9d ms %9d ms%n", nome, tempoA, tempoB);
    }

    // Executa a operação várias vezes e devolve o tempo total em ms
    static long medir(List<Integer> lista, Consumer<List<Integer>> op) {
        long inicio = System.nanoTime();
        for (int i = 0; i < REPETICOES; i++) {
            op.accept(lista);
        }
        return (System.nanoTime() - inicio) / 1_000_000;
    }
}
