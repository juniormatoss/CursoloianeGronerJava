package ExerciciosAula27.JogoDaVelha;

import java.util.Scanner;

public class Exer4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        JogoDaVelha jogodavelha = new JogoDaVelha();

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        boolean ganhou = false;
        char sinal;
        int linha = 0;
        int coluna = 0;

        while (!ganhou) {
            if (jogodavelha.vezJogador1()) {
                System.out.println("Vez do jogador 1 - escolha linha e coluna para jogar(1-3)");
                sinal = 'x';

            } else {
                System.out.println("Vez do jogador 2 - escolha linha e coluna para jogar(1-3)");
                sinal = 'o';
            }
            linha = valor("linha", scan);
            coluna = valor("Coluna", scan);

            jogodavelha.validarJogada(linha, coluna, sinal);

            jogodavelha.imprimitTabuleiro();

            if (jogodavelha.verificarGanhador('X')) {
                ganhou = true;
                System.out.println("Parabens, ganhador 1 ganhou");
            } else if (jogodavelha.verificarGanhador('0')) {
                ganhou = true;
                System.out.println("Parabens, ganhador 2 ganhou");

            } else if (jogodavelha.jogada > 9) {
                ganhou = true;
                System.out.println("O Jogo acabou, ninguem ganhou");
            }
        }

    }

    static int valor(String tipoValor, Scanner scan) {
        int valor = 0;
        boolean valorValida = false;
        while (!valorValida) {
            System.out.println("Entre com a " + tipoValor + " (1, 2 ou 3)");
            valor = scan.nextInt();
            if (valor >= 1 && valor <= 3) {
                valorValida = true;
            } else {
                System.out.println("entrava Inválida, tente novamente");
            }
        }
        valor--;
        return valor;
    }

}
