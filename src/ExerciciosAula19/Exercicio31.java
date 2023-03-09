package ExerciciosAula19;
import java.util.Scanner;
public class Exercicio31  {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int[] a = new int[20];
        int[] b = new int[20];
        int contImpar = 9;
        int contPar = 0;
        for(int i = 0; i < a.length; i++){

            System.out.println("Ditie o numero " + (i+1));
            a[i] = scan.nextInt();
            if(a[i] % 2 == 0 ){
                b[contPar] = a[i];
                contPar++;

            }else if(a[i] % 2 != 0){
                contImpar++;
                b[contImpar] = a[i];
            }
        }
        for(int i = 0; i < a.length; i++) {
            System.out.print(b[i] + "  ");
        }
    }
}
