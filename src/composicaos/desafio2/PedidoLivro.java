package composicaos.desafio2;

import java.util.ArrayList;
import java.util.List;

public class PedidoLivro {

    final List <ItemDoPedido> item = new ArrayList<>();

    void addItemDoPedido(String nome, double preco, int qtd){
        var livro = new Livro(nome, preco);
        this.item.add(new ItemDoPedido(livro, qtd));
    }
    
    double getValorTotal(){
        double total = 0;

        for(ItemDoPedido pedido : item){
            total += pedido.qtd * pedido.livro.preco;
        }

        return total;
    }
}
