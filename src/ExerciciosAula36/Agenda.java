package ExerciciosAula36;

public class Agenda {

    private String nome;
    public Contato[] contatos;

    public String nome() {
        return this.nome;
    }

    public void nome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public Agenda() {

    }

    public Agenda(String nome) {
        this.nome = nome;
    }

    public String obterinformacoes() {
        String info = "nome = " + nome + "\n";
        if (contatos != null) {
            for (Contato c : contatos) {
                info += c.obertInformacoes() + "\n";
            }
        }

        return info;
    }

}
