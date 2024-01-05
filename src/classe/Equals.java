package classe;

import java.util.Date;

public class Equals {
    public static void main(String[] args) {
        
        Usuario u1 = new Usuario();
        u1.nome = "Lívia Calderan";
        u1.email = "livia.calderan@gmail.com";

        Usuario u2 = new Usuario();
        u2.nome = "Lívia Calderan";
        u2.email = "livia.calderan@gmail.com";

        System.out.println(u1 == u2); 
        System.out.println(u1.equals(u2)); 

        System.out.println(u2.equals(new Date()));
    }
}
