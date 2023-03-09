package ExerciciosAula13;
import java.util.Scanner;
public class Exercicio9 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a temperatura");
        double farenheit = scan.nextDouble();
        double celsius = (5*(farenheit-32)/9);
        System.out.println(celsius);
    }
}
