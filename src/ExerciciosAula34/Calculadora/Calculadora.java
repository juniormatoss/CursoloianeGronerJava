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
}
