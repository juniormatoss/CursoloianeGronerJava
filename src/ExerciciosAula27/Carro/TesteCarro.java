package ExerciciosAula27.Carro;
import java.util.Scanner;

public class TesteCarro {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        Carro uno = new Carro();

        uno.marca = "fiat";
        uno.modelo = "uno mille";
        uno.numPassageiros = 5;
        uno.capCombustivel = 100;
        uno.consumoCombustivel = 0.2;
        
        System.out.println(uno.marca);
        System.out.println(uno.modelo);

        uno.exibitAutonomia();

        double autonomia = uno.obterautonomia();
        System.out.println("Autonomia chamada " + autonomia);

        System.out.println("Digite a quantidade de KM");
        double qtdKM = scan.nextDouble();
        double qtdCombustivel = uno.calcularCombustivel(qtdKM);
        System.out.println(qtdCombustivel);

   

    }

    
}
