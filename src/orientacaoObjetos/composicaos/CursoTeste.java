package orientacaoObjetos.composicaos;

public class CursoTeste {

    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("Marcos");
        Aluno aluno2 = new Aluno("Lívia");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Python 2023");
        Curso curso3 = new Curso("Web 2024");

        curso1.addAluno(aluno1);
        curso1.addAluno(aluno2);

        curso2.addAluno(aluno2);
        curso2.addAluno(aluno3);

        aluno1.addCurso(curso3);
        aluno2.addCurso(curso3);
        aluno3.addCurso(curso3);

        for(Aluno aluno: curso3.alunos){
            System.out.println("Estou matriculado no curso " + curso3.nome + "..." );
            System.out.println("....e meu nome é " + aluno.nome);
            System.out.println();

        }

        System.out.println(aluno1.cursos.get(0).alunos);

        Curso cursoEncontrado =aluno1.obterCursoPorNome("Java Completo");

        if(cursoEncontrado != null){
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }

    }
    
}
