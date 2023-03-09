package ExerciciosAula15;
import java.util.Scanner;
public class Exercicio17 {
    public static void main(String [] args){
        System.out.println("Digite o ano para verificar");
        Scanner scan = new Scanner(System.in);
        double ano = scan.nextDouble();
        double resto = ano % 4;
        if(resto == 0){
            System.out.println("E ano bisexto");
        }else{
            System.out.println("Nao e ano bisexto");
        }
    }
}
