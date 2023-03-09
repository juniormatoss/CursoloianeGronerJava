package ExerciciosAula15;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero");
        int num = scan.nextInt();
        if(num >=0 ){
            System.out.println("positivo");
        }else{
            System.out.println("Negativo");
        }
    }
}

