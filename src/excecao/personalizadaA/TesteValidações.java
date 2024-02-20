package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidações {
    public static void main(String[] args) {
        
        try {
            Aluno aluno = new Aluno("Ana", -7.0);
            Validar.aluno(aluno);
            
            Validar.aluno(null);
        } catch (StringVaziaException e) {
            System.out.println(e.getMessage());
        } catch (NumeroForaIntervaloExcep | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Fim 8-8");
    
    }
}
