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
        }

    }

    int valor(String tipoValor, Scanner scan) {
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
        return valor;
    }

}
