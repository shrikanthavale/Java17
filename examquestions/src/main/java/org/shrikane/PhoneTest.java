package org.shrikane;

public class PhoneTest {
    private int size;

    private final String drive() {
        return "test";
    }

    public static void sendHome(PhoneTest phoneTest, int newSize) {
        phoneTest = new PhoneTest();
        phoneTest.size = 4;
    }

    public static void main(String[] args) {
        var phoneTest = new PhoneTest();
        sendHome(phoneTest, 7);
        System.out.println(phoneTest.size);
    }
}
