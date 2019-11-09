package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int power) {
        this.load = power;
    }

    public void exchange(Battery another) {
        this.load = this.load + another.load;
    }
}
