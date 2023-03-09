package ExerciciosAula15;
import java.util.Scanner;
public class Exercicio12 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de horas trabalhadas no mes");
        int quantHoras = scan.nextInt();
        System.out.println("Digite o valor da hora trabalhada");
        double valorHora = scan.nextDouble();
        double salario = quantHoras * valorHora;
        double descontoIR = (5 * salario) / 100;
        double descontoINSS = (10 * salario) / 100;
        double descontoFGTS = (11 * salario) / 100;
        double salarioComDesconto = 0;
        if(salario <= 900){
            salarioComDesconto = salario;

        }else if((salario >900) && (salario <= 1500)){
            salarioComDesconto = (5 * salario) / 100;

        }else if((salario > 1500) && (salario <= 2500)){
            salarioComDesconto = (10 * salario) /100;

        }else if(salario > 2500){
            salarioComDesconto = (20 * salario) / 100;
        }
        System.out.println("Salario Bruto: (5 * 220)    : R$" + salario);
        System.out.println("(-) IR (5%))                : R$" + descontoIR);
        System.out.println("(-) INSS (10%               : R$" + descontoINSS);
        System.out.println("FGTS (11%)                  : R$" + descontoFGTS);
        System.out.println("Total de descontos          : R$" +(descontoIR+descontoINSS));
        System.out.println("Salario Liquido             : R$" + (salario -(descontoIR + descontoINSS)));
    }
}
