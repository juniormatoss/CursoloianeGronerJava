package ExerciciosAula15;
import java.util.Scanner;
public class Exercicio7 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero");
        int num1 = scan.nextInt();
        System.out.println("Digite outro numero");
        int num2 = scan.nextInt();
        System.out.println("Digite o ultimo numero");
        int num3 = scan.nextInt();
        int numMaior = num1;
        int numMenor = num1;
        if(num2 > numMaior){
            numMaior = num2;
        }
        if(num3 > numMaior){
            numMaior = num3;
        }
        if(num2 < numMenor){
            numMenor = num2;
        }
        if(num3 < numMenor){
            numMenor = num3;
        }
        System.out.println(numMenor);
        System.out.println(numMaior);
    }
}
