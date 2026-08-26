package NivelIntermediario.Polimorfismo;

public class Uchiha extends Ninja {

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }


    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque uchiha, um ataque de fogo. Eu já completei " + numeroDeMissoesConcluidas + " missões" );
    }

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Essa é a minha estratégia de batalha!");
    }
}
