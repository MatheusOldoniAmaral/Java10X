package NivelIntermediario.Desafio06;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Ninja naruto = new Ninja("Naruto", 16, "Aldeia da folha");
        Ninja sasuke = new Ninja("Sasuke", 16, "Aldeia da folha");
        Ninja sakura = new Ninja("Sakura", 16, "Aldeia da folha");
        Ninja gaara = new Ninja("Gaara", 18, "Aldeia da areia");
        Ninja kankuro = new Ninja("Kankuro", 23, "Aldeia da areia");
        Ninja orochimaro = new Ninja("Orochimaro", 50, "Aldeia do som");
        Ninja kabuto = new Ninja("Kabuto", 25, "Aldeia do som");

        ListaDeNinjas listaDeNinjas = new ListaDeNinjas();

        listaDeNinjas.adicionarNovoNinja(naruto);
        listaDeNinjas.adicionarNovoNinja(sasuke);
        listaDeNinjas.adicionarNovoNinja(sakura);
        listaDeNinjas.adicionarNovoNinja(gaara);
        listaDeNinjas.adicionarNovoNinja(kankuro);
        listaDeNinjas.adicionarNovoNinja(orochimaro);
        listaDeNinjas.adicionarNovoNinja(kabuto);

        int escolhaMenu = 0;

        while (escolhaMenu != 4) {
            System.out.println("\n1. Remover o primeiro ninja");
            System.out.println("2. Adicionar um novo ninja");
            System.out.println("3. Exibir lista completa de ninjas");
            System.out.println("4. Sair");
            escolhaMenu = scanner.nextInt();
            scanner.nextLine();

            switch (escolhaMenu) {
                case 1:
                    Ninja removido = listaDeNinjas.removerPrimeiroNinja();
                    if (removido == null) {
                        System.out.println("A lista está vazia, nada para remover.");
                    } else {
                        System.out.println(removido.getNome() + " foi removido com sucesso!");
                    }
                    break;
                case 2:
                    System.out.println("========== Cadastro do novo ninja ==========");
                    System.out.println("Digite o nome do ninja: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a idade do ninja: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite a aldeia na qual o ninja pertence: ");
                    String aldeia = scanner.nextLine();
                    listaDeNinjas.adicionarNovoNinja(nome, idade, aldeia);
                    break;
                case 3:
                    System.out.println("========== Lista de Ninjas ==========");
                    if (listaDeNinjas.verificarSeEstaVazia()) {
                        System.out.println("Nenhum ninja na lista para ser exibido.");
                    } else {
                        listaDeNinjas.exibirListaNinja();
                    }
                    break;
                case 4:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }

        }
    }
}
