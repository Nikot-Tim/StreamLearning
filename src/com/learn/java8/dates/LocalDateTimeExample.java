package com.learn.java8.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(2024, 4, 15, 17, 42, 17, 999);
        System.out.println(localDateTime1);

        LocalDateTime localDateTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(localDateTime2);

        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.get(ChronoField.DAY_OF_MONTH));

        System.out.println(localDateTime.plusHours(20));
        System.out.println(localDateTime.minusDays(20));
        System.out.println(localDateTime.withMonth(4).withDayOfMonth(15));

        LocalDate localDate = LocalDate.of(1999, 4,15);
        System.out.println(localDate.atTime(17, 42));

        LocalTime localTime = LocalTime.of(17, 42);
        System.out.println(localTime.atDate(localDate));

        LocalDateTime localDateTime3 = localTime.atDate(localDate);
        System.out.println(localDateTime3.toLocalDate());
        System.out.println(localDateTime3.toLocalTime());

        
    }
}
