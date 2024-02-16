package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Marcos", 7.8);
        Aluno a2 = new Aluno("Lívia", 9.5);
        Aluno a3 = new Aluno("Ana", 5.6);
        Aluno a4 = new Aluno("Maria", 6.8);
        Aluno a5 = new Aluno("Gui", 4.9);
        Aluno a6 = new Aluno("João", 5.5);   

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, String> saudacoesAprovado =
            a -> "Parabens " + a.nome + "! Você foi aprovado(a)!";

        alunos.stream()
            .filter(aprovado)
            .map(saudacoesAprovado)
            .forEach(System.out::println);
    }
}
