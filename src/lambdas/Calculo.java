package lambdas;

@FunctionalInterface //força a ter um unico metodo
public interface Calculo {
    
    public abstract double excutar(double a, double b);
    // double teste(); - invalido pois não fica uma interface funcional; Erro
}
