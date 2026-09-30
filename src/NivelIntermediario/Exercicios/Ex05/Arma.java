package NivelIntermediario.Exercicios.Ex05;

public class Arma {
    private String nome;
    private int dano;
    private Raridade raridade;

    public Arma(String nome, int dano, Raridade raridade) {
        this.nome = nome;
        this.dano = dano;
        this.raridade = raridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public Raridade getRaridade() {
        return raridade;
    }

    public void setRaridade(Raridade raridade) {
        this.raridade = raridade;
    }

    @Override
    public String toString() {
        return "Arma {" +
                "nome = '" + nome + '\'' +
                ", dano = " + dano +
                ", raridade = " + raridade +
                '}';
    }
}
