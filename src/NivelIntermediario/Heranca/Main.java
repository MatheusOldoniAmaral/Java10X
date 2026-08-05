package NivelIntermediario.Heranca;

public class Main {
    public static void main(String[] args) {
        // Objeto 1
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 17;
        Naruto.ModoSabioAtivado();

        // Objeto 2
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 18;
        Sasuke.SharinganAtivado();

        // Objeto 3
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.idade = 18;
        Sakura.ativarCura();

        // Objeto 4
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.aldeia = "Aldeira da Folha";
        Hinata.idade = 16;
        Hinata.ativarByakugan();

        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Hyuga Uzumaki";
        Boruto.aldeia = "Aldeira da folha";
        Boruto.idade = 9;
        Boruto.ModoSabioAtivado();
        Boruto.AtivarOKarma();
        Boruto.AtivarJougan();
    }
}
