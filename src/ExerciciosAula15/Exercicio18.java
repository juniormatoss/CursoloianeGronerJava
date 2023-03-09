package ExerciciosAula15;
import java.util.Scanner;
public class Exercicio18 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o dia");
        int dia = scan.nextInt();
        System.out.println("Digite o mes");
        int mes = scan.nextInt();
        System.out.println("Digite o ano");
        int ano = scan.nextInt();
        if((dia > 31) || (dia <= 0)){
            System.out.println("Dia invalido");

        }else if((mes < 1) || (mes > 12)){
            System.out.println("Mes invalido");

        }else if((ano < 1500) || (ano > 2023)){
            System.out.println("Ano invalido");

        }else{
            System.out.println("Data valida " + dia + "/" + mes + "/" + ano);
        }
    }
}
