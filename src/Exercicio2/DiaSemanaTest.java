package Exercicio2;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiaSemanaTest {

    @Test
    public void verificarSeEDomingo() {
        String resultado = DiaSemana.melhorDiaFeira();
        assertEquals("Hoje é domingo! É o melhor dia para ir à feira.", resultado);
    }

    @Test
    public void verificarQualDiaDaSemana() {
        DayOfWeek diaDaSemana = LocalDate.now().getDayOfWeek();
        String resultadoDiaDaSemana = diaDaSemana.getDisplayName(TextStyle.FULL, Locale.getDefault());

        String nomeDiaDaSemana = DiaSemana.diaDaSemana();

        assertEquals("Hoje é " + resultadoDiaDaSemana, nomeDiaDaSemana);
    }
}
