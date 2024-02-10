package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {
        
        Consumer<Produto> imprimirNome =
                p -> System.out.println(p.nome + "!!!");

        Produto p1 = new Produto("Notebook", 3500.59, 0.10);
        imprimirNome.accept(p1);

        Produto p2 = new Produto("Ipad", 4850.99, 0.10);
        Produto p3 = new Produto("Celular", 2999.99, 0.15);
        Produto p4 = new Produto("Caderno", 55.50, 0.09);
        Produto p5 = new Produto("Estojo", 34.50, 0.05);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        produtos.forEach(imprimirNome);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);
    }
    
}
