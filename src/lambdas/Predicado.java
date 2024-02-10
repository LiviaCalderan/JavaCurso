package lambdas;

import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {
     
        Predicate<Produto> isExpensive = 
                prod -> (prod.preco * (1 - prod.desconto)>= 20);

        Produto produto = new Produto("caneta", 25, 0.15);

        System.out.println(isExpensive.test(produto));
    }
}
    

