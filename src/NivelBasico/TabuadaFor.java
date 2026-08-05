package NivelBasico;

import java.util.Scanner;

public class TabuadaFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int N = scanner.nextInt();

        System.out.println(">>>>>>>>>>Tábuada do " + N + "<<<<<<<<<<");
        for (int i = 1; i <= 10 ; i++) {
            int resultado = (N * i);
            System.out.println(N + " x " + i + " = " + resultado);
        }
        scanner.close();
    }
}
