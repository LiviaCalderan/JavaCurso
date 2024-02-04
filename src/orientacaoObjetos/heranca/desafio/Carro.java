package orientacaoObjetos.heranca.desafio;

public class Carro {
    
    public final int VELOCIDADE_MAXIMA;
    protected int velocidadeAtual;
    protected int delta = 5;

    protected Carro(int velocidadeMax) {
        VELOCIDADE_MAXIMA = velocidadeMax;
    }

     public void acelerar() {
        if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += delta;
        }

    }

    public void frear() {
        if (velocidadeAtual >= delta ) {
            velocidadeAtual -= delta;
        } else {
            velocidadeAtual = 0;
        }
        
    }
    public String toString() {
        return "Velocidade Atual: " + velocidadeAtual + " Km/h.";
    }
}

