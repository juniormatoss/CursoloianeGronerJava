package ExerciciosAula36;
import java.util.Scanner;

public class TesteAgenda {
    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome da agenda");
        String nome = scan.nextLine();
        Agenda agenda = new Agenda(nome);
    }
    
}
