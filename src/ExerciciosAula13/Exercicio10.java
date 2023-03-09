package ExerciciosAula13;
import java.util.Scanner;
public class Exercicio10 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a temperatura");
        double celsius = scan.nextDouble();
        double farenheit = ((1.8 * celsius) + 32);
        System.out.println(farenheit);
    }
}
