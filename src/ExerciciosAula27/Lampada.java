package ExerciciosAula27;

public class Lampada {
    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    String[] tipos;
    boolean tipoabajur;

    
    boolean ligada;

    void ligar(){
        ligada = true;
    }
    void desligar(){
        ligada = false;
    }
    void mostrarEstado(){
        if(ligada){
            System.out.println("Está ligada");
        }else{
            System.out.println("Está desligada");
        }
    }    
}
