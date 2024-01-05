package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioArray {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double total= 0;
        double media = 0;
        
        System.out.println("Digite a quantidade de notas que o aluno possui: ");
        double[] notas = new double[entrada.nextInt()];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a " + (i+1) + "° nota do aluno: ");
            notas[i] = entrada.nextDouble();
        }

        System.out.println(Arrays.toString(notas));

        for (double nota: notas) {
            total += nota;
        } 
        
        media = total / notas.length;
        System.out.println("A média do aluno é " + media);

        if (media >= 7) {
            System.out.println("O aluno está aprovado!!!");
        } else if (media <= 7 && media >= 5) {
            System.out.println("O aluno está de exame!");
        } else {
            System.out.println("O aluno esta reprovado!");
        }
        
        entrada.close();
 
    }
    
}
