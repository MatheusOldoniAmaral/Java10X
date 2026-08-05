package NivelBasico;

public class Matriz {
    public static void main(String[] args) {
        int[][] matriz = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(

            );
        }
    }
}
