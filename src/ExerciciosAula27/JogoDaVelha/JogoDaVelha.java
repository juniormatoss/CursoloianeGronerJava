package ExerciciosAula27.JogoDaVelha;

public class JogoDaVelha {

    char[][] jogoDaVelha = new char[3][3];
    int jogada = 1;

    boolean validarJogada(int linha, int coluna, char sinal) {
        if (jogoDaVelha[linha][coluna] == 'X' || jogoDaVelha[linha][coluna] == 'O' || jogoDaVelha[linha][coluna] == 'x'|| jogoDaVelha[linha][coluna] == 'o') {
            return false;
        } else {
            jogoDaVelha[linha][coluna] = sinal;
            jogada++;
            return true;
        }
    }

    void imprimitTabuleiro(){
        System.out.println("");
            System.out.println("Tabuleiro Atualmente");
            System.out.println("");
            for (int i = 0; i < jogoDaVelha.length; i++) {
                for (int j = 0; j < jogoDaVelha[i].length; j++) {
                    System.out.print(jogoDaVelha[i][j] + "|");
                }
                System.out.println();
            }
    }

    boolean verificarGanhador(char sinal){
        if  ((   jogoDaVelha[0][0] == sinal && jogoDaVelha[0][1] == sinal && jogoDaVelha[0][2] == sinal) || // linha1
                (jogoDaVelha[1][0] == sinal && jogoDaVelha[1][1] == sinal && jogoDaVelha[1][2] == sinal) || // linha2   
                (jogoDaVelha[2][0] == sinal && jogoDaVelha[2][1] == sinal && jogoDaVelha[2][2] == sinal) || // linha3

                (jogoDaVelha[0][0] == sinal && jogoDaVelha[1][0] == sinal && jogoDaVelha[2][0] == sinal) || // coluna1
                (jogoDaVelha[0][1] == sinal && jogoDaVelha[1][1] == sinal && jogoDaVelha[2][1] == sinal) || // coluna2
                (jogoDaVelha[0][2] == sinal && jogoDaVelha[1][2] == sinal && jogoDaVelha[2][2] == sinal) || // coluna3

                (jogoDaVelha[0][0] == sinal && jogoDaVelha[1][1] == sinal && jogoDaVelha[2][2] == sinal) || // diagonal1
                (jogoDaVelha[2][0] == sinal && jogoDaVelha[1][1] == sinal && jogoDaVelha[0][2] == sinal)) { // diagonal2
            return true;
        }
        return false;
    }


    boolean vezJogador1(){
        if (jogada % 2 == 1){
            return true;
        }else{
            return false;
        }
    }

}
