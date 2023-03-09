package ExerciciosAula13;
import java.util.Scanner;
public class Exercicio8 {
    public static void main(String [ ] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Quanto voce ganha por hora?");
        double valorHora = scan.nextDouble();
        System.out.println("Quantas horas voce trabalha por mes?");
        double quantHoras = scan.nextDouble();
        double salario = valorHora * quantHoras;
        System.out.println("Voce ganha um total de " + salario + "por mes");

    }
}
