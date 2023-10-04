import java.util.ArrayList;
import java.util.List;

public class CadastroAlunos {

    private List<Aluno> alunos;

    public CadastroAlunos() {
        alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) throws MatriculaDuplicadaException {
        for (Aluno a : alunos) {
            if (a.getMatricula().equals(aluno.getMatricula())) {
                throw new MatriculaDuplicadaException("Matrícula duplicada: " + aluno.getMatricula());
            }
        }
        alunos.add(aluno);
    }

    public List<Aluno> listarAlunos() {
        return alunos;
    }

}
