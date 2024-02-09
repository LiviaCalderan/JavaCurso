package lambdas;

@FunctionalInterface //força a ter um unico metodo
public interface Calculo {
    
    public double excutar(double a, double b); //abstract implicito
    // double teste(); - invalido pois não fica uma interface funcional; Erro

    default String legal() { //default não da erro
        return "legal";
    }

    static String massa() { //static tbm não da erro - passa a ser da classe
        return "Muito Legal!";
    }
}
