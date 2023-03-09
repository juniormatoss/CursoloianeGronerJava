package ExerciciosAula15;
import java.util.Scanner;
public class Exercicio11 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu salario");
        double salario = scan.nextDouble();
        double salarioComAlmento = 0;
        double percentual = 0;
        double valorDoAlmento = 0;
        if(salario <= 280){
            salarioComAlmento = salario + ((20 * salario  ) / 100);
            percentual = 20;
            valorDoAlmento = (salario * 20) / 100;
        }
        if((salario > 280) && (salario < 700)){
            salarioComAlmento = salario + ((15 * salario) / 100);
            percentual = 15;
            valorDoAlmento = (salario * 15) / 100;
        }
        if((salario >= 700) && (salario < 1500)){
            salarioComAlmento = salario + ((10 * salario) / 100);
            percentual = 10;
            valorDoAlmento = (salario * 10) / 100;
        }
        if(salario > 1500) {
            salarioComAlmento = salario + ((5 * salario) / 100);
            percentual = 5;
            valorDoAlmento = (salario * 5) / 100;

        }
        System.out.println(salario);
        System.out.println(percentual);
        System.out.println(valorDoAlmento);
        System.out.println(salarioComAlmento);

    }
}
