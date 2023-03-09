package ExerciciosAula13;
import java.util.Scanner;
public class Exercicio14 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite quantos Kg voce pescou");
        double peso = scan.nextDouble();
        double muta = 0;
        double pesoEcessivo = 0;
        if(peso > 50){
            pesoEcessivo = peso - 50;
        }
        if(pesoEcessivo > 0){
            System.out.println("Voce ultrapassou " + pesoEcessivo + " kg do limite");
            System.out.println("voce ira pagar um total de: " + pesoEcessivo * 4 + "R$ de multa");
        }else{
            System.out.println("Voce nao ultrapassou o limite, então não pagara multa");


        }


    }
}
