package ExerciciosAula19;
import java.util.Scanner;
public class Exercicio30 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int[] a = new int[20];
        int[] b = new int[20];
        int[] c = new int[20];
        for (int i = 0; i < a.length; i++){
            System.out.println("Digite o elemento " + (i+1));
            a[i] = scan.nextInt();
            if(a[i] % 2 == 0){
                b[i] = a[i];

            }else if(a[i] %2 != 0){
                c[i] = a[i];
            }
        }
        for(int i = 0; i < a.length; i++){
            if(b[i] != 0) {
                System.out.print(b[i] + " ");
            }
        }
        System.out.println(" ");
        for(int i = 0; i < a.length; i++){
            if(c[i] != 0) {
                System.out.print(c[i] + " ");
            }
        }
    }
}
