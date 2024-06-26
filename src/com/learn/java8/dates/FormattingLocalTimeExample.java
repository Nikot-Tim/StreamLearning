package com.learn.java8.dates;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalTimeExample {
    public static void parseLocalTime() {
        //String to a LocalTime
        String time = "13:00";
        LocalTime localTime = LocalTime.parse(time);
        System.out.println(localTime);

        LocalTime localTime1 = LocalTime.parse(time, DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println(localTime1);

        //Custom format
        String time1 = "13*00";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH*mm");
        LocalTime localTime2 = LocalTime.parse(time1, dateTimeFormatter);
        System.out.println(localTime2);

        String time2 = "13*00*02";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("HH*mm*ss");
        LocalTime localTime3 = LocalTime.parse(time2, dateTimeFormatter1);
        System.out.println(localTime3);


    }

    public static void formatLocalTime() {
        //LocalTime to a String
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH*mm*ss");
        String time = LocalTime.now().format(dateTimeFormatter);
        System.out.println(time);

    }

    public static void main(String[] args) {
        parseLocalTime();
        formatLocalTime();
    }
}
