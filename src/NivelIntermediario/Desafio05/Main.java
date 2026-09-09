package NivelIntermediario.Desafio05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaCorrente contaCorrente = new ContaCorrente("Naruto", 1000.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Sasuke", 500.0);

        Banco banco = new Banco();
        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("========== SEU BANCO ==========");
            System.out.println("\n---------- MENU ----------");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Transferir");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Escolha a conta (0 - Corrente, 1 - Poupanca): ");
                    int indiceConsulta = scanner.nextInt();
                    if (indiceConsulta == 0) {
                        contaCorrente.consultarSaldo();
                    } else {
                        contaPoupanca.consultarSaldo();
                    }
                    break;

                case 2:
                    System.out.println("Escolha a conta (0 - Corrente, 1 - Poupanca): ");
                    int indiceDeposito = scanner.nextInt();
                    System.out.print("Valor a depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    if (indiceDeposito == 0) {
                        contaCorrente.depositar(valorDeposito);
                    } else {
                        contaPoupanca.depositar(valorDeposito);
                    }
                    System.out.println("Depósito realizado com sucesso!");
                    break;

                case 3:
                    System.out.print("Índice da conta de origem (0 - Corrente, 1 - Poupanca): ");
                    int indiceOrigem = scanner.nextInt();
                    System.out.print("Índice da conta de destino (0 - Corrente, 1 - Poupanca): ");
                    int indiceDestino = scanner.nextInt();
                    System.out.print("Valor a transferir: ");
                    double valorTransferencia = scanner.nextDouble();
                    banco.transferir(indiceOrigem, indiceDestino, valorTransferencia);
                    System.out.println("Transferência realizada com sucesso!");
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}