package NivelIntermediario.Polimorfismo.Overload;

import NivelIntermediario.Polimorfismo.NivelNinja;

public class Ninja {

    //TODO: Incluir 2 novos atributos: numeroDeMissoesConcluidas, Rank
    //TODO: Rank: Genin, Chuunin, Jounnin, Hokage

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }
}
