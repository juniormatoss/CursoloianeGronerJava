package ExerciciosAula13;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String [ ] args){
        Scanner scan =  new Scanner(System.in);
        System.out.println("Digite sua primeira nota");
        int nota1 = scan.nextInt();
        System.out.println("Digite sua segunda nota");
        int nota2 = scan.nextInt();
        System.out.println("Digite sua terceira nota");
        int nota3 = scan.nextInt();
        System.out.println("Digite sua quarta nota");
        int nota4 = scan.nextInt();
        double media =  ((nota1 + nota2 + nota3 + nota4)/ 4);
        System.out.println("Sua média foi de  " + media);
    }
}
