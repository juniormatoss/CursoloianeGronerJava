package ExerciciosAula27.Aluno;

import java.util.Scanner;

public class testeAluno {
    public static void main(String [] args){

        Aluno aluno = new Aluno();
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o nome do aluno");
        aluno.nome = scan.next();
    }
    
}
