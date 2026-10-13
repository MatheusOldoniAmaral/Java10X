package NivelIntermediario.Desafio06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ListaDeNinjas listaDeNinjas = new ListaDeNinjas();

        listaDeNinjas.adicionarNovoNinja(new Ninja("Naruto", 16, "Aldeia da folha"));
        listaDeNinjas.adicionarNovoNinja(new Ninja("Sasuke", 16, "Aldeia da folha"));
        listaDeNinjas.adicionarNovoNinja(new Ninja("Sakura", 16, "Aldeia da folha"));
        listaDeNinjas.adicionarNovoNinja(new Ninja("Gaara", 18, "Aldeia da areia"));
        listaDeNinjas.adicionarNovoNinja(new Ninja("Kankuro", 23, "Aldeia da areia"));
        listaDeNinjas.adicionarNovoNinja(new Ninja("Orochimaro", 50, "Aldeia do som"));
        listaDeNinjas.adicionarNovoNinja(new Ninja("Kabuto", 25, "Aldeia do som"));

        int escolhaMenu = 0;

        while (escolhaMenu != 5) {
            System.out.println("\n1. Remover o primeiro ninja");
            System.out.println("2. Adicionar um novo ninja");
            System.out.println("3. Exibir lista completa de ninjas");
            System.out.println("4. Ordenar e exibir lista de ninjas");
            System.out.println("5. Buscar ninja por nome");
            System.out.println("6. Sair");
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
                    if (listaDeNinjas.verificarSeEstaVazia()) {
                        System.out.println("Nenhum ninja na lista para ser ordenado.");
                        break;
                    }

                    System.out.println("========== Ordenar lista de ninjas ==========");
                    System.out.println("1. Por idade");
                    System.out.println("2. Por nome");
                    System.out.println("3. Por aldeia");
                    System.out.println("4. Voltar");
                    int escolhaOrdenacao = scanner.nextInt();
                    scanner.nextLine();

                    switch (escolhaOrdenacao) {
                        case 1:
                            listaDeNinjas.ordenarPorIdade();
                            System.out.println("========== Ordenada por idade ==========");
                            listaDeNinjas.exibirListaNinja();
                            break;
                        case 2:
                            listaDeNinjas.ordenarPorNome();
                            System.out.println("========== Ordenada por nome ==========");
                            listaDeNinjas.exibirListaNinja();
                            break;
                        case 3:
                            listaDeNinjas.ordenarPorAldeia();
                            System.out.println("========== Ordenada por aldeia ==========");
                            listaDeNinjas.exibirListaNinja();
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Opção Inválida!");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Digite o nome do ninja que deseja buscar: ");
                    String nomeBusca = scanner.nextLine();
                    Ninja encontrado = listaDeNinjas.buscarPorNome(nomeBusca);
                    if (encontrado == null) {
                        System.out.println("Ninja não encontrado.");
                    } else {
                        System.out.println(encontrado);
                    }
                    break;
                case 6:
                    System.out.println("Encerrando programa...");
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }
    }
}