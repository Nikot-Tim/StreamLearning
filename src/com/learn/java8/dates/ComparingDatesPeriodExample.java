package com.learn.java8.dates;

import java.time.LocalDate;
import java.time.Period;

public class ComparingDatesPeriodExample {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(1999, 4, 15);
        LocalDate localDate1 = LocalDate.of(2024, 3, 16);


        Period period = localDate.until(localDate1);
        System.out.println(period.getDays());
        System.out.println(period.getMonths());
        System.out.println(period.getYears());

        Period period1 = Period.ofDays(10);
        System.out.println(period1);

        Period period2 = Period.ofYears(10);
        System.out.println(period2.getYears());
        System.out.println(period2.getMonths());
        System.out.println(period2.toTotalMonths());

        Period between = Period.between(localDate, localDate1);
        System.out.println(between.getDays() + " " + between.getMonths() + " " + between.getYears());

    }
}