package ExerciciosAula34.Calculadora;

public class ConversaoDeUnidadesDeArea {

    public double metroQuadrado(int metro){
        double guardar = 0;
        for (int i = 0; i < metro; i++){
            guardar = guardar + 10.76;
        }
        return guardar;

    }
    public double peQuadrado (double numero){
        double guardar = 0;
        for (int i = 0; i < numero; i++){
            guardar = guardar + 929;
        }
        return guardar;
    }
    public double milhaQuadrada (double numero){
        double guardar = 0;
        for (int i = 0; i < numero; i++){
            guardar = guardar + 640;
        }
        return guardar;
    }
    public double acre (double numero){
        double guardar = 0;
        for (int i = 0; i < numero; i++){
            guardar = guardar + 43.560;
        }
        return guardar;
    }
    
    
}
