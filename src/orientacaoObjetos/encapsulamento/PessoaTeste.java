package orientacaoObjetos.encapsulamento;

public class PessoaTeste {
    
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Marcos", 30);
        p1.setIdade(-30);

        System.out.println(p1.getIdade()); //ler
        System.out.println(p1); //toString
    }
}
