package NivelIntermediario.Exercicios.Ex01;

public class Pedido {

    private String produto;
    private StatusPedido status;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }
}
