package ExerciciosAula13;
import java.util.Scanner;
public class Exercicio16 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite quantos metros quadrados voce ira pintar");
        double metrosQuadrados = scan.nextDouble();
        double litrosUtilizados = metrosQuadrados / 6;
        double latasDeTinta = litrosUtilizados / 18;
        System.out.println("Voce ira utilizar " + latasDeTinta + " latas de tinta");
        System.out.println("Voce ira pagar " + latasDeTinta*80);
    }
}
