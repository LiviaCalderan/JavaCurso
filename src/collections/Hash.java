package collections;

import java.util.HashSet;

public class Hash {

    public static void main(String[] args) {
        
        HashSet<Usuario> usuarios = new HashSet<Usuario>();

        usuarios.add(new Usuario("Lívia"));
        usuarios.add(new Usuario("Ana"));
        usuarios.add(new Usuario("Marcos"));

        System.out.println(usuarios.contains(new Usuario("Marcos")));
    }
    
}
