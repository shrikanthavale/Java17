package org.shrikane;

public class Syncher {
    static final int[] intArray = new int[2];

    public static void pause() {
        while(intArray[0] == 0) {
            try {
                System.out.println("thread is waiting");
                intArray.wait();
            } catch (final InterruptedException interruptedException) {
                System.out.println("Thread interrupted");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        final Thread thread = new Thread() {
            @Override
            public void run() {
                synchronized (intArray) {
                    pause();
                    System.out.println(intArray[0] + intArray[1]);
                }
            }
        };

        thread.start();
        Thread.sleep(1000);
        intArray[0] = intArray[1] = 10;
        System.out.println("initialized int array");
        synchronized (intArray) {
            intArray.notify();
        }
    }
}
