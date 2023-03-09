package ExerciciosAula19;
import java.util.Scanner;
public class Exercicio14 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        int numImpar = 0;
        int quantNumImpar = 0;
        for(int i = 0; i < a.length; i++){
            System.out.println("Digite o elemento "+ i);
            a[i] = scan.nextInt();
            if(a[i] % 2 != 0 ){
                numImpar = numImpar + a[i];
                quantNumImpar = quantNumImpar + 1;
            }
        }
        System.out.println(numImpar/ quantNumImpar);
    }
}
