package orientacaoObjetos.heranca.desafio;

public class Ferrari extends Carro{

    Ferrari() {
        this(315);
    }

    Ferrari(int velocidadeMax) {
        super(velocidadeMax);
        delta = 15;
    }
    
//   @Override //validação - não obrigatório
//  void acelerar() {
//       velocidadeAtual += 15;
//   }
}
