package ru.job4j.oop;

public class Battery {
    private int load = 0;

    public Battery(int power) {
        this.load = power;
    }

    public void exchange(Battery another) {
        this.load = this.load - another.load;
        another.load = 0;
    }

    public static void main(String[] args) {
        Battery startPower = new Battery(10);
        Battery work = new Battery(2);
        System.out.println("Start power: " + startPower.load + ", result power: " + work.load + ".");
        startPower.exchange(work);
        System.out.println("Finish power: " + startPower.load + ".");
    }
}

