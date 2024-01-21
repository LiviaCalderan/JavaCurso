package composicaos.desafio2;

public class Sistema {
    
    public static void main(String[] args) {

        Leitor leitor1 = new Leitor("Marcos Henrique");

        PedidoLivro pedido1 = new PedidoLivro();
        pedido1.addItemDoPedido("O Pequeno Principe", 29.99, 1);
        pedido1.addItemDoPedido("Memórias Póstumas de Brás Cubas", 35.50, 2);
        pedido1.addItemDoPedido("Todo dia", 24.75, 1);

        PedidoLivro pedido2 = new PedidoLivro();
        pedido2.addItemDoPedido("Cidades nas nuvens", 75.00, 1);
        pedido2.addItemDoPedido("Pachinko", 85.99, 1);

        leitor1.addPedido(pedido2);
        leitor1.addPedido(pedido1);

        System.out.println(leitor1.getValorTotal());
        
    }
}
