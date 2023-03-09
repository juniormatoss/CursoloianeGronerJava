package ExerciciosAula15;
import java.util.Scanner;
public class Exercicio14 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua nota");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a segunda nota");
        double nota2 = scan.nextDouble();
        double media = (nota1 + nota2 ) /2;
        if(( media >= 9) && (media <= 10)){
            System.out.println("A");

        }else if((media >= 7.5 )&& (media < 9)){
            System.out.println("B");

        }else if((media >= 6) && (media < 7.5)){
            System.out.println("C");

        }else if ((media >= 4) && (media < 6)){

            System.out.println("D");

        }else if((media < 4) && (media >= 0)){
            System.out.println("E");
        }
    }
}
