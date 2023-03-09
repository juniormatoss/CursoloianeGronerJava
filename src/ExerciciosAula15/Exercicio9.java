package ExerciciosAula15;
import java.util.Scanner;
public class Exercicio9 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo numero");
        int num2 = scan.nextInt();
        System.out.println("Digite o terceiro nuimero");
        int num3 = scan.nextInt();
        int numMenor = num1;
        int numDoMeio = num1;
        int numMaior = num1;
        if (num2 < numMenor){
            numMenor = num2;
        }
        if((num3 < num2) || (num3 < num1)){
            numMenor = num3;
        }
        if((num2 > num1)){
            numMaior = num2;
        }
        if((num3 > num2) || (num3 > num1)){
            numMaior = num3;
        }
        if ((num2 > numMenor) && (num2 < numMaior)){
            numDoMeio = num2;
        }
        if((num3 > numMenor)&&( num3 < numMaior)){
            numDoMeio = num3;
        }

        System.out.println(numMenor);
        System.out.println(numDoMeio);
        System.out.println(numMaior);

    }
}
