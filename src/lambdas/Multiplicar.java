package lambdas;

public class Multiplicar implements Calculo {

    public double excutar(double a, double b) {
        return a * b;
     }
    
     //java entende que essa função lambda tem que bater com parametros e tipo de retorno que tem na interface
}
