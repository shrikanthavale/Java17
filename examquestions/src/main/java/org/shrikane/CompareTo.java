package org.shrikane;

import java.util.List;

public class CompareTo {
    public static void main(String[] args) {
        Person p1 = new Person();
        Student s1 = new Student();
        Student s2 = new Student();
        Person p2 = s1;

        System.out.println(
                List.of(
                        p1.compareTo(s1),
                        p1.compareTo(p2),
                        p2.compareTo(s1),
                        p2.compareTo(p1),
                        s1.compareTo(p1),
                        s1.compareTo(p2),
                        s1.compareTo(s2)
                )
        );
    }
}

class Person implements Comparable {
    public int compareTo(Person p) {
        return 1;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

class Student extends Person {
    public int compareTo(Student s) {
        return 2;
    }
}
