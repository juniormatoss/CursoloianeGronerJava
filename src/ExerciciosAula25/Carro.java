package ExerciciosAula25;

public class Carro {
    

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;


    void exibitAutonomia(){
        System.out.println("á autonomia é de: " + capCombustivel * consumoCombustivel);
    }
}
