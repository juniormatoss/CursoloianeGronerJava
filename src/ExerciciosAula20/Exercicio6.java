package ExerciciosAula20;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[][] jogoDaVelha = new char[3][3];
        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        boolean ganhou = false;
        int jogada = 1;
        char sinal;
        int linha = 0;
        int coluna = 0;
        while (ganhou = true) {
            if (jogada % 2 == 1) {// jogador 1
                System.out.println("Vez do jogador 1 - escolha linha e coluna para jogar(1-3)");
                sinal = 'x';

            } else {// jogador 2
                System.out.println("Vez do jogador 2 - escolha linha e coluna para jogar(1-3)");
                sinal = 'o';
            }
            boolean colunaValida = false;
            boolean linhaValida = false;
            System.out.println("Entre com a linha 1, 2 ou 3");
            while (linhaValida == false) {
                linha = scan.nextInt();
                if (linha >= 1 && linha <= 3) {
                    linhaValida = true;
                } else {
                    System.out.println("Linha inválida, Digite novamente, linha 1, 2 ou 3");
                }
            }
            System.out.println("Entre com a coluna 1, 2 ou 3");
            while (colunaValida == false) {
                coluna = scan.nextInt();
                if (coluna >= 1 && coluna <= 3) {
                    colunaValida = true;
                } else {
                    System.out.println("Coluna inválida, Digite novamente, Coluna 1, 2 ou 3");
                }

            }
            coluna--;
            linha--;
            if (jogoDaVelha[linha][coluna] == 'X' || jogoDaVelha[linha][coluna] == 'O' || jogoDaVelha[linha][coluna] == 'x' || jogoDaVelha[linha][coluna] == 'o' ) {
                System.out.println("Posiçao ja usada, tente novamente");
            } else {
                jogoDaVelha[linha][coluna] = sinal;
                jogada++;
            }
            // Imprimir Tabuleiro
            System.out.println("");
            System.out.println("Tabuleiro Atualmente");
            System.out.println("");
            for (int i = 0; i < jogoDaVelha.length; i++) {
                for (int j = 0; j < jogoDaVelha[i].length; j++) {
                    System.out.print(jogoDaVelha[i][j] + "|");
                }
                System.out.println();
            }
            // Verificar ganhador

            if  ((jogoDaVelha[0][0] == 'X' && jogoDaVelha[0][1] == 'X' && jogoDaVelha[0][2] == 'X') || // linha1
                (jogoDaVelha[1][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[1][2] == 'X') || // linha2
                (jogoDaVelha[2][0] == 'X' && jogoDaVelha[2][1] == 'X' && jogoDaVelha[2][2] == 'X') || // linha3

                (jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][0] == 'X' && jogoDaVelha[2][0] == 'X') || // coluna1
                (jogoDaVelha[0][1] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][1] == 'X') || // coluna2
                (jogoDaVelha[0][2] == 'X' && jogoDaVelha[1][2] == 'X' && jogoDaVelha[2][2] == 'X') || // coluna3

                (jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][2] == 'X') || // diagonal1
                (jogoDaVelha[2][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[0][2] == 'X')) { // diagonal2
            ganhou = true;
            System.out.println("Parabens, ganhador 1 ganhou");

            } else if ((jogoDaVelha[0][0] == 'O' && jogoDaVelha[0][1] == 'O' && jogoDaVelha[0][2] == 'O') || // linha1
                      (jogoDaVelha[1][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[1][2] == 'O') || // linha2
                      (jogoDaVelha[2][0] == 'O' && jogoDaVelha[2][1] == 'O' && jogoDaVelha[2][2] == 'O') || // linha3

                      (jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][0] == 'O' && jogoDaVelha[2][0] == 'O') || // coluna1
                      (jogoDaVelha[0][1] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][1] == 'O') || // coluna2
                      (jogoDaVelha[0][2] == 'O' && jogoDaVelha[1][2] == 'O' && jogoDaVelha[2][2] == 'O') || // coluna3

                      (jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][2] == 'O') || // diagonal1
                      (jogoDaVelha[2][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[0][2] == 'O')) { // diagonal2
                ganhou = true;
                System.out.println("Parabens, ganhador 2 ganhou");

            } else if (jogada >= 9) {
                ganhou = true;
                System.out.println("O Jogo acabou, ninguem ganhou");
            }

        }
    }

}
