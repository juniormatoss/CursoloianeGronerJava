package ExerciciosAula13;
import java.util.Scanner;
public class Exercicio13 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua altura");
        double altura = scan.nextDouble();
        System.out.println("Digite seu sexo (Feminino ou (Masculino)");
        String sexo = scan.next();
        System.out.println("Digite seu peso");
        double peso = scan.nextDouble();
        double pesoCalculado = 01;
        String pesoIdeal = "abaixo";
        if(sexo.equals("Masculino") || sexo.equals("masculino")) {
            pesoCalculado = (72.7 * altura) - 58;
        }else if(sexo.equals("Feminino") || sexo.equals("feminino")) {
            pesoCalculado = (62.1 * altura) - 44.7;
        }
        if (pesoCalculado < 20.7) {
            pesoIdeal = "Voce esta abaixo do peso";
        } else if (pesoCalculado > 20.7 && pesoCalculado < 26.4) {
            pesoIdeal = "peso normal";
        } else{
            pesoIdeal = "Você está acima do peso";
        }
        System.out.println(pesoIdeal);
        System.out.printf("%.1f", pesoCalculado);


    }
}
