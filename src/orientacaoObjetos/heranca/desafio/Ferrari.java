package orientacaoObjetos.heranca.desafio;

public class Ferrari extends Carro{
    
    @Override //validação - não obrigatório
    void acelerar() {
        velocidadeAtual += 15;
    }
}
