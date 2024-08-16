package org.shrikane;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeFormatter {
    public static void main(String[] args) {
        String inputString = "The time is 15 minutes past 10PM.";
        String pattern = "'The time is 'm' minutes past 'ha.";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
//        LocalTime localTime = LocalTime.parse(inputString, dateTimeFormatter);
//        LocalDateTime localDate = LocalDateTime.parse(inputString, dateTimeFormatter);
        System.out.println(LocalDateTime.of(2015, 9, 20, 22, 15).format(dateTimeFormatter));
//        System.out.println(localDate);
    }
}
