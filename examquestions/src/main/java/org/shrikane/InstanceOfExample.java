package org.shrikane;

public class InstanceOfExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
        System.out.println(null instanceof Bus);
        System.out.println(vehicle instanceof Vehicle);
        System.out.println(vehicle instanceof Bus);
    }
}

interface Vehicle {

}

class Bus implements Vehicle {

}
