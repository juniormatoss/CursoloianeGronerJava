package ExerciciosAula33.Lampada;

import java.util.Scanner;

public class TesteLampada {
    public static void main(String [] args){

        Lampada lampada = new Lampada();
        Scanner scan =  new Scanner(System.in);
        boolean sair = false;

        while(sair == false){
            System.out.println();
            System.out.println("Quer ligar a lâmpada? (S) ou (N)");
            String ligar = scan.nextLine();
            System.out.println();
            if(ligar == "S"){
                lampada.ligar();
                sair = true;
            }
            else if(ligar == "N"){
                lampada.desligada();
                sair = true;
            }else{
                System.out.println("Digito incorreto, digite novamente");  
            }
        }    
    }
}
