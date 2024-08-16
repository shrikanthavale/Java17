package org.shrikane;


record Animal(boolean isMammal) {

}

record Panda(int name) {
    public Panda(String test) {
        this(10);
    }

    public Panda {
        name = 10;
    }

    public int getBeats() {
        return name;
    }

    public static void main(String[] args) {
        System.out.println(new Panda(30).name());
    }
}


public class RecordExample {
}