package ExerciciosAula15;
import java.util.Scanner;
public class Exercicio21 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o combustivel que deseja utilizar A - Alcool, G - Gasolina");
        String combustivel = scan.next();
        System.out.println("Digite quantos litros deseja");
        int quantLitros = scan.nextInt();
        String desconto = "";
        if(combustivel.equals("A")){
            if(quantLitros <= 20){
                desconto = "3%";

            }else if(quantLitros > 20){
                desconto = "5%";
            }

        }else if(combustivel.equals("G")){
            if(quantLitros <= 20){
                desconto = "4%";

            }else if(quantLitros > 20){
                desconto = "6%";
            }
        }
        System.out.println("Voce tera " + desconto + " de desconto");
    }
}
