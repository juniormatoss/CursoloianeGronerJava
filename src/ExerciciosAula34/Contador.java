package ExerciciosAula34;

public class Contador{
    
   static int cont;


    public void Zerar(){
        cont = 0;
    }

    public void incrementar(int numero){
        cont = cont + numero;
    }
    public int getCont(){
        return this.cont;
    }


}
