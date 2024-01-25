package orientacaoObjetos.composicaos.desafio2;

import java.util.ArrayList;
import java.util.List;

public class Leitor {

    final String nome;

    final List <PedidoLivro> pedidos = new ArrayList<>();

    Leitor(String nome){
        this.nome = nome;
    }

    void addPedido(PedidoLivro pedido){
        this.pedidos.add(pedido);
    }

    double getValorTotal(){
        double total = 0;

        for(PedidoLivro pedido: pedidos ){
            total += pedido.getValorTotal();
        }
        return total;

    }
}

