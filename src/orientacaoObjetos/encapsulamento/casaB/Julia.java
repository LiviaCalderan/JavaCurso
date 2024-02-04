package orientacaoObjetos.encapsulamento.casaB;

import orientacaoObjetos.encapsulamento.casaA.Ana;

public class Julia {

    Ana sogra = new Ana();

    void testeAcessos() {
        //segredo
        //facoDentroDeCasa
        //formaDeFalar
        //todosSabem
        
        //System.out.println(sogra.segredo); - privad da ana
        //System.out.println(sogra.facoDentroDeCasa);
        //System.out.println(sogra.formaDeFalar);
        System.out.println(sogra.todosSabem);

    }
    
}
