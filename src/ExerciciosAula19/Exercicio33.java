package ExerciciosAula19;
import java.util.Scanner;
public class Exercicio33 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int[] a = new int[5];
        for(int i = 0; i < a.length; i++){
            System.out.println("Digite o elemento" + (i+1));
            a[i] = scan.nextInt();
        }
        for(int i = 2; i <a.length;i++){
            for(int j = 2; i < a[i]; j++){
                if(a[i] % j == 0){
                    System.out.println(a[i] + " e Primo");
                    break;

                }else{
                    System.out.println(a[i] + " nao e primo");
                    break;
                }
            }
        }
    }
}
