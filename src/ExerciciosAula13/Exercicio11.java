package ExerciciosAula13;
import java.util.Scanner;
public class Exercicio11 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        int num1 = scan.nextInt();
        System.out.println("Digite outro numero inteiro");
        int num2 = scan.nextInt();
        System.out.println("Digite outro numero real");
        double num3 = scan.nextDouble();
        System.out.println((num1*2) + (num2/2));
        System.out.println((num1*3)+ num3);
        double result = num3;
        for (int i = 0; i < 2; i++){
            result = result * num3;
        }
        System.out.println(result);
    }
}
