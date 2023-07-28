package ExerciciosAula30;

public class Carro {
    

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;



    public Carro(String marca, String modelo) {
    }

    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
    }

    public Carro(String marca, String modelo, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.consumoCombustivel = consumoCombustivel;
    }

    public Carro() {
    }

    void exibitAutonomia(){
        System.out.println("á autonomia é de: " + capCombustivel * consumoCombustivel);
    }

    double obterautonomia(){
        System.out.println("Método obter altonomia foi chamado");
        
        return (capCombustivel * consumoCombustivel);
    }
    
    double calcularCombustivel( double km){
        
        double qtdCombustivel= km / consumoCombustivel;
        return qtdCombustivel;
         
    }

}

