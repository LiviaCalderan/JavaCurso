package collections;

import java.util.HashSet;
import java.util.Set;

public class bagunca {

    @SuppressWarnings({ "rawtypes", "unchecked"})//silenciar advertencias
    public static void main(String[] args) {
        
        HashSet conjunto = new HashSet();

        conjunto.add(1.2); // double -> Double
        conjunto.add(true); // boolean -> Boo
        conjunto.add("Teste");// String
        conjunto.add(7);// int -> Integer
        conjunto.add("x"); // 

        System.out.println(conjunto);
        System.out.println("O tamanho é: " + conjunto.size());

        conjunto.add("X");
        conjunto.add("Teste");
        System.out.println("O tamanho é: " + conjunto.size());

        System.out.println(conjunto.remove("teste")); //false pois letra minuscula
        System.out.println(conjunto.remove("Teste"));

        Set nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);

        //conjunto.addAll(nums); //união entre dois conjuntos
        conjunto.retainAll(nums);
        System.out.println(conjunto);
    }
    
}
