package NivelBasico;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Array
        int numeroMaximo = 3;
        String[] herois = new String[numeroMaximo];

        //Contadores
            int heroisCadastrados = 0;
        int escolhaMenu = 0;

        while (escolhaMenu != 4) {
            System.out.println("\n========== Menu Herói ==========");
            System.out.println("1. Cadastrar Novo Heroi");
            System.out.println("2. Listar Herois");
            System.out.println("3. Remover Herois");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            escolhaMenu = scanner.nextInt();
            scanner.nextLine();

            switch (escolhaMenu) {
                case 1:
                    if (heroisCadastrados < numeroMaximo) {
                        System.out.println("----------CADASTRO DE HERÓIS---------");
                        System.out.println("Digite o nome do heroi: ");
                        String nomeHeroi = scanner.nextLine();
                        herois[heroisCadastrados] = nomeHeroi;
                        heroisCadastrados++;
                        System.out.println("HERÓI CADASTRADO COM SUCESSO!");
                    } else {
                        System.out.println("NÚMERO MÁXIMO DE HERÓIS CADASTRADOS ATINGIDO!");
                    }
                    break;
                case 2:
                    if (heroisCadastrados == 0) {
                        System.out.println("----------LISTAR HERÓIS----------");
                        System.out.println("Nenhum herói foi cadastrado.");
                    } else {
                        System.out.println("----------LISTAR HERÓIS----------");
                        for (int i = 0; i < heroisCadastrados; i++) {
                            System.out.println(herois[i]);
                        }
                    }
                    break;
                case 3:
                    if (heroisCadastrados == 0) {
                        System.out.println("Nenhum herói cadastrado para remover.");
                    } else {
                        System.out.println("----------REMOVER HERÓI----------");
                        System.out.println("1. Remover por nome");
                        System.out.println("2. Remover por índice");
                        System.out.print("Escolha uma opção: ");
                        int opcaoRemocao = scanner.nextInt();
                        scanner.nextLine();

                        int indiceRemover = -1;

                        if (opcaoRemocao == 1) {
                            System.out.print("Digite o nome do heroi a remover: ");
                            String nomeRemover = scanner.nextLine();

                            for (int i = 0; i < heroisCadastrados; i++) {
                                if (herois[i].equals(nomeRemover)) {
                                    indiceRemover = i;
                                    break;
                                }
                            }

                            if (indiceRemover == -1) {
                                System.out.println("Herói não encontrado!");
                            }

                        } else if (opcaoRemocao == 2) {
                            for (int i = 0; i < heroisCadastrados; i++) {
                                System.out.println(i + " - " + herois[i]);
                            }
                            System.out.print("Digite o índice do heroi a remover: ");
                            int indiceDigitado = scanner.nextInt();
                            scanner.nextLine();

                            if (indiceDigitado < 0 || indiceDigitado >= heroisCadastrados) {
                                System.out.println("Índice inválido!");
                            } else {
                                indiceRemover = indiceDigitado;
                            }

                        } else {
                            System.out.println("Opção inválida!");
                        }

                        // Essa parte só roda se um índice válido foi encontrado, seja por nome ou por índice
                        if (indiceRemover != -1) {
                            for (int j = indiceRemover; j < heroisCadastrados - 1; j++) {
                                herois[j] = herois[j + 1];
                            }
                            herois[heroisCadastrados - 1] = null;
                            heroisCadastrados--;
                            System.out.println("Herói removido com sucesso!");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
                    break;
            }
        }
        scanner.close();
    }
}