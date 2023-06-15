package Exercicio4;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente=new ContaCorrente(123,"Ana");

        contaCorrente.depositoConta(100);
        System.out.println("============================");
        contaCorrente.saqueConta(50);
        System.out.println("============================");
        contaCorrente.saqueConta(55);
        System.out.println("============================");


    }
}
