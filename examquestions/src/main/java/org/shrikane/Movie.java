package org.shrikane;

enum Admission {ADULT, SENIOR, CHILD}

public class Movie {
    public static void main(String[] args) {
        var price = switch (Admission.CHILD) {
            case ADULT -> 12.50;
            case SENIOR, CHILD -> 10;
        };
        System.out.println(price);
    }
}