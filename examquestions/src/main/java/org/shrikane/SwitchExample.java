package org.shrikane;

public class SwitchExample {
    enum Admission {ADULT, SENIOR, CHILD}

    public static void main(String[] args) {
        final Admission admission = Admission.ADULT;
        var price = switch (admission) {
            case SENIOR -> false;
            default -> new StringBuilder("2");
            case CHILD -> new Object();

        };

        System.out.println(price);
    }
}
