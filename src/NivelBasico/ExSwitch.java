package NivelBasico;

import java.util.Scanner;

public class ExSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7");
        int dia = scanner.nextInt();

        boolean diaValido = true;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número Inválido");
                diaValido = false;
        }

        if(diaValido) {
            if (dia == 1 || dia == 7) {
                System.out.println("Não é dia útil.");
            } else {
                System.out.println("Dia útil.");
            }
        }

        scanner.close();
    }
}
