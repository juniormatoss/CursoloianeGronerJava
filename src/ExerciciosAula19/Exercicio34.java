package ExerciciosAula19;
import java.util.Scanner;
public class Exercicio34 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        for(int i = 0; i < a.length; i++){
            System.out.println("Digite o elemento " + (i+1));
            a[i] = scan.nextInt();
        }
        for(int i = 0; i < a.length; i++){
            System.out.println("Analisando o elemento " + a[i]);

            for(int j = 2; j < a[i]; j++){
                if(j % 2 == 0){
                    System.out.println(j + " E par ");

                }
            }
            System.out.println("");
        }
    }
}
