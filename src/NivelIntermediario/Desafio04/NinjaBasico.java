package NivelIntermediario.Desafio04;

public class NinjaBasico implements Ninja {

    String nome;
    int idade;
    TipoHabilidade tipoHabilidade;

    @Override
    public void mostrarInformacoes() {
        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + tipoHabilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Executando habilidade " + tipoHabilidade);
    }

    public NinjaBasico(String nome, int idade, TipoHabilidade tipoHabilidade) {
        this.nome = nome;
        this.idade = idade;
        this.tipoHabilidade = tipoHabilidade;
    }
}
