package ExerciciosAula26;

public class TesteCarro {
    public static void main(String [] args){

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
    }
    
}
