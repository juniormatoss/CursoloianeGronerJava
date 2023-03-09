package ExerciciosAula15;
import java.util.Scanner;
public class Exercicio16 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor de A");
        double valorA = scan.nextDouble();
        if(valorA > 0){
            System.out.println("Digite o valor de B");
            double valorB = scan.nextDouble();
            System.out.println("Digite o valor de C");
            double valorC = scan.nextDouble();
            double valorDelta = (valorB*valorB) - 4*(valorA*valorB);
            if(valorDelta < 0){
                System.out.println("a equação não possui raizes reais");
            }else{
                System.out.println("Aequação possui raizes reais");
            }
        }else{
            System.out.println("Valor de A tem que ser maior que '0'");
        }

    }
}
