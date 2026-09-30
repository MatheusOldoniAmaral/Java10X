package NivelIntermediario.Exercicios.Ex05;

public class Pocao {
    private String nome;
    private int cura;
    private Raridade raridade;

    public Pocao(String nome, int cura, Raridade raridade) {
        this.nome = nome;
        this.cura = cura;
        this.raridade = raridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCura() {
        return cura;
    }

    public void setCura(int cura) {
        this.cura = cura;
    }

    public Raridade getRaridade() {
        return raridade;
    }

    public void setRaridade(Raridade raridade) {
        this.raridade = raridade;
    }

    @Override
    public String toString() {
        return "Pocao {" +
                "nome = '" + nome + '\'' +
                ", cura = " + cura +
                ", raridade = " + raridade +
                '}';
    }
}
