package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {
        
        Consumer<Integer> print = System.out :: println;
        Consumer<String> println = System.out :: println;

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        nums.stream().forEach(print);

        Function<Integer, String> paraBinario = Integer::toBinaryString;
        UnaryOperator<String> inverter = n -> new StringBuilder(n).reverse().toString();
        Function<String, Integer> paraInteiro = n -> Integer.parseInt(n, 2);

        nums.stream()
        .map(paraBinario)
        .forEach(println);

        nums.stream()
            .map(paraBinario)
            .map(inverter)
            .forEach(println);       
        
        nums.stream()
            .map(paraBinario)
            .map(inverter)
            .map(paraInteiro)
            .forEach(print);

    }
}
