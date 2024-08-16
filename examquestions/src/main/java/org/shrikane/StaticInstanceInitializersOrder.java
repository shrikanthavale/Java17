package org.shrikane;

public class StaticInstanceInitializersOrder {
    public static void main(String[] args) {
        new VehicleTest();
    }
}

abstract class Car {
    static {
        System.out.println(1);
    }

    {
        System.out.println(2);
    }

    public Car() {
        System.out.println(3);
    }
}

class VehicleTest extends Car {
    static {
        System.out.println(4);
    }

    {
        System.out.println(5);
    }

    VehicleTest() {
        System.out.println(6);
    }
}
