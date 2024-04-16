package com.learn.java8.dates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparingTimesDurationExample {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(17, 42);
        LocalTime localTime1 = LocalTime.of(20, 35);

        System.out.println(localTime.until(localTime1, ChronoUnit.MINUTES));

        Duration duration = Duration.between(localTime, localTime1);
        System.out.println(duration);
        System.out.println(duration.toMinutes());

        Duration duration1 = Duration.ofHours(3);
        System.out.println(duration1.toMinutes());

        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.now().plusDays(10);
        Duration duration2 = Duration.between(localDate, localDate1);
        System.out.println(duration2);
    }
}
