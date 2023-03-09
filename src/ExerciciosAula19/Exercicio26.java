package ExerciciosAula19;
import java.util.Scanner;
public class Exercicio26 {
    public static void main(String [] args){
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];
        for(int i = 0; i < a.length; i++){
            System.out.println("Digite o elemento " + (i+1));
            if(a[i] > b[i]){
                c[i] = 1;
            }
            if(a[i] == b[i]){
                c[i] = 0;

            }
            if(a[i] < b[i]){
                a[i] = -1;
            }

        }
        for( int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
