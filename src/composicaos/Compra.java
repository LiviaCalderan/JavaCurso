package composicaos;

import java.util.ArrayList;

public class Compra {

    //Relacionamento um para muitos;
    String cliente;
    ArrayList <Item> itens = new ArrayList<Item>();

    double obterValorTotal(){
        double total = 0;

        for(Item item: itens){
            total += item.quantidade * item.preco;
        }

        return total;
    }
    
}
