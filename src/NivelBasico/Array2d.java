package NivelBasico;

public class Array2d {
    public static void main(String[] args) {
        String[][] ninjasEAldeias = new String[3][3];

        ninjasEAldeias[0][0] = "Konaha";
        ninjasEAldeias[0][1] = "Naruto";
        ninjasEAldeias[0][2] = "Sasuke";

        ninjasEAldeias[1][0] = "Nevoa";
        ninjasEAldeias[1][1] = "Zabuza";
        ninjasEAldeias[1][2] = "Haku";

        ninjasEAldeias[2][0] = "Deserto";
        ninjasEAldeias[2][1] = "Gaara";
        ninjasEAldeias[2][2] = "Temari";

        System.out.println(ninjasEAldeias[0][1]);

        for (int i = 0; i < ninjasEAldeias.length ; i++) {
            System.out.println("Aldeia: " + ninjasEAldeias[i][0] + " - Ninja 1: " + ninjasEAldeias[i][1] + " - Ninja 2: " + ninjasEAldeias[i][2]);
        }
    }
}
