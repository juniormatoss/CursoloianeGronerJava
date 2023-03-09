package ExerciciosAula13;
import java.util.Scanner;
public class Exercicio6 {
    public static void main(String [] args){
        System.out.println("Digite o raio do circulo");
        Scanner scan = new Scanner(System.in);
        double raio = scan.nextDouble();
        double circulo = raio*2;
        System.out.println("seu circulo tem " + circulo + " de Circuferencia");

    }
}
