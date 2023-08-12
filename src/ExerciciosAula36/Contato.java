package ExerciciosAula36;

public class Contato {

   
    private String nome;
    private int telefone;
    private String email;

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String obertInformacoes(){
        return "Mome " + nome + "Telefone " + telefone + "Email " + email;
    }
   
    
    


    
}
