package Exercicio2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class DiaSemana {
    public static String diaDaSemana(){
        DayOfWeek diaAtual = LocalDate.now().getDayOfWeek();
        String nomeDiaSemana = diaAtual.getDisplayName(TextStyle.FULL, Locale.getDefault());

        return "Hoje é "+nomeDiaSemana;
    }
    public static String melhorDiaFeira() {
        DayOfWeek dataAtual = LocalDate.now().getDayOfWeek();

        if (dataAtual == DayOfWeek.SUNDAY) {
            return "Hoje é domingo, um ótimo  dia para ir à feira.";
        } else {
            int diasQueFaltam = DayOfWeek.SUNDAY.getValue() - dataAtual.getValue();
            return "Ainda não é um bom dia para ir a feira, aguarde " + diasQueFaltam + " dias para domingo.";
        }
    }
}
