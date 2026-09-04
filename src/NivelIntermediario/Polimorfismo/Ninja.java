package NivelIntermediario.Polimorfismo;

public abstract class Ninja implements EstrategiaDeBatalha {
    //TODO: Incluir 2 novos atributos: numeroDeMissoesConcluidas, Rank
    //TODO: Rank: Genin, Chuunin, Jounnin, Hokage

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //TODO: Sobrecarga do construtor chamando os novos atributos

    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }
    
    //TODO: Sobrecarga de método - Inteligencia de combate
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é : " + nome + " e essa é minha inteligencia de combate");
    }

    public void inteligenciaDeCombate(int qi) {

        if (qi > 150) {
            System.out.println("Meu nome é : " + nome + " e essa é minha inteligencia de combate");
        }
    }

    public void habilidadeEspecial() {
        System.out.println();
    }

}