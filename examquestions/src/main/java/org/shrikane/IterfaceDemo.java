package org.shrikane;

public abstract interface IterfaceDemo {

    static int subtract(int x, int y) {
        return x - y;
    }

    default void doNothing() {
        System.out.println("test");
    }
}

interface Horn {
    public Integer play();
}

abstract class Woodwind {
    public Short play() {
        return 4;
    }
}

//final class Saxophone extends Woodwind implements Horn {
//    public Object play() {
//        return 5;
//    }
//}