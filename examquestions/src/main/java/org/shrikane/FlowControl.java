package org.shrikane;

public class FlowControl {
    public static void main(String[] args) {
        int m = 0, n = 0;
        while (m < 5) {
            n++;
            if (m == 3) {
                continue;
            }

            switch (m) {
                case 0:
                case 1:
                    n++;
                default:
                    n++;
            }
            m++;
        }
        System.out.println(m + " " + n);

        int count = 0;
        char letter = 'A';
        var returnValue = switch (letter) {
            case 'A' -> count++;
            case 'B' -> count++;
            default -> throw new IllegalStateException("Unexpected value: " + letter);
        };

        System.out.println(count);

        final var GOOD = 100;
        var score = 10;
        switch (score) {
            default:
            case 1:
                System.out.print("1-");
            case -1:
                System.out.print("2-");
            case 4, 5:
                System.out.print("3-");
            case 6:
                System.out.print("4-");
            case 9:
                System.out.print("5-");
        }
        ;
    }
}
