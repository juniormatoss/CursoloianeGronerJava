package ExerciciosAula19;
import java.util.Scanner;
public class Exercicio28 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[a.length];
        int cont = a.length-1;
        for (int i = 0; i < a.length; i++){
            System.out.println("Digite o elemento " +(i+1));
            a[i] = scan.nextInt();
            b[cont] = a[i];
            cont --;
        }
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
        for(int i = 0; i < a.length; i++){
            System.out.print(b[i] + " ");
        }
    }
}
