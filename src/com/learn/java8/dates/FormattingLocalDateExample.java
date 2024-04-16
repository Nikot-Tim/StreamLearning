package com.learn.java8.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateExample {

    public static void parseLocalDate(){
        //String to a LocalDate
        String date = "1999-04-15";
        LocalDate localDate  = LocalDate.parse(date);
        System.out.println(localDate);

        LocalDate localDate1  = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(localDate1);

        String date1 = "19990415";
        LocalDate localDate2  = LocalDate.parse(date1, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(localDate2);

        //Custom format
        String date2 = "1999|04|15";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate3 = LocalDate.parse(date2, dateTimeFormatter);
        System.out.println(localDate3);


    }

    public static void formatLocalDate() {
        //LocalDate to a String
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy*MM*dd");
        String date = LocalDate.now().format(dateTimeFormatter);
        System.out.println(date);

    }

    public static void main(String[] args) {
        parseLocalDate();
        formatLocalDate();
    }
}
