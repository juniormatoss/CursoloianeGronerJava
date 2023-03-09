package ExerciciosAula15;
import java.util.Scanner;
public class Exercicio10 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Em que turdo voce estuda?");
        String turno = scan.next();
        if(turno.equals("n") || (turno.equals("N"))){
            System.out.println("Boa noite");
        }else if(turno.equals(("t")) || (turno.equals("T"))){
            System.out.println("Boa tarde");

        }else if(turno.equals("M") || (turno.equals("m"))) {
            System.out.println("Bom dia");

        }else{
            System.out.println("Invalido");
        }
    }
}
