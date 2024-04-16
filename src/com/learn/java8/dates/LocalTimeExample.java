package com.learn.java8.dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();

        System.out.println(localTime);

        LocalTime localTime1 = LocalTime.of(15, 16);
        System.out.println(localTime1);
        LocalTime localTime2 = LocalTime.of(15, 16, 17);
        System.out.println(localTime2);
        LocalTime localTime3 = LocalTime.of(15, 16, 17,18);
        System.out.println(localTime3);

        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println(localTime.toSecondOfDay());

        System.out.println(localTime.minusHours(2));
        System.out.println(localTime.minus(2, ChronoUnit.HOURS));
        System.out.println(localTime.with(LocalTime.MIDNIGHT));
        System.out.println(localTime.with(ChronoField.HOUR_OF_DAY, 10));
        System.out.println(localTime.plusMinutes(90));
        System.out.println(localTime.withHour(17));

    }
}
