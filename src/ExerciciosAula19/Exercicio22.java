package ExerciciosAula19;
import java.lang.Math;
public class Exercicio22 {
    public static void main(String [] args){
        int[] a = new int[10];
        int cont1 = 0;
        int cont0 = 0;
        for (int i = 0; i < a.length; i++){
            a[i] = (int)Math.round(Math.random()* 1);
            if(a[i] == 1){
                cont1 ++;
            }else if(a[i] == 0 ){
                cont0 ++;
            }
        }
        System.out.print("cont0=" +  cont0 +  " cont1=" + cont1);
    }
}
