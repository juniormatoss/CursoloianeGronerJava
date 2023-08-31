package ExerciciosAula36.Ex2;

public class Aluno {
    private String nome;
    private double matricula;
    private double[] notas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(double matAluno) {
        this.matricula = matAluno;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String obterInfo() {

        String info = "Nome Aluno = " + nome + ";";
        info += "Matricula" + matricula + ";";
        info += "Notas ";
        double soma = 0;
        for (double nota : notas) {
            info += nota + " ";
            soma += nota;
        }
        double media = soma / 4;

        info += "\n" + " mèdia = " + media + " - ";
        if (media >= 7) {
            info += ("Aprovado");
        } else {
            info += ("Reprovado");
        }
        return info;
    }
    public double obterMedia(){
        double soma = 0;
        for(double nota: notas){
            soma += nota;
        }
        return soma/4;
    }


}
