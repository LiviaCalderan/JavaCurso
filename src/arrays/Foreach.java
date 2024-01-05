package arrays;

public class Foreach {

    public static void main(String[] args) {
        
        double[] notas = { 10, 8.7, 5.6, 9.9 };

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i] + " ");
        }

        System.out.println();

        for(double nota: notas) { //sem precisar do indice i
            System.out.println(nota);
        }
    }
    
}
