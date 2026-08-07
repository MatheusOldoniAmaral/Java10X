package NivelIntermediario.Polimorfismo.Construtores;

public class Main {
    public static void main(String[] args) {
        Hokages Hashirama = new Hokages();
        Hashirama.idade = 45;

        Hokages Tobirama = new Hokages();
        System.out.println(Tobirama.nome);

        Hokages Hiruzen = new Hokages();
        System.out.println(Hiruzen.idade);

        Hokages Minato = new Hokages();
        System.out.println(Minato.idade);
    }
}
