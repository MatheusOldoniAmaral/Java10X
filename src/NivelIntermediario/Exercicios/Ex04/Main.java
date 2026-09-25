package NivelIntermediario.Exercicios.Ex04;

public class Main {
    public static void main(String[] args) {
        ListaGenerica<String> nomes = new ListaGenerica<>();
        nomes.adicionar("Matheus");
        nomes.adicionar("Agda");
        nomes.adicionar("Felipe");
        System.out.println(nomes);

        nomes.remover("Matheus");
        System.out.println(nomes);

        System.out.println(nomes.verificar("Agda"));
        System.out.println();

        nomes.mostrarTodos();
        System.out.println("===================================================");

        ListaGenerica<Integer> numeros = new ListaGenerica<>();

        numeros.adicionar(1);
        numeros.adicionar(100);
        numeros.adicionar(55);
        numeros.adicionar(23);
        System.out.println(numeros);

        numeros.remover(100);
        System.out.println(numeros);

        System.out.println(numeros.verificar(100));

        numeros.mostrarTodos();
    }
}
