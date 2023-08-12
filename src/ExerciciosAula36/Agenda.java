package ExerciciosAula36;

public class Agenda {
    
    private String nome;
    public Contato [] contatos;


    public String nome(){
        return this.nome;
    }
    public void nome(String nome){
        this.nome = nome;
    }

    public Agenda(){

    }
    public Agenda(String nome){
        this.nome = nome;
    }
}
