package org.shrikane;

public class EnumDemo {

}

enum Color {
    RED(1, 2) {
        void toSpectrum() {

        }
    },
    ;

    Color(int... i) {
    }

    abstract void toSpectrum();
    final void printColor() {

    }
}

abstract class Trapezoid {
    private int getEqualSides() {
        return 0;
    }
}

abstract class Rectangle extends Trapezoid {
    public static int getEqualSides() {
        return 1;
    }
}

class Square extends Rectangle {
}
