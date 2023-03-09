package ExerciciosAula15;
import java.util.Scanner;
public class Exercicio13 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua altura");
        double altura = scan.nextDouble();
        System.out.println("Digite seu sexo 'Masculino ou Feminino'");
        String sexo = scan.next();
        System.out.println("Digite seu peso");
        double peso = scan.nextDouble();
        double pesoIdeal = 0;
        if((sexo.equals("Masculino")) || (sexo.equals("masculino"))){
            pesoIdeal = (72.7 * altura) - 58;

        }else if(sexo.equals("Feminino") || (sexo.equals("feminino"))){
            pesoIdeal = (62.1*altura) - 44.7;
        }
        if(peso == pesoIdeal){
            System.out.println("Voce esta no peso ideal");

        }else if(peso > pesoIdeal){
            System.out.println("Você está acima do peso");

        }else if(peso < pesoIdeal){
            System.out.println("Voce esta abaixo do peso");
        }
    }
}
