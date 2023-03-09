package ExerciciosAula15;
import java.util.Scanner;
public class Exercicio6 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero");
        int num1 = scan.nextInt();
        System.out.println("Digite outro numero");
        int num2 = scan.nextInt();
        System.out.println("Digite o ultimo numero");
        int num3 = scan.nextInt();
        int numMaior = num1;
        if ((num2 > num1) && (num2 > num3)) {
            numMaior = num2;

        }else if((num3 > num2) && (num3 > num1)){
            numMaior = num3;
        }
        System.out.println(numMaior);
    }
}
