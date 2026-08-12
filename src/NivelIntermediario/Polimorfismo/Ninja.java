package NivelIntermediario.Polimorfismo;

public abstract class Ninja implements EstrategiaDeBatalha {
    String nome;
    String aldeia;
    int idade;

    //Metodo Geral. Todos os ninjas terao
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial!");
    }

    // Por estar sobreescrevendo o metodo da interface, tenho que usar o Override
    @Override
    public void estrategiaDeBatallhaNinja() {
        System.out.println("Essa é a minha estratégia de batalha!");
    }
}
