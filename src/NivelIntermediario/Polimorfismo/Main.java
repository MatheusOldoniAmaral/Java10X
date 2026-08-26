package NivelIntermediario.Polimorfismo;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 18, 25, NivelNinja.CHUUNIN);
        naruto.nome = "Naruto Uzumaki";
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18, 20, NivelNinja.CHUUNIN);
        sasuke.nome = "Sasuke Uchiha";
        sasuke.habilidadeEspecial();

        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da Folha", 45, 900, NivelNinja.HOKAGE);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalhaNinja();

    }
}
