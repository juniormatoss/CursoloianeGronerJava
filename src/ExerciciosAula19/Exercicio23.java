package ExerciciosAula19;
import java.util.Scanner;
public class Exercicio23 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        boolean parar = false;
        int cont = 0;
        while(parar == false){
            for (int i = 0; i < a.length; i++) {
                a[i] = (int) Math.round(Math.random() * 100);
                cont ++;
                if(a[i] % 2 != 0){
                    parar = true;
                    System.out.println("numero que fez parar " + a[i]);
                    System.out.print("quantas vezes rodou " + cont);
                    break;
                }

            }
        }
    }
}
