package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    
    public static void main(String[] args) {
        
        Produtos p1 = new Produtos("Caixa de som", 59.90, 0.15, false);
        Produtos p2 = new Produtos("Notebook", 3450.60, 0.35, true);
        Produtos p3 = new Produtos("Smart TV", 2340.0, 0.30, true);
        Produtos p4 = new Produtos("Air frayer", 359.90, 0.45, true);
        Produtos p5 = new Produtos("Ar Condicionado", 3200.00, 0.15, true);

        List<Produtos> produto = Arrays.asList(p1, p2, p3, p4, p5);

        Predicate<Produtos> desconto30 = p -> p.desconto >= 0.30;
        Predicate<Produtos> freteGratis = p -> p.freteGratis;

        Function<Produtos, String> anuncio = 
            p -> "SUPER PROMOÇÃO!!! " + p.nome + " está com " + (p.desconto * 100) + "% de desconto e com frete grátis para todo Brasil!";

        produto.stream()
            .filter(desconto30)
            .filter(freteGratis)
            .map(anuncio)
            .forEach(System.out::println);

    }
}
