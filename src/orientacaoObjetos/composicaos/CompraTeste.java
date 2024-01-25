package orientacaoObjetos.composicaos;

public class CompraTeste {
    
    public static void main(String[] args) {
        
        Compra compra1 = new Compra();
        compra1.cliente = "Marcos Henrique";

        compra1.itens.add(new Item("Limão", 5, 5.50));
        compra1.itens.add(new Item("Pera", 4, 6.25));
        compra1.itens.add(new Item("Kiwi", 4, 6.75));
        compra1.itens.add(new Item("Lichia", 10, 8.00));

        System.out.println(compra1.cliente + " comprou " + compra1.itens.size() + " produtos!");
        System.out.println(compra1.obterValorTotal());
        
    }
}
