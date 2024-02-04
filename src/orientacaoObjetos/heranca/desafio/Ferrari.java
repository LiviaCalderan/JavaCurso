package orientacaoObjetos.heranca.desafio;

public class Ferrari extends Carro{

    public Ferrari() {
        this(315);
    }

    public Ferrari(int velocidadeMax) {
        super(velocidadeMax);
        delta = 15;
    }
    
//   @Override //validação - não obrigatório
//  void acelerar() {
//       velocidadeAtual += 15;
//   }
}
