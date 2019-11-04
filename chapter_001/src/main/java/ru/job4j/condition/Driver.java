package ru.job4j.condition;

public class Driver {
    private char license = 'N';

    public char exam(char category) {
        license = category;
        return license;
    }

    public boolean licence() {
        return this.license == 'A' || this.license == 'B' || this.license == 'C';
    }

    public boolean drive(char category) {
        return this.license == category;
    }
}
