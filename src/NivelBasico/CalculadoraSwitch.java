package NivelBasico;

import java.util.Scanner;

public class CalculadoraSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        double N1 = scanner.nextDouble();

        System.out.println("Digite o segundo número");
        double N2 = scanner.nextDouble();
        scanner.nextLine();
        double total;

        System.out.println("Digite a operação matematica desejada: ");
        System.out.println("(+) Adição");
        System.out.println("(-) Subtração");
        System.out.println("(*) Multiplicação");
        System.out.println("(/) Divisão");

        String escolha = scanner.nextLine();

        switch (escolha){
            case "+":
                total = (N1 + N2);
                System.out.println("O resultado da adição " + N1 + " + " + N2 + " é: " + total);
                break;
            case "-":
                total = (N1 - N2);
                System.out.println("O resultado da subtração " + N1 + " - " + N2 + " é: " + total);
                break;
            case "*":
                total = (N1 * N2);
                System.out.println("O resultado da multiplicação " + N1 + " * " + N2 + " é: " + total);
                break;
            case "/":
                total = (N1 / N2);
                System.out.println("O resultado da divisão " + N1 + " / " + N2 + " é: " + total);
                break;
            default:
                System.out.println("Opção inválida!");
        }
        scanner.close();
    }
}
