package ExerciciosAula19;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String [ ] args){
        Scanner scan = new Scanner(System.in);
        int[] a = new int[8];
        int[] b = new int[a.length];
        for(int i = 0; i < a.length; i++) {
            System.out.println("Digite a posicao " + (i + 1) + "  numero do vetor");
            a[i] = scan.nextInt();
            b[i] = a[i] * 2;
        }
        System.out.print("Vetor A ");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        System.out.print("Vetor B ");
        for(int i = 0; i < a.length; i++){
            System.out.print(b[i] + " ");
        }
    }
}
