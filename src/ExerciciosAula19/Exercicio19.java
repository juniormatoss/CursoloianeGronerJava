package ExerciciosAula19;
import java.util.Scanner;
public class Exercicio19 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
            double[] nota1 = new double[10];
            double[] nota2 = new double[10];
            double[] result = new double[10];
        for (int i = 0; i < nota1.length; i++){
            System.out.println("Digite a 1 nota do aluno " + (i+1));
            nota1[i] = scan.nextDouble();
            System.out.println("Digite a 2 nota do " + (i+1));
            nota2[i] = scan.nextDouble();
            result[i] = nota1[i] + nota2[i];
        }
        for(int i = 0; i < result.length; i++) {
            System.out.println("Media do aluno " + (i+1) + " " + result[i] / 2);
        }
    }
}
