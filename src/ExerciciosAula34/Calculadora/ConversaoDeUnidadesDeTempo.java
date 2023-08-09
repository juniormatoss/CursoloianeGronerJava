package ExerciciosAula34.Calculadora;

public class ConversaoDeUnidadesDeTempo {
    
    public static double segundo(double numero){ 
            double guardar = 0;
            for (int i = 0; i < numero; i++){
                guardar = guardar + 60;
            }
            return guardar;
    }
    public static double hora(double numero){ 
            double guardar = 0;
            for (int i = 0; i < numero; i++){
                guardar = guardar + 60;
            }
            return guardar;
    }
    public static double dia(double numero){ 
            double guardar = 0;
            for (int i = 0; i < numero; i++){
                guardar = guardar + 24;
            }
            return guardar;
    }
    public static double semana(double numero){ 
            double guardar = 0;
            for (int i = 0; i < numero; i++){
                guardar = guardar + 7;
            }
            return guardar;
    }
    public static double mes(double numero){ 
            double guardar = 0;
            for (int i = 0; i < numero; i++){
                guardar = guardar + 30;
            }
            return guardar;
    }
    public static double ano(double numero){ 
            double guardar = 0;
            for (int i = 0; i < numero; i++){
                guardar = guardar + 365.25;
            }
            return guardar;
    }

}
