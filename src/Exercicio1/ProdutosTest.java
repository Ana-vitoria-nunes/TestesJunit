package Exercicio1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProdutosTest {
    @Test
    public void analizarSeProduto1TemOMenorValor(){
        double menorValor=0;
        Produtos produtos=new Produtos(5.00,50.00,10.00);
        if(produtos.getProduto1()< produtos.getProduto2() &&produtos.getProduto1()< produtos.getProduto3() ){
            menorValor= produtos.getProduto1();
        }
        Assertions.assertEquals(5.00,menorValor);
    }
    @Test
    public void analizarSeProduto2TemOMenorValor(){
        double menorValor=0;
        Produtos produtos=new Produtos(50.00,5.00,10.00);
        if(produtos.getProduto2()< produtos.getProduto1() &&produtos.getProduto2()< produtos.getProduto3() ){
            menorValor= produtos.getProduto2();
        }
        Assertions.assertEquals(5.00,menorValor);
    }
}
