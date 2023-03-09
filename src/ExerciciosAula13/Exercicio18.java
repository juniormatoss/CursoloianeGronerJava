package ExerciciosAula13;
import java.util.Scanner;
public class Exercicio18 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o tamanho do arquivo para downoad");
        double tamArquivo = scan.nextDouble();
        System.out.println("Digite a velocidade da sua internet");
        double velocidadeInternet = scan.nextDouble();
        double conversaombps = tamArquivo * 8;
        double tempoEmSegTotal = conversaombps / velocidadeInternet;
        double tempoEmMinuto = 0;
        double tempoEmSegunto = 0;
        boolean repetir = true;
        while (repetir == true){
            if (tempoEmSegTotal >= 60) {
                tempoEmMinuto = tempoEmMinuto + 1;
                tempoEmSegTotal = tempoEmSegTotal - 60;
            } else {
                tempoEmSegunto = tempoEmSegTotal;
                repetir = false;
            }
        }
        System.out.print("O tempo para download e: " + tempoEmMinuto + " minutos e " + tempoEmSegunto + " segundos");
    }
}
