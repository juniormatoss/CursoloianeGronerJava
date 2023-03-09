package ExerciciosAula13;
import java.util.Scanner;
public class Exercicio7 {
    public static void main(String [] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite o tamanho de um lado do quadrado em metros");
        double lado = scan.nextDouble();
        double quadrado = lado*lado;
        double dobroQuadrado = quadrado*2;
        System.out.println("O seu quadrado tem a area de " + quadrado);
        System.out.println("o dobro da area do seu quadrado e equivalente a: " + dobroQuadrado);
    }
}
