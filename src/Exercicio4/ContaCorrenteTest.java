package Exercicio4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContaCorrenteTest {
    ContaCorrente conta=new ContaCorrente(123,"Ana");

    @Test
    public void VerificarSaldoFinal(){
        ContaCorrente conta=new ContaCorrente(123,"Ana");
        conta.depositoConta(100);
        conta.saqueConta(70);
        Assertions.assertEquals(30,conta.getSaldo());
    }
    @Test
    public void testDepositoConta() {
        conta.depositoConta(500.0);
        double saldo = conta.getSaldo();
        Assertions.assertEquals(505.0, saldo);
    }

    @Test
    public void testSaqueContaComSaldoSuficiente() {
        conta.depositoConta(1000.0);
        conta.saqueConta(200.0);
        double saldo = conta.getSaldo();
        Assertions.assertEquals(805.0, saldo);
    }

    @Test

        public void testSaqueContaComSaldoInsuficiente() {
            conta.depositoConta(100.0);
            conta.saqueConta(150.0);
            double saldo = conta.getSaldo();
            Assertions.assertEquals(105.0, saldo);
        }
}
