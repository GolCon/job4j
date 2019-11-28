package ru.job4j.profession;

public class Engineer extends Profession {
    Task task;

    public Task decision(Client developer) {
        return task;
    }
}
