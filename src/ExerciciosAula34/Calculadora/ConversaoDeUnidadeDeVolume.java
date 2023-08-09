package ExerciciosAula34.Calculadora;

public class ConversaoDeUnidadeDeVolume {
    

    public static double centimetrosCubicos(double numero){
            double guardar = 0;
            for (int i = 0; i < numero; i++){
                guardar = guardar + 1000;
            }
            return guardar;
        
    }
    public static double litros(double numero){
            double guardar = 0;
            for (int i = 0; i < numero; i++){
                guardar = guardar + 1000;
            }
            return guardar;
        
    }
    public static double metroCubico(double numero){
            double guardar = 0;
            for (int i = 0; i < numero; i++){
                guardar = guardar + 35.32;
            }
            return guardar;
        
    }
    public static double galaoAmericanoPolegadas(double numero){
            double guardar = 0;
            for (int i = 0; i < numero; i++){
                guardar = guardar + 231;
            }
            return guardar;
        
    }
    public static double galaoAmericanoLitros(double numero){
            double guardar = 0;
            for (int i = 0; i < numero; i++){
                guardar = guardar + 3.785;
            }
            return guardar;
        
    }

}
