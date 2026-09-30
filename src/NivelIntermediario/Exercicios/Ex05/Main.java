package NivelIntermediario.Exercicios.Ex05;

public class Main {
    public static void main(String[] args) {
        Arma espada = new Arma("Espada", 80, Raridade.RARO);
        Arma arco = new Arma("Arco", 70, Raridade.COMUM);
        Arma machado = new Arma("Machado", 110, Raridade.EPICO);

        Pocao pocaoDeVida = new Pocao("Poção de vida", 100, Raridade.COMUM);
        Pocao pocaoDeForca = new Pocao("Poção de força", 80, Raridade.RARO);

        Inventario<Arma> inventarioArmas = new Inventario<>();
        inventarioArmas.adicionarItem(espada);
        inventarioArmas.adicionarItem(arco);
        inventarioArmas.adicionarItem(machado);

        Inventario<Pocao> inventarioPocao = new Inventario<>();
        inventarioPocao.adicionarItem(pocaoDeVida);
        inventarioPocao.adicionarItem(pocaoDeForca);

        inventarioArmas.listarItens();
        System.out.println();
        inventarioPocao.listarItens();
        System.out.println();

        inventarioArmas.removerItem(machado);
        inventarioPocao.removerItem(pocaoDeForca);

        inventarioArmas.listarItens();
        System.out.println();
        inventarioPocao.listarItens();
        System.out.println();

        System.out.println(inventarioArmas.possuiItem(machado));
        System.out.println(inventarioPocao.possuiItem(pocaoDeForca));

//        inventarioArmas.adicionarItem(pocaoDeVida);
//        inventarioPocao.listarItens();
    }
}
