package ExerciciosAula26;

public class Carro {
    

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;


    void exibitAutonomia(){
        System.out.println("á autonomia é de: " + capCombustivel * consumoCombustivel);
    }

    double obterautonomia(){
        System.out.println("Método obter altonomia foi chamado");
        
        return (capCombustivel * consumoCombustivel);
    }
}
