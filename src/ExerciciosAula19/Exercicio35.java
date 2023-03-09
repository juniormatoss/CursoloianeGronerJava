package ExerciciosAula19;
import java.util.Scanner;
public class Exercicio35 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        for(int i = 0; i < a.length; i++){
            System.out.println("Digite o elemento " + (i+1));
            a[i] = scan.nextInt();
        }
        for(int i = 0; i < a.length; i++){
            System.out.println("Analisando o elemento " + a[i]);

            for(int j = 1; j < a[i]; j++){
                if(a[i] % j == 0){
                    System.out.println(j + " E Divisor");

                }
            }
            System.out.println("");
        }
    }
}
