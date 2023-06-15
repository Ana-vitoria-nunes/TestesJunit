package Exercicio3;
public class Calcular {
    private int numero;

    public Calcular(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }
    public int verificarSeONumeroEparOuImpar(int num){
        if (num%2==0){
            System.out.println("Esse número é par");
        }
        else {
            System.out.println("Esse número é ímpar");
        }
        return num;
    }
}
