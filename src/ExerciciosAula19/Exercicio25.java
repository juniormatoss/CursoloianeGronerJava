package ExerciciosAula19;
import java.util.Scanner;
public class Exercicio25 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[a.length];
        for (int i = 0; i <a.length; i++) {
            System.out.println("Digite um valor de 0 a 10");
            a[i] = scan.nextInt();
            if(a[i] % 2 == 0){
                b[i] = 1;
            }else{
                b[i] = 0;
            }
        }
        for(int i = 0; i < a.length; i++){
            System.out.print(" " + b[i] + " ");
        }
    }
}
