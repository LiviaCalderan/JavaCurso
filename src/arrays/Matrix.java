package arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US); // para aceitar os valores com ". " ex: 9.5 

        System.out.println("Digite a quantidade de alunos: ");
        int quantAlunos = entrada.nextInt();

        System.out.println("Digite a quantidade de notas por aluno: ");
        int quantNotas = entrada.nextInt();

        double[][] notasDaTurma = new double[quantAlunos][quantNotas];

        double total = 0;

        for (int a = 0; a < notasDaTurma.length; a++) {
            for (int n = 0; n < notasDaTurma[a].length; n++) {
                
                System.out.printf("Digite a nota %d do aluno %d: ", (n + 1), (a + 1));
                notasDaTurma[a][n] = entrada.nextDouble();
                total += notasDaTurma[a][n];
            }
        }

        double media = total / (quantAlunos * quantNotas);
        System.out.println("Média da turma: " + media);

        for(double [] notasDoAluno : notasDaTurma){
            System.out.println(Arrays.toString(notasDoAluno));
        }

        entrada.close();
    }
    
}
