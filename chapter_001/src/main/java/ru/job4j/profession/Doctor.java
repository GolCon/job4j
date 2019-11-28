package ru.job4j.profession;

public class Doctor extends Profession {
    Diagnose diagnose;

    public Diagnose heal(Client pacient) {
        return diagnose;
    }
}
