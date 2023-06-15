package Exercicio3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcularTest {

    @Test
    public void NumeroPar(){
        int numeroPar=0;
        Calcular calcular=new Calcular(2);
        if (calcular.getNumero()%2==0){
            numeroPar=calcular.getNumero();
        }
        Assertions.assertEquals(calcular.getNumero(),numeroPar);
    }
}
