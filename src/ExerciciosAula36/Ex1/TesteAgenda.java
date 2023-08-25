package ExerciciosAula36.Ex1;
import java.util.Scanner;

public class TesteAgenda {
    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome da agenda");
        String nome = scan.nextLine();
        Agenda agenda = new Agenda(nome);

        Contato[] contatos = new Contato[3];

        for (int i = 0; i < contatos.length; i++){
            System.out.println("Digite o contato " + (i+1));
            Contato c = new Contato();
            
            System.out.println("Entre com o nome");
            nome = scan.nextLine();
            c.setNome(nome);
            
            System.out.println("Entre com o Telefone");
            String telefone = scan.nextLine();
            c.setTelefone(i);

            System.out.println("Entre com o Email");
            String email = scan.nextLine();
            c.setEmail(nome);

            contatos[i] = c;
        }
        agenda.setContatos(contatos);
        if(agenda != null){

            
            
            System.out.println(agenda.obterinformacoes());

        }
        
    }
    
}
