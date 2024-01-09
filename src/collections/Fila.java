package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {
        
        Queue<String> fila = new LinkedList<>();

        //offer e add acicionam elementos na fila
        //Diferença - comportamento quando a fila ta cheia
        fila.add("Ana"); //lançará uma exceção caso a fila esteja cheia.
        fila.offer("Bia"); //retorna falso caso a fila esteja cheia.
        fila.offer("Lívia");
        fila.offer("Marcos");
        fila.offer("Daniel");
        fila.add("Rafaela");

        System.out.println(fila.toString());

        //Peek e Element - diferença ocorre quando a fila esta vazia
        //obter o prox elemento da fila (sem remover)
        System.out.println(fila.peek()); //fila vazia gera nulo
        System.out.println(fila.peek());
        System.out.println(fila.element());//gera uma exceção
        System.out.println(fila.element());

        //fila.size();
        //fila.isEmpty();
        //fila.clear();
        //fila.contains(...);
        

        //poll - obtem o prox elemento da fila removendo ele
        //a diferença de comportamento ocorre com a lista vazia
        System.out.println(fila.poll());//retorna false
        System.out.println(fila.remove()); // se eu chamo com a fila vazia excessao

        
    }
    
}
