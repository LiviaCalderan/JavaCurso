package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args) {
        
        //Set<String> listaAprovados = new HashSet<>();
        SortedSet<String> listaAprovados = new TreeSet<>(); //Tree coloca na ordem de inserção
        listaAprovados.add("Lívia");
        listaAprovados.add("Marcos");
        listaAprovados.add("João");
        listaAprovados.add("Maria");

        for(String candidato: listaAprovados){
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(220);
        nums.add(10);

        for(int n: nums){
            System.out.println(n);
        }

    }
    
}
