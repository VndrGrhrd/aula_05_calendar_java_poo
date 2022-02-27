package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {
    public static void main(String[] args)throws ParseException {
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date data = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println(date.format(data));

        Calendar calendario = Calendar.getInstance();
        calendario.setTime(data);
        calendario.add(Calendar.HOUR_OF_DAY, 4);  // Add 4 horas na data
        data = calendario.getTime();
        System.out.println(date.format(data));

        int minutes = calendario.get(Calendar.MINUTE); // Pega o Minutos
        int month = 1 + calendario.get(Calendar.MONTH); // Pega o Minutos

        System.out.println("minutos: " + minutes);
        System.out.println("Mes: " + month);

    }
}
