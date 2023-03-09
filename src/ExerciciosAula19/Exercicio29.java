package ExerciciosAula19;
import java.util.Scanner;
public class Exercicio29 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[a.length];
        int[] c = new int[20];
        int cont = (a.length );
        for(int i = 0; i < a.length; i++){
            System.out.println("Digite o elemento de numero" + (i+1) + "de a");
            a[i] = scan.nextInt();
            c[i] = a[i];
        }
        for(int i = 0; i < a.length; i++){
            System.out.println("Digite o elemento de numero" + (i+1) + "de b");
            b[i] = scan.nextInt();
            c[cont] = b[i];
            cont++;
        }
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
        for(int i = 0; i < a.length; i++){
            System.out.print(b[i] + " ");
        }
        System.out.println(" ");
        for(int i = 0; i < c.length; i++){
            System.out.print(c[i] + " ");
        }

    }
}
