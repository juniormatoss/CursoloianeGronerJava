package ExerciciosAula35;

public class Calculadora {

    public int Fatorial(int numero){
        int  calcular = 1;

        for (int i = numero; i > numero; i--){
            calcular = calcular * 1;
        }
        return calcular;
    }
    public static int fatorial(int num){
        if(num == 0){
            return 1;
        }
        return num* fatorial(num-1);
    }
}
