package ExerciciosAula15;
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite F ou M");
        String letra = scan.nextLine();
        if(letra.equals("F") || letra.equals("f")){
            System.out.println("Feminino");

        }else if(letra.equals("M") || letra.equals("m")){
            System.out.println("Masculino");

        }else{
            System.out.println("Sexo invalido");
        }
    }
}
