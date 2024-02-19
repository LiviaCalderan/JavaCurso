package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Marcos", 8.1);
        Aluno a3 = new Aluno("Lívia", 6.1);
        Aluno a4 = new Aluno("Gui", 10.0);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Predicate<Aluno> reprovado = aprovado.negate();

        System.err.println(alunos.stream().allMatch(aprovado)); //true or false 
        System.out.println(alunos.stream().anyMatch(aprovado)); //algum foi aprovado?
        System.out.println(alunos.stream().noneMatch(reprovado)); 
    }
}
