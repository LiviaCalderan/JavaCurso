package orientacaoObjetos.heranca.desafio;

public class Carro {
    
    public final int VELOCIDADE_MAXIMA;
    protected int velocidadeAtual;
    private int delta = 5;

    protected Carro(int velocidadeMax) {
        VELOCIDADE_MAXIMA = velocidadeMax;
    }

     public void acelerar() {
        if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += getDelta();
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

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
}

