package NivelIntermediario.Desafio04;

public class NinjaAvancado implements Ninja{
    String nome;
    int idade;
    String especialidade;
    TipoHabilidade tipoHabilidade;

    @Override
    public void mostrarInformacoes() {
        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + tipoHabilidade);
        System.out.println("Especialidade: " + especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Executando habilidade " + tipoHabilidade);
    }

    public NinjaAvancado(String nome, int idade, String especialidade, TipoHabilidade tipoHabilidade) {
        this.nome = nome;
        this.idade = idade;
        this.especialidade = especialidade;
        this.tipoHabilidade = tipoHabilidade;
    }
}
