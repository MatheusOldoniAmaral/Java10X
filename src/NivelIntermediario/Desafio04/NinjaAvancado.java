package NivelIntermediario.Desafio04;

public class NinjaAvancado implements Ninja{
    String nome;
    int idade;
    String habilidade;
    String especialidade;

    @Override
    public void mostrarInformacoes() {
        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Especialidade: " + especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Executando habilidade e se curando...");
    }

    public NinjaAvancado(int idade, String nome, String habilidade, String especialidade) {
        this.idade = idade;
        this.nome = nome;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }
}
