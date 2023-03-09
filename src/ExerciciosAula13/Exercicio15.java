package ExerciciosAula13;
import java.util.Scanner;
public class Exercicio15 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Quanto voce ganha por hora?");
        double valorHora = scan.nextDouble();
        System.out.println("Quantas horas voce trabalha por mes?");
        double horasTrabalhadas = scan.nextDouble();
        double salario = valorHora * horasTrabalhadas;
        double IR = (11 * salario )/ 100;
        double INSS = (8 * salario )/ 100;
        double Sindicato = (5 * salario )/ 100;
        System.out.println("Salario bruto = " + salario);
        System.out.println("Quanto pagou ao INSS = " + INSS);
        System.out.println("Quanto pagou ao Sindicato = " + Sindicato);
        System.out.println("Seu salario liquido foi " + (salario - (IR+ INSS + Sindicato)));

    }

}
