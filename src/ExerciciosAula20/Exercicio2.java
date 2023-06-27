package ExerciciosAula20;

import java.util.Random;

public class Exercicio2 {
    public static void main(String[] args) {
        int[][] M = new int[10][10];

        Random numerosRandom = new Random();

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = numerosRandom.nextInt(100);
            }

        }
        int maiorLinha5 = 0;
        int menorLinha5 = 100;
        
        for (int i = 0; i < M[5].length; i++) {
            if (M[5][i] > maiorLinha5) {
                maiorLinha5 = M[5][i];
            }
            if (M[5][i] < menorLinha5) {
                menorLinha5 = M[5][i];
            }
        }
        System.out.println("maior valor da linha 5 = " + maiorLinha5);
        System.out.println("menor valor da linha 5 = " + menorLinha5);
        
        int maiorcoluna7 = 0;
        int menorcoluna7 = 100;
        for (int i = 0; i <M.length; i ++){
            if(M[i][7] > maiorcoluna7){
                maiorcoluna7 = M[i] [7];
            }
            if(M[i][7] < menorcoluna7){
                menorcoluna7 = M[i] [7];
            }

        }
        System.out.println("maior valor da linha 7 = " + maiorcoluna7);
        System.out.println("menor valor da linha 7 = " + menorcoluna7);






    }

}
