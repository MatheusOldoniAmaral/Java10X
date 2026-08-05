package NivelIntermediario.Desafio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroMaximo = 3;
        int escolhaMenu = 0;
        int ninjasCadastrados = 1;

        Ninja[] ninjas = new Ninja[numeroMaximo];

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 18;
        sasuke.missao = "Aprender novas habilidades";
        sasuke.statusMissao = "Em andamento...";
        sasuke.nivelDificuldade = "Intermediário";
        sasuke.habilidadeEspecial = "Sharingan";
        ninjas[0] = sasuke;

        while (escolhaMenu != 4) {
            System.out.println("\n----------MENU----------");
            System.out.println("1. Exibir informações de todos os Ninjas.");
            System.out.println("2. Adicionar novos ninjas.");
            System.out.println("3. Atualizar habilidade especial.");
            System.out.println("4. Sair\n");
            System.out.println("ESCOLHA UMA OPÇÃO: ");
            escolhaMenu = sc.nextInt();
            sc.nextLine();

            switch (escolhaMenu) {
                case 1:
                    System.out.println("----------Informações dos Ninjas----------");
                    for (int i = 0; i < ninjasCadastrados; i++) {
                       ninjas[i].mostrarInformacoes();
                    }
                    break;
                case 2:
                    if (ninjasCadastrados < ninjas.length) {
                        System.out.println("----------Adicionar novo Ninja----------");
                        Ninja novoNinja = new Ninja();
                        System.out.println("Digite o nome do ninja: ");
                        novoNinja.nome = sc.nextLine();
                        System.out.println("Digite a idade do ninja: ");
                        novoNinja.idade = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Digite a Missão do ninja: ");
                        novoNinja.missao = sc.nextLine();
                        System.out.println("Digite o nível de dificuldade da missão: ");
                        novoNinja.nivelDificuldade = sc.nextLine();
                        System.out.println("Digite o status da missão: ");
                        novoNinja.statusMissao = sc.nextLine();

                        System.out.println("O ninja cadastrado é um Uchiha? (s/n)");
                        String resposta = sc.nextLine();

                        if (resposta.equalsIgnoreCase("s")) {
                            Uchiha novoUchiha = new Uchiha();
                            novoUchiha.nome = novoNinja.nome;
                            novoUchiha.idade = novoNinja.idade;
                            novoUchiha.missao = novoNinja.missao;
                            novoUchiha.nivelDificuldade = novoNinja.nivelDificuldade;
                            novoUchiha.statusMissao = novoNinja.statusMissao;

                            System.out.println("Digite a habilidade especial desse Uchiha: ");
                            novoUchiha.habilidadeEspecial = sc.nextLine();
                            novoNinja = novoUchiha;
                        }
                        System.out.println("Ninja cadastrado com sucesso!");

                        ninjas[ninjasCadastrados] = novoNinja;
                        ninjasCadastrados++;
                    } else {
                        System.out.println("Quantidade máxima de ninjas cadastrado atingido!");
                    }
                    break;
                case 3:
                    System.out.println("----------Atualizar habilidade especial----------");
                    System.out.println("Digite o nome do ninja que deseja atualizar: ");
                    String nomeBusca = sc.nextLine();

                    boolean encontrado = false;

                    for (int i = 0; i < ninjasCadastrados; i++) {
                        if (ninjas[i].nome.equalsIgnoreCase(nomeBusca)) {
                            encontrado = true;

                            if (ninjas[i] instanceof Uchiha) {
                                Uchiha uchihaEncontrado = (Uchiha) ninjas[i];
                                System.out.println("Habilidade especial atual: " + uchihaEncontrado.habilidadeEspecial);
                                System.out.println("Digite a nova habilidade especial: ");
                                uchihaEncontrado.habilidadeEspecial = sc.nextLine();
                                System.out.println("Habilidade atualizada com sucesso!");
                            } else {
                                System.out.println("Esse ninja não é um Uchiha e não possui habilidade especial.");
                            }
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Ninja não encontrado!");
                    }
                    break;
                case 4:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção Invalida!");
                    break;
            }
        }
    }
}