//Exercício — Histórico de páginas
//Crie um pequeno sistema que simule o histórico de páginas visitadas de um navegador.
package NivelIntermediario.Exercicios.Ex06;

public class Main {
    public static void main(String[] args) {

        HistoricoNavegador navegador = new HistoricoNavegador();

        Pagina google = new Pagina("Google", "www.google.com");
        Pagina youtube = new Pagina("YouTube", "www.youtube.com");
        Pagina github = new Pagina("GitHub", "www.github.com");

        navegador.visitarPagina(google);
        navegador.visitarPagina(youtube);
        navegador.visitarPagina(github);

        System.out.println("Página atual:");
        System.out.println(navegador.paginaAtual());

        System.out.println("\nQuantidade de páginas:");
        System.out.println(navegador.quantidadePaginas());

        System.out.println("\nHistórico: ");
        navegador.mostrarHistorico();

        navegador.voltar();
        System.out.println("\nDepois de voltar:");
        System.out.println(navegador.paginaAtual());
    }
}
