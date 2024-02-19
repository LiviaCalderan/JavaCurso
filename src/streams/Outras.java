package streams;

import java.util.Arrays;
import java.util.List;

public class Outras {
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Marcos", 8.1);
        Aluno a3 = new Aluno("Lívia", 6.1);
        Aluno a4 = new Aluno("Gui", 10.0);
        Aluno a5 = new Aluno("Maria", 7.1);
        Aluno a6 = new Aluno("Marcos", 8.1);
        Aluno a7 = new Aluno("Zoe", 6.1);
        Aluno a8 = new Aluno("Ana", 10.0);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

        System.out.println("distinct: ");

        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\n Skip/Limit");
        alunos.stream()
            .distinct()
            .skip(2)
            .limit(2)
            .forEach(System.out::println);
        
        System.out.println("\n Take a While");
        alunos.stream()
            .distinct()
            .skip(1)
            .takeWhile(a -> a.nota >= 7)
            .forEach(System.out::println);
    
    

    }
}
