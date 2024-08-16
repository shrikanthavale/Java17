package org.shrikane;

public class GenericExample3 {
    public static void main(String[] args) {
        Widget<String> t1 = new Widget("ACME");
        t1.compute(v -> v.length());

    }
}

class Widget<T> {
    private T value;
    private static int result;

    public Widget(T value) {
        this.value = value;
    }

    public void compute (Comparable<T> comparable) {
        result = result + comparable.compareTo(value);
    }
}
