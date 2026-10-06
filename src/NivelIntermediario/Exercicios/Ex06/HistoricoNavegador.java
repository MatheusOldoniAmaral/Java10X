package NivelIntermediario.Exercicios.Ex06;

import java.util.Stack;

public class HistoricoNavegador {
    private Stack<Pagina> historico = new Stack<>();

    public void visitarPagina(Pagina pagina) {
        historico.push(pagina);
    }

    public Pagina paginaAtual() {
        return historico.peek();
    }

    public void voltar() {
        if (historico.size() > 1) {
            historico.pop();
        } else {
            System.out.println("Não há página anterior para voltar.");
        }
    }

    public int quantidadePaginas() {
        return historico.size();
    }

    public void mostrarHistorico() {
        for (Pagina pagina : historico) {
            System.out.println(pagina);
        }
    }
}
