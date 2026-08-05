package NivelBasico;

import java.util.Scanner;

public class Ternarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        String resultado = (idade <= 12) ? "Criança" : (idade < 18) ? "Adolescente" : "Adulto";
        System.out.println(resultado);
    }
}
