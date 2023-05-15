package ExerciciosAula20;

import java.util.Random;

public class Exercicio1 {
    public static void main(String[] args) {
        int[][] numerosAleatorios = new int[4][4];

        Random numeroRandom = new Random();

        for (int i = 0; i <numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numeroRandom.nextInt(100);

            }
        }
        int maiorNumero = 0;
        int linha = 0;
        int coluna = 0;
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                if (numerosAleatorios[i][j] > maiorNumero) {
                    maiorNumero = numerosAleatorios[i][j];
                    linha = i;
                    coluna = j;
                }

            }
        }

        System.out.println("Maior valor = " + maiorNumero);
        System.out.println("Linha = " + linha);
        System.out.println("Coluna = " + coluna);
    }

}
