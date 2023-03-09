package ExerciciosAula13;
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String [ ] args){
        Scanner scan =  new Scanner(System.in);
        System.out.println("Digite um numero");
        int num1 = scan.nextInt();
        System.out.println("Digite outro numero");
        int num2 =scan.nextInt();
        int total = num1 + num2;
        System.out.println("O total foi de " + total);
    }
}
