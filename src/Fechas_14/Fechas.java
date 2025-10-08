package Fechas_14;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Fechas {
    public static void main(String[] args) {

        // verificar la fecha actual
        LocalDateTime fechaActual = LocalDateTime.now();
        System.out.println(fechaActual);

        LocalDateTime fechaNacimiento = LocalDateTime.of(2003, 07, 07, 5, 10, 30);

        Period periodo = Period.between(fechaNacimiento.toLocalDate(), fechaActual.toLocalDate());

        System.out.println(periodo.getYears() + " años");
        System.out.println(periodo.getMonths() + " meses");
        System.out.println(periodo.getDays() + " dias");
    }
}
