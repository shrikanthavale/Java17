package org.shrikane.arraysandcollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsDemo {

    public static void main(String[] args) {
        final List<String> musems = new ArrayList<>(1);
        final Set<Magazine> magazines = new TreeSet<>();
        magazines.add(new Magazine("test"));
        System.out.println(magazines.iterator().next());
    }

    record Magazine(String name) {
        public int compareTo(Magazine m) {
            return name.compareTo(m.name);
        }
    }
}
