package ExerciciosAula36.Ex2;

import java.util.Scanner;

public class Exero2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do curso: ");
        String nome = scan.nextLine();

        System.out.println("Digite o horário do curso: ");
        String horario = scan.nextLine();

        System.out.println("Digite o nome do professor: ");
        String nomeProf = scan.nextLine();

        System.out.println("Digite o email do professor: ");
        String emailProf = scan.nextLine();

        System.out.println("Digite o departamento do professor: ");
        String depProf = scan.nextLine();

        Curso curso = new Curso();
        curso.setNome(nome);
        curso.setHorario(horario);

        Professor professor = new Professor();
        professor.setNome(nomeProf);
        professor.setEmail(emailProf);
        professor.setDepartamento(depProf);

        curso.setProfessor(professor);

        System.out.println("-----Alunos-----");

        Aluno[] alunos = new Aluno[5];
        for (int i = 0; i < 4; i++) {

            System.out.println("Digite o nome do aluno" + (i + 1));
            String nomeAluno = scan.nextLine();
            System.out.println("Digite a matricula do aluno");
            double matAluno = scan.nextDouble();
            double notasAluno[] = new double[4];
            for (int j = 0; i < 4; j++) {
                System.out.println("Digite a nota do aluno" + (j + 1));
                notasAluno[j] = scan.nextDouble();
            }
            Aluno aluno = new Aluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matAluno);
            aluno.setNotas(notasAluno);

            alunos[i] = aluno;
        }

        curso.setAluno(alunos);
        System.out.println(curso.obterInfo());

    }
}
