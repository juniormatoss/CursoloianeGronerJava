package ExerciciosAula19;
import java.util.Scanner;
public class Exercicio13 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        int soma = 0;
        for(int i = 0; i < a.length; i++){
            System.out.println("Digite o elemento " + (i+1));
            a[i]= scan.nextInt();
            if(a[i] % 5 == 0){
                soma = soma + a[i];
            }
        }
        System.out.println(soma);
    }
}
