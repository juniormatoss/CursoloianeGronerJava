package ExerciciosAula13;
import java.util.Scanner;
public class Exercicio17 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite quantos metros quadrados voce ira pintar");
        double metrosQuadrados = scan.nextDouble();
        double litrosUtilizados = metrosQuadrados /6;
        double litrosUtilizadosComPorcentagem = (((10 * metrosQuadrados)/100) + metrosQuadrados) / 6 ;
        int lataGrande = 0;
        int lataPequena = 0;
        double quantEmLatasGrandes = litrosUtilizados / 18;
        double quantEmLatasPequenas = litrosUtilizados /3.6;
        while(litrosUtilizados > 3.6) {
            if (litrosUtilizados >= 18) {
                lataGrande = lataGrande + 1;

            }else{
                lataPequena = lataPequena+1;
            }
        }
        System.out.println("Quantidade em latas grandes " + quantEmLatasGrandes);
        System.out.println("Quantidade em latas grandes " + quantEmLatasPequenas);
        System.out.println(Math.ceil(lataPequena +  lataGrande));

    }
}
