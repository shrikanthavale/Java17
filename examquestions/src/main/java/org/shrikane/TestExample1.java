package org.shrikane;

public class TestExample1 {
}

class Bottle {

    int sun;
    private static int yesterday;

    public int getSun() {
        return sun;
    }

    public void setSun(int sun) {
        sun = sun;
    }

    private static void playMusic(String test) {

    }

    private static class Ship {
        private enum Sail {
            TAIl {
                protected int getHeight() {
                    return 200;
                }
            };

            protected abstract int getHeight();
        }
    }

    public static void main(String[] args) {
        final Bottle bottle = new Bottle();
        int yesterday = 0;
//        final Ship ship = bottle.new Ship();
    }

    enum Animal {
        CHICKEN(21), PENGUIN(75);

        private int numberOfDays;

        Animal(int numberOfDays) {
            this.numberOfDays = numberOfDays;
        }

        public int getNumberOfDays() {
            return numberOfDays;
        }

        public void setNumberOfDays(int test) {
            numberOfDays = test;
        }
    }

    abstract class Provider {

    }
}
