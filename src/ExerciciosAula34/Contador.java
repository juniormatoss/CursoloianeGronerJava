package ExerciciosAula34;

public class Contador{
    
    String nome;
    String funcao;
    int idade;  
    String formacao;   
    String conhecimentoTecnico;

    
    public Contador(String nome, String funcao, int idade, String formacao, String conhecimentoTecnico) {
        this.nome = nome;
        this.funcao = funcao;
        this.idade = idade;
        this.formacao = formacao;
        this.conhecimentoTecnico = conhecimentoTecnico;
    }
    public Contador(){
        
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getFuncao(){
        return this.funcao;
    }
    public void setFuncao(){
        this.funcao = funcao;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getFormacao() {
        return formacao;
    }
    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    public String getConhecimentoTecnico() {
        return conhecimentoTecnico;
    }
    public void setConhecimentoTecnico(String conhecimentoTecnico) {
        this.conhecimentoTecnico = conhecimentoTecnico;
    }


}
