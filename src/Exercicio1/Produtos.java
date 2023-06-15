package Exercicio1;
public class Produtos {
    private double produto1;
    private double produto2;
    private double produto3;

    public Produtos(double produto1, double produto2, double produto3) {
        this.produto1 = produto1;
        this.produto2 = produto2;
        this.produto3 = produto3;
    }

    public double getProduto1() {
        return produto1;
    }

    public void setProduto1(double produto1) {
        this.produto1 = produto1;
    }

    public double getProduto2() {
        return produto2;
    }

    public void setProduto2(double produto2) {
        this.produto2 = produto2;
    }

    public double getProduto3() {
        return produto3;
    }

    public void setProduto3(double produto3) {
        this.produto3 = produto3;
    }

    public void escolherProdutoMaisBarato(){
        if (produto1<produto2 && produto1<produto3){
            System.out.println("Você deve comprar o primeiro produto que é o mais barato.");
        }
        else if (produto2<produto1 && produto2<produto3) {
            System.out.println("Você deve comprar o segundo produto que é o mais barato.");

        }
        else {
            System.out.println("Você deve comprar o terceiro produto que é o mais barato.");
        }
}
}
