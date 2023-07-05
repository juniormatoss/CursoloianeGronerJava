package ExerciciosAula20;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){

        int [][] M  = new int [3][3];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                System.out.println("Entre com o valor da pos" + i + "," + j + "]");
                M [i] [j] = scan.nextInt();
            }
        }
        int numPares = 0;
        int numImpares = 0;
        for (int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                if(M[i][j] % 2 == 0){
                    numPares++;
                }else{
                    numImpares++;
                }
            }
        }
        System.out.println("Numeros pares" + numPares);
        System.out.println("Numeros Impares" + numImpares);











    }

    
}
