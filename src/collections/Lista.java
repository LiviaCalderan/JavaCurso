package collections;

import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {
        
        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");
        
        lista.add(u1);
        lista.add(new Usuario("Lívia"));
        lista.add(new Usuario("Ana"));
        lista.add(new Usuario("Maria"));
        lista.add(new Usuario("João"));

        System.out.println(lista.get(3)); //Acessar pelo index

        lista.remove(1);
        System.out.println(">>>>>" + lista.remove(2));
        lista.remove(new Usuario("João"));

        System.out.println(lista.contains(new Usuario("Ana")));

        for(Usuario u: lista) {
            System.out.println(u);
        }
    }
    
}
