package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        
        Consumer<String> print = System.out :: print;
        Consumer<Integer> println = System.out :: println;

        Stream<String> language = Stream.of("Java ", "JavaScript ", "Lua\n");
        language.forEach(print);

        String[] moreLanguage = {"Python ", "Lisp ", "C++ ", "Go\n"};

        Stream.of(moreLanguage).forEach(print);
        Arrays.stream(moreLanguage).forEach(print);
        Arrays.stream(moreLanguage, 1,4).forEach(print); //pegar um sub-conjunto

        List<String> otherLanguage = Arrays.asList("C ", "PHP ", "Kotlin ", "Ruby\n" );
        otherLanguage.stream().forEach(print);
        otherLanguage.parallelStream().forEach(print);

        //Stream.generate(() -> "a").forEach(print); GERA INFINITO SEM ORDENAÇÃO
        //Stream.iterate(0, n -> n + 1).forEach(println); GERA INFINITO COM ORDENAÇÃO
    }
}
