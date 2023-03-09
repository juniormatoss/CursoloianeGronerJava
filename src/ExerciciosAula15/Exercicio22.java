package ExerciciosAula15;
import java.util.Scanner;
public class Exercicio22 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos kg de morango voce quer comprar?");
        double kgMorando = scan.nextDouble();
        System.out.println("Quantos kilos de macas voce quer comprar?");
        double kgMaca = scan.nextDouble();
        double precomorango = 0;
        double precomaca = 0;
        double totalComDesconto = 0;
        if(kgMorando <= 5){
            precomorango = 2.50;

        }else if(kgMorando > 5){
            precomorango = 2.20;
        }
        if(kgMaca <= 5){
            precomaca = 1.80;

        }else if (kgMaca > 5){
            precomorango = 1.50;

        }
        double totalDaCompraSemDesconto = (kgMaca * precomaca) + (kgMorando * precomorango);
        if (((kgMaca + kgMorando) > 8) || ((totalDaCompraSemDesconto > 25))){
            totalComDesconto = totalDaCompraSemDesconto - ((10 * totalDaCompraSemDesconto) / 100);
        }
        System.out.println(totalComDesconto);
    }
}
