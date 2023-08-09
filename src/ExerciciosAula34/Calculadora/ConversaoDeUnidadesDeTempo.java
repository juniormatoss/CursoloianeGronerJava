package ExerciciosAula34.Calculadora;

public class ConversaoDeUnidadesDeTempo {
    
    public static double minutos(double numero){ 
            double guardar = 0;
            for (int i = 0; i < numero; i++){
                guardar = guardar + 60;
            }
            return guardar;
    }

}
