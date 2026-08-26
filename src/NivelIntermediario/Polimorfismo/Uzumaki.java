package NivelIntermediario.Polimorfismo;

public class Uzumaki extends Ninja {

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    public Uzumaki() {
    }

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Essa é a minha estratégia de batalha!");
    }

    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uzumaki, um ataque de ar. Eu já completei " + numeroDeMissoesConcluidas + " missões.");
    }
}
