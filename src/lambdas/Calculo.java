package lambdas;

@FunctionalInterface //força a ter um unico metodo
public interface Calculo {
    
    public double excutar(double a, double b);
    // double teste(); - invalido pois não fica uma interface funcional; Erro

    default String legal() { //default não da erro
        return "legal";
    }

    static String massa() { //static tbm não da erro
        return "Muito Legal!";
    }
}
