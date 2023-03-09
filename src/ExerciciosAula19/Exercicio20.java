package ExerciciosAula19;
import java.util.Scanner;
public class Exercicio20 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double[] a = new double[20];
        System.out.println("Digite a cotação do dolar em relação ao Real");
        double cotacaoDolar = scan.nextDouble();
        for (int i = 0; i < a.length; i++){
            a[i] = cotacaoDolar*(i+1);
        }
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
