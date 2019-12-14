package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
    }

    @Override
    public void passengers(int countPassengers) {
    }

    @Override
    public int refuel(int countFuel) {
        int priceFuel = 20;
        return countFuel * priceFuel;
    }
}
