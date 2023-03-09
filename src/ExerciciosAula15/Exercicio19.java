package ExerciciosAula15;
import java.util.Scanner;
public class Exercicio19 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo numero");
        int num2 = scan.nextInt();
        System.out.println("Qual operacao deseja realizar?");
        String operacao = scan.next();
        int calculo = 0;
        if(operacao.equals("somar")){
            calculo = num1 + num2;
            System.out.println("o resultado foi de: " + calculo);
            if(calculo % 2 == 0){
                System.out.print("Numero par,");
            }else{
                System.out.print("Numero impar,");
            }
            if(calculo >= 0){
                System.out.println(" posivito");

            }else{
                System.out.println(" negativo");
            }


        }else if(operacao.equals("diminuir")){
            calculo = num1 - num2;
            System.out.println("o resultado foi de: " + calculo);
            if(calculo % 2 == 0){
                System.out.print("Numero par,");
            }else{
                System.out.print("Numero impar,");
            }
            if(calculo >= 0){
                System.out.println(" posivito");

            }else{
                System.out.println(" negativo");
            }

        }else if(operacao.equals("multiplicar")){
            calculo = num1 * num2;
            System.out.println("o resultado foi de: " + calculo);
            if(calculo % 2 == 0){
                System.out.print("Numero par,");
            }else{
                System.out.print("Numero impar,");
            }
            if(calculo >= 0){
                System.out.println(" posivito");

            }else{
                System.out.println(" negativo");
            }

        }else if(operacao.equals("dividir")){
            calculo = num1/num2;
            System.out.println("o resultado foi de: " + calculo);
            if(calculo % 2 == 0){
                System.out.print("Numero par,");
            }else{
                System.out.print("Numero impar,");
            }
            if(calculo >= 0){
                System.out.println(" posivito");

            }else{
                System.out.println(" negativo");
            }
        }
        


    }
}
