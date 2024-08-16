package org.shrikane;

import java.math.BigDecimal;
import java.util.Arrays;

class Thingy<T> implements Comparable {
    private T value;

    public Thingy(T value) {
        this.value = value;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Thingy{" +
                "value=" + value +
                '}';
    }
}

public class GenericsExample1 {
    public static void main(String[] args) {
        Thingy[] values  = {
                new Thingy(BigDecimal.valueOf(12.99)),
                new Thingy(BigDecimal.valueOf(7.99)),
                new Thingy(BigDecimal.valueOf(7)),
                new Thingy(BigDecimal.valueOf(9.99))};
        Arrays.sort(values);
        for (Thingy t: values) {
            System.out.print(t + " ");
        }
    }

}
