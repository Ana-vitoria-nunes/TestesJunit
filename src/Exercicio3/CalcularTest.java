package Exercicio3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcularTest {

    @Test
    public void NumeroParouImpar(){
        Calcular calcular=new Calcular(5);
        int num=calcular.verificarSeONumeroEparOuImpar(calcular.getNumero());
        Assertions.assertEquals(calcular.getNumero(),num);
    }
}
