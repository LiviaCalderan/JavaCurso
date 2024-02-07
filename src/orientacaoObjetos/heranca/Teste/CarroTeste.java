package orientacaoObjetos.heranca.Teste;

import orientacaoObjetos.heranca.desafio.Carro;
import orientacaoObjetos.heranca.desafio.Civic;
import orientacaoObjetos.heranca.desafio.Ferrari;

public class CarroTeste {
     public static void main(String[] args) {
        
        Carro cA = new Civic();
        
        cA.acelerar();
        System.out.println(cA);
        cA.acelerar();
        System.out.println(cA);
        cA.acelerar();
        System.out.println(cA);

        Ferrari c2 = new Ferrari(400);
        c2.ligarTurbo();
        c2.ligarAr();
        c2.desligarAr();

        c2.acelerar();
        System.out.println(c2);
        c2.acelerar();
        System.out.println(c2);
        c2.acelerar();
        System.out.println(c2);
        

     }
}
