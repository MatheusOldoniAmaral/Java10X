package NivelBasico;

import java.util.Scanner;

public class AdivinheONumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = 23;
        int numeroPalpite = 0;

        while (numeroPalpite != numeroSecreto){
            System.out.println("Digite o número secreto: ");
            numeroPalpite = scanner.nextInt();

            if(numeroPalpite > numeroSecreto) {
                System.out.println("Muito alto");
            } else if (numeroPalpite < numeroSecreto) {
                System.out.println("Muito baixo");
            }
        }
        System.out.println("Você acertou! O número secreto é " + numeroSecreto);

        scanner.close();
    }
}
