package NivelIntermediario.Desafio04;

public class NinjaBasico implements Ninja {

    String nome;
    int idade;
    String habilidade;

    @Override
    public void mostrarInformacoes() {
        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Executando habilidade e se clonando...");
    }

    public NinjaBasico(int idade, String nome, String habilidade) {
        this.idade = idade;
        this.nome = nome;
        this.habilidade = habilidade;
    }
}
