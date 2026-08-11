package NivelIntermediario.Desafio04;

public class Main {
    public static void main(String[] args) {
        NinjaBasico naruto = new NinjaBasico("Naruto", 17,  TipoHabilidade.TAIJUTSU);
        naruto.mostrarInformacoes();
        naruto.executarHabilidade();

        NinjaAvancado hashirama = new NinjaAvancado("Hashirama", 40, "Cura", TipoHabilidade.NINJUTSU);
        hashirama.mostrarInformacoes();
        hashirama.executarHabilidade();
    }
}
