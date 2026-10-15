package NivelAvancado.TestesBigO;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        long inicio;
        long fim;
        long tempo;

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 28090500 ; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        inicio = System.nanoTime();
        arrayList.remove(250);
        fim = System.nanoTime();
        tempo = fim - inicio;
        System.out.println("Tempo ArrayList: " + tempo + "ns");

        inicio = System.nanoTime();
        linkedList.remove(250);
        fim = System.nanoTime();
        tempo = fim - inicio;
        System.out.println("Tempo LinkedList: " + tempo + "ns");

    }
}
