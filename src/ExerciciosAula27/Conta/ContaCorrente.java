package ExerciciosAula27.Conta;

public class ContaCorrente {
    String numero;
    String agencia;
    boolean especial;
    double saldo;
    double limiteEspecial;

    

    boolean realizarSaque(double quantiaASacar){
        if ( saldo >= quantiaASacar){
            saldo -= quantiaASacar;
            return true;
        }else{
            if(especial){
                double limite = limiteEspecial + saldo;
                if(limite >= quantiaASacar){
                    saldo -= quantiaASacar;
                    return true;
                }else {
                    return false;
                }
            }else{
                return false;
            }
        }
            
    }
    void depositar(double valorDepositado){
        saldo += valorDepositado;
    }
    void consultarSaldo (){
        System.out.println("Seu saldo é de: " + saldo);
    }
    boolean verificarUsoChequeEspecial(){
        if(saldo >0){
            return false;
        }else{
            return true;
        }
    }
}
