package ExerciciosAula19;
import java.util.Scanner;
public class Exercicio11 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        int impar = 0;
        int par = 0;
        for(int i = 0; i < a.length; i ++){
            System.out.println("Digite o " + (i + 1) + " numero do vetor");
            a[i] = scan.nextInt();
            if(a[i] % 2 == 0){
                par = par+1;
            }else{
                impar = impar+1;
            }
        }
        System.out.println("Impar " + impar);
        System.out.println("Par " + par);
    }
}
