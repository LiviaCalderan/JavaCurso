package orientacaoObjetos.heranca.desafio;

public interface Luxo {
    
    public void ligarAr();
    abstract void desligarAr(); 

    default int VelocidadeDoAr(){ //default - não é obrigado a ser implementado
        return 1; // velocidade padrão
    }
}
