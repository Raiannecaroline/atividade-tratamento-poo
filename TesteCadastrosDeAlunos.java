import java.util.List;

public class TesteCadastrosDeAlunos {

    public static void main(String[] args) {
        CadastroAlunos cadastroAlunos = new CadastroAlunos();

        try {
            Aluno aluno1 = new Aluno("Elvis", "Rua A", "A1");
            Aluno aluno2 = new Aluno("Emanoel", "Rua C", "A2");
            Aluno aluno3 = new Aluno("Raiane", "Rua C", "A3");

            cadastroAlunos.adicionarAluno(aluno1);
            cadastroAlunos.adicionarAluno(aluno2);
            cadastroAlunos.adicionarAluno(aluno3);

        } catch (MatriculaDuplicadaException e) {
            System.out.println("Erro: " + e.getMessage());
        }


        List<Aluno> alunosCadastrados = cadastroAlunos.listarAlunos();
        System.out.println("Os alunos estão cadastrados!!");

        for (Aluno aluno : alunosCadastrados) {
            System.out.println("-----------------------------------------\n");
            System.out.println("Nome: " + aluno.getNome() +
                    "\n Matricula: " + aluno.getMatricula() +
                    "\n Endereço: " + aluno.getEndereco());
        }

    }

}
