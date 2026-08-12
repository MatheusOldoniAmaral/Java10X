package NivelIntermediario.Polimorfismo;

public class Uchiha extends Ninja {

    @Override
    public void estrategiaDeBatallhaNinja() {
        System.out.println("Essa é a minha estratégia de batalha!");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uchiha, um ataque de fogo!");
    }
}
