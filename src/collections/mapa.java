package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class mapa {

    public static void main(String[] args) {
        
        Map<Integer, String> usuarios = new HashMap<>();
        
        
        usuarios.put(1, "Lívia"); //tanto adiciona quanto substitui
        usuarios. put(20, "Marcos");
        usuarios. put(3, "João");
        usuarios. put(4, "Maria");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());
        System.out.println(usuarios.toString());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(20));
        System.out.println(usuarios.containsValue("Marcos"));

        System.out.println(usuarios.get(20));
        System.out.println(usuarios.remove(1));
        System.out.println(usuarios.remove(4, "Guilherme")); //true or false

        for(int chave: usuarios.keySet()) {
            System.out.println(chave);
        }

        for(String valor : usuarios.values()){
            System.out.println(valor);
        }

        for(Entry<Integer, String> registro: usuarios.entrySet()) {
            System.out.print(registro.getKey() + "==> ");
            System.out.println(registro.getValue());
        }
    }
    
}
