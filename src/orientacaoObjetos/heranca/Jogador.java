package orientacaoObjetos.heranca;
public class Jogador {
    
    int x;
    int y; //posições

    boolean andar(Direcoes direcao){

        switch (direcao) {
            case NORTE:
                y++;
                break;
            case LESTE:
                x--;
                break;
            case SUL:
                y--;
                break;
            case OESTE:
                x++;
                break;
            
        }
             
        return true;
    }
}
