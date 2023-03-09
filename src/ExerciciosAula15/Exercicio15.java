package ExerciciosAula15;
import java.util.Scanner;
public class Exercicio15 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro lado do triangulo");
        double lado1 = scan.nextDouble();
        System.out.println("Digite o segundo lado");
        double lado2 = scan.nextDouble();
        System.out.println("Digite o terceiro lado");
        double lado3 = scan.nextDouble();
        boolean triangulo = false;
        String tipoTriangulo = "";
        if((lado1 + lado2) > lado3){
            triangulo = true;
        }
        if((lado2 + lado3) > lado1){
            triangulo = true;
        }
        if((lado3 + lado1) > lado2){
            triangulo = true;
        }
        if(triangulo == true){
            if((lado1 == lado2 ) && ( lado2 == lado3)){
                tipoTriangulo = "Equilatero";

            }else if((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)){
                tipoTriangulo = "Isoceles";

            }else if ((lado1 != lado2) && (lado2 != lado3)){
                tipoTriangulo = "Escaleno";
            }
        }
        System.out.println(tipoTriangulo);
    }
}
