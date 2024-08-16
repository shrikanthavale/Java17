package org.shrikane;

import java.time.*;

public class DateOffsetExample {
    public static void main(String[] args) {
        final LocalDate localDate = LocalDate.of(2022, 3, 13);
        final LocalTime localTime = LocalTime.of(1, 0);
        final ZoneId zoneId = ZoneId.of("America/New_York");
        final ZonedDateTime zonedDateTime = ZonedDateTime.of(localDate, localTime, zoneId);
        System.out.println(zonedDateTime.getOffset());

        final Duration duration = Duration.ofHours(3);
        final ZonedDateTime later = zonedDateTime.plus(duration);

        System.out.println(later.getOffset());
        System.out.println(later.getHour() + " " + zonedDateTime.getOffset().equals(later.getOffset()));

        System.out.print("""
                "ape"
                "baboon"
                "gorilla"
                """);

        var baa = 8;
        var bleat = ~baa;
        var sheep = ~bleat;
        System.out.println(bleat + " " + sheep);
    }
}