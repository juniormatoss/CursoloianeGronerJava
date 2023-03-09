package ExerciciosAula19;
import java.util.Scanner;
public class Exercicio18 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        int menor = 1000;
        int maior = 0;
        for(int i = 0; i < a.length; i++){
            System.out.println("Digite sua idade");
            if(a[i] < menor){
                menor = a[i];
            }
            if(a[i] > maior){
                maior = a[i];
            }
        }
        System.out.println(maior);
        System.out.println(menor);
    }

}
