package NivelIntermediario.EstruturaDeDados.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> ninjasList = new ArrayList<>();

        // Adicionar elementos na lista
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Haruno");
        ninjasList.add("Kakashi Hatake");
        System.out.println("Ninjas: " + ninjasList);

        // Remover elementos da lista
        ninjasList.remove("Kakashi Hatake");
        System.out.println("Ninjas: " + ninjasList);

        // Trocar elementos
        ninjasList.set(2, "Hashirama Senju");
        System.out.println("Ninjas: " + ninjasList);

        // Ver o tamanho da lista
        System.out.println("Tamanho da lista: " + ninjasList.size() + " elementos.");

        // Verificar se um elemento existe. Retorna true ou false
        System.out.println(ninjasList.contains("Gaara"));
    }
}
