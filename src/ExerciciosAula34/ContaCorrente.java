package ExerciciosAula34;

public class ContaCorrente {

    private Double numero;
    private Double saldo;
    private boolean especial;
    private Double limite;

    public ContaCorrente(Double numero, Double saldo, boolean especial, Double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.especial = especial;
        this.limite = limite;
    }

    public ContaCorrente() {

    }

    public Double getNumero() {
        return this.numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public boolean sacar(double valor, boolean especial) {
        if (valor <= (this.saldo)) {
            System.out.println("Saque aceito");
            saldo = saldo - valor;
            return true;
        } else {
            if (especial == true) {
                double limites = limite + saldo;
                if (limites >= valor) {
                    System.out.println("Saque aceito");
                    return true;
                } else {
                    System.out.println("Saldo insuficiente");
                    return false;
                }
            }else{
                System.out.println("Saldo insuficiente");
                return false;
            }

        }

    }

}
