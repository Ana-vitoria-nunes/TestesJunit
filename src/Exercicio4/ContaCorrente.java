package Exercicio4;
public class ContaCorrente {
    private int numeroConta;
    private String nomeCorrentista;
    private double saldo;
    public ContaCorrente(int numeroConta1, String nomeCorrentista1) {
        this.numeroConta = numeroConta1;
        this.nomeCorrentista = nomeCorrentista1;
        this.saldo = 5;
    }
    public double getSaldo() {

        return saldo;
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
