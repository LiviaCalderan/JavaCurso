package orientacaoObjetos.encapsulamento.casaB;

import orientacaoObjetos.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    void testeAcessos() {
        //segredo
        //facoDentroDeCasa
        //formaDeFalar
        //todosSabem
        
        //System.out.println(segredo); - privad da ana
        //System.out.println(facoDentroDeCasa); - visibilidade pacote
        System.out.println(formaDeFalar);
        System.out.println(todosSabem);

    }
    
}
