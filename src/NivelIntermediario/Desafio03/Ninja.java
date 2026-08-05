package NivelIntermediario.Desafio03;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;

    public void mostrarInformacoes() {
        System.out.println(
                "\nNome: " + nome + "\n" +
                "idade: " + idade + "\n" +
                "Missão: " + missao + "\n" +
                "Nível de dificuldade: " + nivelDificuldade + "\n" +
                "Status da Missão: " + statusMissao
        );
    }
}
