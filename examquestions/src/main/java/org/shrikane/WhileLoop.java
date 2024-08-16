package org.shrikane;

public class WhileLoop {
    public static void main(String[] args) {
        boolean flag = false;
        // while (false), does not compile
        if (false) {
            flag = !flag;
        }
        System.out.println(flag);
    }
}
