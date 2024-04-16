package com.learn.java8.dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate1 = LocalDate.of(1999, 4, 15);
        System.out.println(localDate1);

        LocalDate localDate2 = LocalDate.ofYearDay(2024, 106);
        System.out.println(localDate2);

        System.out.println(localDate2.getMonth());
        System.out.println(localDate2.getMonthValue());
        System.out.println(localDate2.getDayOfWeek());
        System.out.println(localDate2.getDayOfYear());
        System.out.println(localDate2.get(ChronoField.DAY_OF_MONTH));


        System.out.println(localDate2.plusDays(2));
        System.out.println(localDate2.plusMonths(4).minusDays(14));
        System.out.println(localDate2.withYear(2019));
        System.out.println(localDate2.with(ChronoField.YEAR, 2018));
        System.out.println(localDate2.with(TemporalAdjusters.firstDayOfNextMonth()));
        System.out.println(localDate2.minus(1, ChronoUnit.YEARS));


        System.out.println(localDate2.isLeapYear());
        System.out.println(localDate.isEqual(localDate1));
        System.out.println(localDate.isBefore(localDate1));
        System.out.println(localDate.isAfter(localDate1));

        System.out.println(localDate2.isSupported(ChronoUnit.MINUTES));



    }
}
