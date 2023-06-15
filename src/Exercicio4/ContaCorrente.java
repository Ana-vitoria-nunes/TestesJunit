package Exercicio4;
public class ContaCorrente {
    private int numeroConta;
    private String nomeCorrentista;
    private double saldo;
    double valor;

    public ContaCorrente(int numeroConta1, String nomeCorrentista1) {
        this.numeroConta = numeroConta1;
        this.nomeCorrentista = nomeCorrentista1;
        this.saldo = 5;
    }

    public double getValor() {
        return valor;
    }

    public void setSaldo() {

        this.saldo = 5;
    }

    public double getSaldo() {

        return saldo;
    }

    public int getNumeroConta() {

        return numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void saqueConta(double valor){
        if (getSaldo()-valor<5){
            System.out.println("Saldo insuficiente");
            System.out.println("Seu saldo é de "+getSaldo());
        }
        else {
            saldo-=valor;
            System.out.println("Saque realizado no valor de "+valor+"\nSaldo atual: "+getSaldo());
        }

    }
    public void depositoConta(double valor){
        if (valor<1){
            System.out.println("Não é possivel depositar esse valor");
        }
        else {
            saldo+=valor;
            System.out.println("Deposito de "+valor+" realizado com sucesso");
            System.out.println("Seu saldo é de "+getSaldo());
        }

    }

}
