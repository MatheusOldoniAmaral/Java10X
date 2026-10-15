package NivelAvancado.TestesBigO;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Teste {

    private static final int[] TAMANHOS = {
            10_000, 100_000, 1_000_000
    };

    private static final int REPETICOES = 5;
    private static final int VALOR_AUSENTE = -1;

    // Evita que os resultados das operações sejam simplesmente ignorados.
    private static volatile Object resultadoObservado;

    public static void main(String[] args) {
        System.out.println("ESTUDO DE BIG O");
        System.out.println("ArrayList vs. LinkedList");
        System.out.println("Tempos exploratórios em milissegundos.");

        for (int tamanho : TAMANHOS) {
            System.out.println("\n====================================");
            System.out.println("Elementos: " + tamanho);
            System.out.println("====================================");

            List<Integer> arrayList = criarArrayList(tamanho);
            List<Integer> linkedList = criarLinkedList(tamanho);

            compararAcesso(arrayList, linkedList, tamanho);
            compararBusca(arrayList, linkedList);
            compararInsercaoInicio(arrayList, linkedList);
            compararRemocaoInicio(arrayList, linkedList);
            compararInsercaoFim(arrayList, linkedList);
        }
    }

    private static List<Integer> criarArrayList(int tamanho) {
        ArrayList<Integer> lista = new ArrayList<>(tamanho);

        for (int i = 0; i < tamanho; i++) {
            lista.add(i);
        }

        return lista;
    }

    private static List<Integer> criarLinkedList(int tamanho) {
        LinkedList<Integer> lista = new LinkedList<>();

        for (int i = 0; i < tamanho; i++) {
            lista.add(i);
        }

        return lista;
    }

    private static void compararAcesso(
            List<Integer> arrayList,
            List<Integer> linkedList,
            int tamanho) {

        int indiceMeio = tamanho / 2;

        medir("get(meio) - ArrayList",
                () -> consumir(arrayList.get(indiceMeio)));

        medir("get(meio) - LinkedList",
                () -> consumir(linkedList.get(indiceMeio)));
    }

    private static void compararBusca(
            List<Integer> arrayList,
            List<Integer> linkedList) {

        medir("contains - ArrayList",
                () -> consumir(arrayList.contains(VALOR_AUSENTE)));

        medir("contains - LinkedList",
                () -> consumir(linkedList.contains(VALOR_AUSENTE)));
    }

    private static void compararInsercaoInicio(
            List<Integer> arrayList,
            List<Integer> linkedList) {

        medir("add(0) + remove(0) - ArrayList", () -> {
            arrayList.add(0, VALOR_AUSENTE);
            consumir(arrayList.remove(0));
        });

        medir("add(0) + remove(0) - LinkedList", () -> {
            linkedList.add(0, VALOR_AUSENTE);
            consumir(linkedList.remove(0));
        });
    }

    private static void compararRemocaoInicio(
            List<Integer> arrayList,
            List<Integer> linkedList) {

        medir("remove(0) + add(0) - ArrayList", () -> {
            Integer primeiro = arrayList.remove(0);
            arrayList.add(0, primeiro);
            consumir(primeiro);
        });

        medir("remove(0) + add(0) - LinkedList", () -> {
            Integer primeiro = linkedList.remove(0);
            linkedList.add(0, primeiro);
            consumir(primeiro);
        });
    }

    private static void compararInsercaoFim(
            List<Integer> arrayList,
            List<Integer> linkedList) {

        medir("add(fim) + remove(fim) - ArrayList", () -> {
            arrayList.add(VALOR_AUSENTE);
            consumir(arrayList.remove(arrayList.size() - 1));
        });

        medir("add(fim) + remove(fim) - LinkedList", () -> {
            linkedList.add(VALOR_AUSENTE);
            consumir(linkedList.remove(linkedList.size() - 1));
        });
    }

    private static void medir(String nome, Runnable operacao) {
        // Aquecimento simples, apenas para fins didáticos.
        for (int i = 0; i < 2; i++) {
            operacao.run();
        }

        long totalNanos = 0;

        for (int i = 0; i < REPETICOES; i++) {
            long inicio = System.nanoTime();

            operacao.run();

            long fim = System.nanoTime();
            totalNanos += fim - inicio;
        }

        double mediaMs =
                (totalNanos / (double) REPETICOES) / 1_000_000.0;

        System.out.printf(
                "  %-43s %.4f ms%n",
                nome,
                mediaMs
        );
    }

    private static void consumir(Object resultado) {
        resultadoObservado = resultado;
    }
}