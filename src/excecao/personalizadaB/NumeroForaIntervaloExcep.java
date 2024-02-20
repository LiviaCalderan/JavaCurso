package excecao.personalizadaB;

public class NumeroForaIntervaloExcep extends Exception{
    
    private String nomeDoAtributo;
    
    public NumeroForaIntervaloExcep(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O atributo %s está negativo", nomeDoAtributo);
    }
}
