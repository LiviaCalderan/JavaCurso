package orientacaoObjetos.composicaos;

public class Motor {

    boolean ligado = false;
    double fatorIngecao = 1;

    int giros(){
        if(!ligado){
            return 0;
        } else {
            return (int) Math.round(fatorIngecao * 3000);
        }
    }
    
}
