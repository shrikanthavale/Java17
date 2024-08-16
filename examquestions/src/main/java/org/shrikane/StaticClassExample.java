package org.shrikane;

import java.util.Arrays;

public class StaticClassExample {

}

record test() implements PenguinTest{

}

interface PenguinTest{

}

class Penguin {
    private enum Baby {EGG}

    public static void doSomething() {

    }

    public static void acceptVarargs(final String... varArgs) {
        System.out.println(Arrays.toString(varArgs));
    }

    static class Chick {
        enum Baby {EGG}
    }

    public static void main(String[] args) {
        boolean match = false;
        final Penguin penguin = new Penguin();
        Baby egg = Baby.EGG;
        Penguin.acceptVarargs(new String[] {"hello", "test"});
    }
}

class PenguinExtender extends Penguin {
    public static void doSomething() {

    }
}
