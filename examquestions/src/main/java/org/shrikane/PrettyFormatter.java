package org.shrikane;

import java.time.Duration;
import java.time.Period;

public class PrettyFormatter {
    public static void main(String[] args) {
        System.out.print("""
                "ape"
                "baboon"
                "gorilla"
                """);

        Duration duration = Duration.ofDays(2);
        duration.getSeconds();
        Period period = Period.ofDays(2);

        final String txt = """
                  a
                    b
                  c
                  """;
        txt.lines().map(String::length).forEachOrdered(System.out::print);
    }
}
