package orientacaoObjetos.composicaos;

public class CarroTeste {

    public static void main(String[] args) {
        
        Carro c1 = new Carro();
        System.out.println(c1.estaLigado());

        c1.ligar();
        System.out.println(c1.estaLigado());

        System.out.println(c1.motor.giros() + " RPM");

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        System.out.println(c1.motor.giros() + " RPM");

        c1.frear();
        c1.frear();

        // FALTOU ENCAPSULAMENTO
        // c1.motor.fatorIngecao = -30;
        
        System.out.println(c1.motor.giros() + " RPM");
    }
    
}
