package NivelIntermediario.Exercicios.Ex01;

public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido();
        pedido.setProduto("Monitor Gamer");
        pedido.setStatus(StatusPedido.ENTREGUE);

        System.out.println("Pedido: " + pedido.getProduto());
        System.out.println("Status: " + pedido.getStatus());
        System.out.println();

        for (StatusPedido status : StatusPedido.values()){
            System.out.println(status);
        }
    }
}
