package arrays;

import java.util.Arrays;

public class Exercicio {
    	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.5;
		notasAlunoA[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[notasAlunoA.length -1]); //pega a ultima nota do array
		
		double total = 0;
		for(int i=0; i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];
		}
		
		System.out.println(total / notasAlunoA.length);
		
		double[] notasAlunoB = {6.9, 8.9, 5.7, 10}; // aqui ja passa direto
		
		double totalAlunoB = 0;
		
		for(int i = 0; i < notasAlunoB.length; i++ ) {
			totalAlunoB += notasAlunoB[i];
			
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length);
		
	}
}