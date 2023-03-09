package ExerciciosAula19;
import java.util.Scanner;
public class Exercicio32 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int[] a = new int[5];
        for(int i = 0; i < a.length; i++){
            System.out.println("Digite o elemento " + (i+1));
            a[i] = scan.nextInt();
        }
        System.out.println("Tabuada de soma");
        for(int i = 0; i < a.length; i++) {
            System.out.println(" ");
            int contador = 1;
            for (int cont = 0; cont < a.length; cont++) {
                System.out.println(contador + " + " + (i + 1) + " =  " + ((i + 1) + contador) + " ");
                contador++;

            }
        }
        System.out.println("");
        System.out.println("Tabuada de Subtração");
        for(int i = 0; i < a.length; i++) {
            System.out.println(" ");
            int contador = 1;
            for (int cont = 0; cont < a.length; cont++) {
                System.out.println(contador + " - " + (i + 1) + " =  " + (contador - (i + 1)) + " ");
                contador++;

            }
        }
        System.out.println("");
        System.out.println("Tabuada de Multiplicação");
        for(int i = 0; i < a.length; i++) {
            System.out.println(" ");
            int contador = 1;
            for (int cont = 0; cont < a.length; cont++) {
                System.out.println(contador + " * " + (i + 1) + " =  " + (contador * (i + 1)) + " ");
                contador++;

            }
        }
        System.out.println("");
        System.out.println("Tabuada de Divisão");
        for(int i = 0; i < a.length; i++) {
            System.out.println(" ");
            int contador = 1;
            for (int cont = 0; cont < a.length; cont++) {
                System.out.println(contador + " / " + (i + 1) + " =  " + (contador / (i + 1)) + " ");
                contador++;

            }
        }
    }
}
