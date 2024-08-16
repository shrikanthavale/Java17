package org.shrikane.arraysandcollections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraysDemo {
    public static void main(String... args) {
        String[] tiger = new String[1];
        var arrayDeque = new ArrayDeque<String>();
        Object obj = new String();
        final String test = (String) obj;

        final List<String> testing = new ArrayList<>();
        testing.add("b");
        testing.add("a");

        Collections.sort(testing);
        int index = Collections.binarySearch(testing, "a");

        System.out.println(index);


    }
}

class News<Object> {
    private Object test;
}

class Test extends News<Integer> {

}