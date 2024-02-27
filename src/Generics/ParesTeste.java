package generics;

public class ParesTeste {
    public static void main(String[] args) {
        
        Pares<Integer, String> resultadoConcurso = new Pares<>();

        resultadoConcurso.adicionar(1, "Maria");
        resultadoConcurso.adicionar(2, "Lívia");
        resultadoConcurso.adicionar(3, "Marcos");
        resultadoConcurso.adicionar(2, "João");
        resultadoConcurso.adicionar(5, "Gui");

        System.out.println(resultadoConcurso.getValor(1));
        System.out.println(resultadoConcurso.getValor(2));
        System.out.println(resultadoConcurso.getValor(5));
    }
}
