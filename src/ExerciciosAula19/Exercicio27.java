package ExerciciosAula19;
import java.util.Scanner;
public class Exercicio27 {
    public static void main(String [] args){
        int[] a = new int[10];
        String[] b = new String[a.length];
        for (int i = 0; i < a.length; i ++){
            System.out.println("Digite o elemento" + (a[i]+1));
            if (a[i] < 7){
                    b[i] = "a";

            }else if(a[i] == 7){
                b[i] = "b";

            }else if((a[i] > 7) && (a[i] < 10)){
                b[i] = "c";

            }else  if(a[i] == 10){
                b[i] = "d";

            }else if(a[i] > 10){
                b[i] = "e";
            }
        }
    }
}
