package ExerciciosAula35;

public class Somatorio {  

    public static int somar(int numero) {
        if(numero ==1){
            return 1;
        }
         return numero + somar((numero-1));
    }

}
