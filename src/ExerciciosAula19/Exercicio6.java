package ExerciciosAula19;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String [ ] args){
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[a.length];
        for(int i = 0; i < a.length; i++) {
            System.out.println("Digite a posicao " + (i + 1) + "  numero do vetor A ");
            a[i] = scan.nextInt();
            System.out.println("Digite a posicao " + (i + 1) + "  numero do vetor B ");
            b[i] = scan.nextInt();
            c[i] = a[i] + b[i];
        }
        System.out.print("Vetor A ");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        System.out.print("Vetor B ");
        for(int i = 0; i < a.length; i++){
            System.out.print(b[i] + " ");
        }
        System.out.println("");
        System.out.print("Vetor C ");
        for(int i = 0; i < a.length; i++){
            System.out.print(c[i] + " ");
        }
    }
}
