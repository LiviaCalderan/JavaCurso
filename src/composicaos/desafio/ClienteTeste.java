package composicaos.desafio;

public class ClienteTeste {

    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("Lívia");

        Compra compra1 = new Compra();
        compra1.addItem("Lapis", 7.75, 8);
        compra1.addItem(new Produto("pc gamer", 5450.90), 1);

        Compra compra2 = new Compra();
        compra2.addItem("Caneta", 2.99, 5);
        compra2.addItem(new Produto("Ventilador", 125.90), 1);

        cliente.addCompra(compra1); // melhor forma
        cliente.compras.add(compra2); // nao indicado

        System.out.println(cliente.obterValorTotal());

    }
    
}
