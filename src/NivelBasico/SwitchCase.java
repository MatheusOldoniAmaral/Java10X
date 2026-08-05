package NivelBasico;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Homem de Ferro");
        System.out.println("2 - Thor");
        System.out.println("3 - Hulk");

        int escolhaDoUsuario = scanner.nextInt();

        System.out.println("Você digitou o número: " + escolhaDoUsuario);

        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("O usuário escolheu o Homem de Ferro");
                break;
            case 2:
                System.out.println("O usuário escolheu o Thor");
                break;
            case 3:
                System.out.println("O usuário escolheu o Hulk");
                break;
            default:
                System.out.println("Opção invalida, tente novamente.");
        }

        scanner.close();
    }
}
