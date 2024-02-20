package excecao;

public class Basico {
    public static void main(String[] args) {
        
        Aluno a1 = null;

        try {
            imprimirNomeDoAluno(a1);
        } catch(Exception excecao) {
            System.out.println("Ocorreu um erro no momento de imprimir o nome do usuario");
        }
        
        try {
            System.out.println(7/0);//Exception in thread main - ArithmeticException /0
        } catch (Exception e) {
            //e.printStackTrace(); //em que ponto ocorreu a exceção
            System.out.println("Ocorreu o erro: " + e.getMessage());
        }
        
        System.out.println("Fim !"); 
    }

    public static void imprimirNomeDoAluno(Aluno aluno) {
        System.out.println(aluno.nome);
    }
}
