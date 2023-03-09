package ExerciciosAula19;
import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[ ] args){
        Scanner scan =  new Scanner(System.in);
        int[] a = new int[10];
        int total  = 0;
        for(int i = 0; i < a.length; i++){
            System.out.println("Digite o elemento de numero " + i);
            a[i] = scan.nextInt();
            total = total + a[i];
        }
        System.out.println(total);

    }

}
