package org.shrikane;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.ToIntBiFunction;
import java.util.stream.IntStream;

public class ExpressionStatement {
    public static void main(String[] args) {
        final List<String> parameterList = new ArrayList<>();
        final Consumer<String> stringConsumer = s -> parameterList.add(s);
        stringConsumer.accept("shrikant");
        System.out.println(parameterList);

//        execute((a, b) -> a.compareTo(b), "Fred", "Jim");
        final String test = "shrikane";
        IntStream chars = test.chars();
    }

    static <E> void execute(ToIntBiFunction<E, E> comp, E e1, E e2) {
    }

    static <E> void execute(BiFunction<E, E, Integer> comp, E e1, E e2) {

    }
}
