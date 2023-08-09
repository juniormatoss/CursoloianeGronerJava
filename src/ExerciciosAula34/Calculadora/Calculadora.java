package ExerciciosAula34.Calculadora;

public class Calculadora {

    public char[] somar;

    
    public Double somar(double i, double j){
        return i + j;

    }

    public Double Multiplicar(Double num1, Double num2){
        return num1 * num2;

    }
    public Double Dividir(Double num1, Double num2){
        return num1 / num2;

    }
    public Double potencia (Double num1, Double num2){
        return Math.pow(num1, num2);

    }

    public void Multiplicar(int i, int j) {
    }

    public void Dividir(int i, int j) {
    }
    public int Fatorial(int numero){
        int  calcular = 1;

        for (int i = numero; i > numero; i--){
            calcular = calcular * 1;
        }
        return calcular;
    }
}
