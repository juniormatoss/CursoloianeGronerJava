package ExerciciosAula13;
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite quanos metros são");
        double metros = scan.nextDouble();
        double centimetros = metros*100;
        System.out.println("Voce tem " + centimetros + " centimetros com " + metros + " Metro");
    }

}
