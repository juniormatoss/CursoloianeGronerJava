package ExerciciosAula15;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String [ ] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma letra");
        String letra = scan.nextLine();
        if(letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U") || letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
            System.out.println("Vogal");

        }else{
            System.out.println("Consoante");
        }
    }
}
