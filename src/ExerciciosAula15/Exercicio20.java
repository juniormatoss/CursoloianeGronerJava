package ExerciciosAula15;
import java.util.Scanner;
public class Exercicio20 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int perguntas = 0;
        System.out.println("Telefonou para vitima? Sim/Nao");
        String telefonou = scan.next();
        if(telefonou.equals("sim")){
            perguntas = perguntas+ 1;
        }
        System.out.println("Esteve no local do crime? Sim/Nao");
        String localDoCrime = scan.next();
        if(localDoCrime.equals("sim")){
            perguntas = perguntas+ 1;
        }
        System.out.println("Mora perto da vitima? Sim/Nao");
        String moraPerto = scan.next();
        if(moraPerto.equals("sim")){
            perguntas = perguntas+ 1;
        }
        System.out.println("Devia para vitima? Sim/Nao");
        String devia = scan.next();
        if(devia.equals("sim")){
            perguntas = perguntas+ 1;
        }
        System.out.println("Ja trabalhou para vitima? SIm/Nao");
        String trabalhou = scan.next();
        if(trabalhou.equals("sim")){
            perguntas = perguntas+ 1;
        }
        if(perguntas  == 2){
            System.out.println("Suspeita");

        }else if((perguntas >= 3) && (perguntas <=4)){
            System.out.println("Cumplice");

        }else if(perguntas > 5){
            System.out.println("Assassino");

        }else{
            System.out.println("inocente");
        }

    }
}
