package NivelBasico;

public class Desafio01 {
    public static void main(String[] args) {
        String statusMissaoConcluida = "Concluída";
        String statusMissaoNaoConcluida = "Não Concluída";

        //DADOS DO NINJA 01
        String ninja01 = "Samurai";
        int idadeNinja01 = 20;
        String missaoNinja01 = "Buscar a espada especial";
        char nivelDificuldade01 = 'A';

        String statusNinja01;
        if(idadeNinja01 >= 15) {
            statusNinja01 = statusMissaoConcluida;
        }else if(nivelDificuldade01 == 'C' || nivelDificuldade01 == 'D') {
            statusNinja01 = statusMissaoConcluida;
        }else {
            statusNinja01 = statusMissaoNaoConcluida;
        }

        System.out.println("----------NINJA 01----------");
        System.out.println(
                "Nome do Ninja: " + ninja01 + "\n" +
                "Idade do Ninja: " + idadeNinja01 + "\n" +
                "Missão: " + missaoNinja01 + "\n" +
                "Dificuldade: " + nivelDificuldade01 + "\n" +
                "Status da Missão: " + statusNinja01
        );

        //DADOS DO NINJA 02
        String ninja02 = "Shogun";
        int idadeNinja02 = 32;
        String missaoNinja02 = "Matar todo mundo";
        char nivelDificuldade02 = 'B';

        String statusNinja02;
        if(idadeNinja02 >= 15) {
            statusNinja02 = statusMissaoConcluida;
        }else if(nivelDificuldade02 == 'C' || nivelDificuldade02 == 'D') {
            statusNinja02 = statusMissaoConcluida;
        }else {
            statusNinja02 = statusMissaoNaoConcluida;
        }

        System.out.println("----------NINJA 02----------");
        System.out.println(
                "Nome do Ninja: " + ninja02 + "\n" +
                "Idade do Ninja: " + idadeNinja02 + "\n" +
                "Missão: " + missaoNinja02 + "\n" +
                "Dificuldade: " + nivelDificuldade02 + "\n" +
                "Status da Missão: " + statusNinja02
        );

        //DADOS DO NINJA 03
        String ninja03 = "Junior";
        int idadeNinja03 = 13;
        String missaoNinja03 = "Iniciar sem se machucar";
        char nivelDificuldade03 = 'B';

        String statusNinja03;
        if(idadeNinja03 >= 15) {
            statusNinja03 = statusMissaoConcluida;
        }else if(nivelDificuldade03 == 'C' || nivelDificuldade03 == 'D') {
            statusNinja03 = statusMissaoConcluida;
        }else {
            statusNinja03 = statusMissaoNaoConcluida;
        }

        System.out.println("----------NINJA 03----------");
        System.out.println(
                "Nome do Ninja: " + ninja03 + "\n" +
                "Idade do Ninja: " + idadeNinja03 + "\n" +
                "Missão: " + missaoNinja03 + "\n" +
                "Dificuldade: " + nivelDificuldade03 + "\n" +
                "Status da Missão: " + statusNinja03
        );
    }
}
