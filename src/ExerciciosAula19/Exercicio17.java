package ExerciciosAula19;
import java.util.Scanner;
public class Exercicio17 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        int quantMaiorQue35 = 0;
        for(int i = 0; i < a.length; i++  ){
            System.out.println("Digite a sua idade");
            a[i] = scan.nextInt();
            if(a[i] > 35){
                quantMaiorQue35 ++;
            }
        }
        System.out.println(quantMaiorQue35);


    }
}
