package ExerciciosAula36.Ex2;

public class Curso {
    private String nome;
    private String horario;
    private Professor professor;
    private Aluno[] aluno;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }

    public String obterInfo() {
        String info = "Nome do curso = " + nome + "\n";
        if (professor != null) {
            info += professor.obterInfo();
        }
        if (aluno != null) {
            System.out.println("--- Alunos ---");
            for (Aluno aluno : aluno) {
                if (aluno != null) {
                    info += aluno.obterInfo();
                    info += "\n";
                }
            }
            info += "\nMédia da turma" + obterMediaTurma();

        }
        return info;

    }

    public double obterMediaTurma() {
        double soma = 0;
        for (Aluno aluno : aluno) {
            if (aluno != null) {
                soma += aluno.obterMedia();
            }
        }
        return soma / aluno.length;
    }
}
