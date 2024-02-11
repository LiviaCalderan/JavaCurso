package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
    public static void main(String[] args) {
        
        //Supplier<Object> umLista = - menos especifico
        Supplier<List<String>> umLista = 
            () -> Arrays.asList("Marcos", "Lívia", "Ana", "Gui");

        System.out.println(umLista.get());    
    }
}
