package orientacaoObjetos.heranca;

public class Jogo {
    public static void main(String[] args) {
        
        Jogador j1 = new Jogador();
        j1.x = 10;
        j1.y = 10;
        
        Jogador j2 = new Jogador();
        j1.x = 11;
        j2.y = 10;

        System.out.println(j1.vida);
        System.out.println(j2.vida);

        j1.atacar(j2);
        j2.atacar(j1);
        j1.atacar(j2);

        System.out.println(j1.vida);
        System.out.println(j2.vida);
    }
}
