package composicaos;

public class Carro {

    Motor motor = new Motor();

    void acelerar() {
        motor.fatorIngecao += 0.4;
    }

    void frear() {
        motor.fatorIngecao -= 0.4;
    }

    void ligar() {
        motor.ligado = true;
    }

    void desligar() {
        motor.ligado = false;
    }

    boolean estaLigado(){
        return motor.ligado;
    }
}
