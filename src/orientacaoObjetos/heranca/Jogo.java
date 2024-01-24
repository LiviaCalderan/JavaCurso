package orientacaoObjetos.heranca;

public class Jogo {
    public static void main(String[] args) {
        
        Jogador j1 = new Jogador();
        j1.x = 10;
        j1.y = 20;
        j1.andar(Direcoes.NORTE);
        j1.andar(Direcoes.OESTE);
        j1.andar(Direcoes.NORTE);
        j1.andar(Direcoes.OESTE);

        System.out.println(j1.y);
        System.out.println(j1.x);
    }
}
