package NivelIntermediario.Polimorfismo.Construtores;

public class Hokages {

    String nome;
    int idade;
    boolean vivoOuNao;
    int missoes;
    double altura;
    String statusMissao;

    // All args constructor
    public Hokages(String nome, int idade, boolean vivoOuNao, int missoes, double altura, String statusMissao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
        this.missoes = missoes;
        this.altura = altura;
        this.statusMissao = statusMissao;
    }

    // No args constructor
    public Hokages() {
    }
}
