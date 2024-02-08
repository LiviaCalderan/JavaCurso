package orientacaoObjetos.abstrato;

public class TesteAbstrato {
    public static void main(String[] args) {
        
        Mamifero a = new Cachorro();
        //Animal a = new Cachorro(); - caso fosse assim, como mamar é abstrato de mamifero eu não conseguiria acessar o metodo

        System.out.println(a.mover());
        System.out.println(a.mamar());
        System.out.println(a.respirar());
    }
}
