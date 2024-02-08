package orientacaoObjetos.abstrato;

public abstract class Animal {

    public final String respirar() { //final - significa que não podera ser sobrescrito na sub classe
        return "Usando oxigênio";
    }

    public abstract String mover();

    //classes abstratas podem estar com metodos/comportamentos não implementados;
}
