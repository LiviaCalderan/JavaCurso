package excecao.personalizadaA;

public class NumeroForaIntervaloExcep extends RuntimeException{
    
    private String nomeDoAtributo;
    
    public NumeroForaIntervaloExcep(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O atributo %s está negativo", nomeDoAtributo);
    }
}
