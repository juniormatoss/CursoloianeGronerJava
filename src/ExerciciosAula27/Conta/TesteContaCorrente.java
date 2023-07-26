package ExerciciosAula27.Conta;

public class TesteContaCorrente {
    public static void main(String [] args){
       
        
        ContaCorrente conta = new ContaCorrente();
        conta.numero = "12345";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.saldo = -10;

        System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);

        boolean saqueEfetuado = conta.realizarSaque(10);


        if(saqueEfetuado){
            System.out.println("saque efetuado com sucesso");
            System.out.println("saldo atual da conta = " + conta.saldo);
        }else{
            System.out.println("Não foi possivel efetuar o saldo, saldo insuficiente");
        }
        


        
    }
    
}
