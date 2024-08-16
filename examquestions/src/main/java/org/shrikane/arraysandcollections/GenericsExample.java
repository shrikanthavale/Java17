package org.shrikane.arraysandcollections;

import java.util.*;

public class GenericsExample {

    public static void main(String[] args) {
        final Wash washing = new Wash();
        final Wash wash2 = new Wash<String>();
        final Wash<String> wash = new Wash();

        var blocks = new char[][] {
                {'a', 'b', 'c'},
                {'d',},
                {'e','f'}
        };

        System.out.println(blocks[0][1]);

        final HashMap<String, String> testingMap =  new HashMap<>();
        Set<Map.Entry<String, String>> entries = testingMap.entrySet();
        for (final Map.Entry<String, String> test: entries) {
            String key = test.getKey();
        }
    }

}

class Wash<T> {
    T item;

    public void wash(T item) {
        System.out.println("Clean " + item);
    }
}

class AnotherWash<T extends Collection> {
    public void clear(T items) {
        System.out.println(items.size());
    }

}
