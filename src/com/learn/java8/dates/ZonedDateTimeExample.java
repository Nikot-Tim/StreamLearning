package com.learn.java8.dates;

import java.time.*;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime.getOffset());
        System.out.println(zonedDateTime.getZone());
        System.out.println(ZoneId.getAvailableZoneIds().size());

        System.out.println(ZonedDateTime.now(ZoneId.of("America/Chicago")));
        System.out.println(ZonedDateTime.now(ZoneId.of("America/Detroit")));
        System.out.println(ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
        System.out.println(ZonedDateTime.now(ZoneId.of("America/Denver")));


        System.out.println(ZonedDateTime.now(Clock.systemDefaultZone()));
        System.out.println(ZonedDateTime.now(Clock.systemUTC()));
        System.out.println(ZonedDateTime.now(Clock.system(ZoneId.of("America/Denver"))));

        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("America/Denver"));
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.now(Clock.system(ZoneId.of("America/Denver")));
        System.out.println(localDateTime1);

        LocalDateTime localDateTime2 = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        System.out.println(localDateTime2);

        //CONVERT

        LocalDateTime localDateTime3 = LocalDateTime.now();
        System.out.println(localDateTime3);
        ZonedDateTime zonedDateTime1 = localDateTime3.atZone(ZoneId.of("Europe/Warsaw"));
        System.out.println(zonedDateTime1);

        ZonedDateTime zonedDateTime2 = Instant.now().atZone(ZoneId.of("Europe/Warsaw"));
        System.out.println(Instant.now());
        System.out.println(zonedDateTime2);

        OffsetDateTime offsetDateTime = localDateTime3.atOffset(ZoneOffset.ofHours(+1));
        System.out.println(offsetDateTime);
    }
}
