package ExerciciosAula33.Aluno;

public class Aluno {

    String nome;
    Double matricula;
    String curso;
    String[] disciplina = new String[3];
    double[][] notasDisciplinas = new double[3][4];

    public Aluno(String nome, Double matricula, String curso, String[] disciplina, double[][] notasDisciplinas) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.disciplina = disciplina;
        this.notasDisciplinas = notasDisciplinas;
    }

    public Aluno() {

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMatricula() {
        return this.matricula;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String[] disciplina) {
        this.disciplina = disciplina;
    }

    public double[][] getNotasDisciplinas() {
        return notasDisciplinas;
    }

    public void setNotasDisciplinas(double[][] notasDisciplinas) {
        this.notasDisciplinas = notasDisciplinas;
    }

}
