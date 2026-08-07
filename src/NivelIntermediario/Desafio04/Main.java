package NivelIntermediario.Desafio04;

public class Main {
    public static void main(String[] args) {
        NinjaBasico naruto = new NinjaBasico(17, "Naruto", "Se Clonar");
        naruto.mostrarInformacoes();
        naruto.executarHabilidade();

        NinjaAvancado hashirama = new NinjaAvancado(40, "Hashirama", "Liberação da Madeira", "Liberar fator de cura");
        hashirama.mostrarInformacoes();
        hashirama.executarHabilidade();
    }
}
