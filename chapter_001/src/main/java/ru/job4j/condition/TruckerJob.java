package ru.job4j.condition;

public class TruckerJob {
    public static void main(String[] args) {
        Driver steve = new Driver();
        System.out.println("Steve wants the trucker job.");
        if (!steve.licence()) {
            System.out.println("Steve to get a license");
            steve.exam('B');
        }
        if (steve.drive('C')) {
            System.out.println("Steve can works on truckers");
        } else if (steve.drive('B')) {
            System.out.println("Steve can works in taxi");
        } else {
            System.out.println("Steve does not have a job, but ride on motobike!");
        }
    }
}
