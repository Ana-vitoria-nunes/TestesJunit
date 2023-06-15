package Exercicio1;

public class Main {
    public static void main(String[] args) {
        Produtos produtos=new Produtos(5.00,50.00,10.00);
        System.out.println("Poduto1 R$"+produtos.getProduto1());
        System.out.println("Poduto3 R$"+produtos.getProduto2());
        System.out.println("Poduto3 R$"+produtos.getProduto3());
        produtos.escolherProdutoMaisBarato();
    }
}