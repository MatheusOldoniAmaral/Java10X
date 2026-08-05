package NivelBasico;

import java.util.Scanner;

public class LacosRepeticao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroDeClones = 0;
        int numeroMaxDeClones = 40;

//        while (numeroDeClones <= numeroMaxDeClones) {
//            numeroDeClones++;
//            System.out.println("O naruto fez um clone das sombras " + numeroDeClones);
//        }

        for (int i = 0; i <= 40; i++) {
            System.out.println("O naruto fez um clone das sombras " + i);
        }
    }
}
