package orientacaoObjetos.heranca;

public class Jogo {
    public static void main(String[] args) {
        
        Monstro Monstro = new Monstro();
        Monstro.x = 10;
        Monstro.y = 10;
        
        Heroi heroi = new Heroi();
        heroi.x = 11;
        heroi.y = 10;

        System.out.println( "Monstro tem = " + Monstro.vida + " pontos de vida");
        System.out.println( "Monstro tem = " + heroi.vida + " pontos de vida");

        Monstro.atacar(heroi);
        heroi.atacar(Monstro);

        Monstro.atacar(heroi);
        heroi.atacar(Monstro);

        Monstro.andar(Direcoes.NORTE);
        Monstro.atacar(heroi);
        heroi.atacar(Monstro);

        System.out.println( "Monstro tem = " + Monstro.vida + " pontos de vida");
        System.out.println( "Monstro tem = " + heroi.vida + " pontos de vida");
    }
}
