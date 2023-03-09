package ExerciciosAula19;
import java.util.Scanner;
public class Exercicio16 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        int soma = 0;
        int igualA15 = 0;
        int SomaMaiorQue15 = 0;
        int maiorque15 = 0;
        for(int i = 0; i < a.length; i++){
            System.out.println("Digite o elemento " + (i+1));
            a[i] = scan.nextInt();
            if(a[i] < 15){
                soma = soma + a[i];
            }
            if(a[i] == 15){
                igualA15 = igualA15+1;
            }
            if(a[i] > 15){
                SomaMaiorQue15 = SomaMaiorQue15 + a[i];
                maiorque15 ++;
            }
        }
        System.out.println("Soma" + soma);
        System.out.println("Igual a 15" + igualA15);
        System.out.println("Media maior que 15 " + SomaMaiorQue15/maiorque15);
    }
}
