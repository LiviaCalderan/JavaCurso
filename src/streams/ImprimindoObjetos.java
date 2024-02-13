package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {
        
        List<String> aprovados = Arrays.asList("Livia", "Marcos", "Ana", "Maria", "Gui");

        /*for (int i =0; i < aprovados.size(); i++) {
            System.out.println(aprovados.get(i));
        } FORMA MENOS OTIMIZADA
        */
        System.out.println("Usando o foreach: \n");
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nUsando o Iterator: \n");
        Iterator<String> it = aprovados.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("\nUsando Stream: \n");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println); // >>>Laço interno<<<


    }
}
