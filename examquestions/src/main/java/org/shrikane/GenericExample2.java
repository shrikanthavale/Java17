package org.shrikane;

public class GenericExample2 {

    final static int test;

    static {
        test = 2;
    }
    final private int speed = 88;

    public GenericExample2() {
        super();
    }

    public static void main(String[] args) {
//        Object object = choose(991, "800");
        Number number = choose(991, 3.14);
//        Number number = choose((double)991, 3.14);
        int k = (int) (double) choose(1.3, 1.4);

    }

    public static <T extends Comparable> T choose(T t1, T t2) {
        return t1.compareTo(t2) >= 0 ? t1 : t2;
    }
}
