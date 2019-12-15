package ru.job4j.tracker;

public interface UserAction {
    String name();

    Boolean execute(Input input, Tracker tracker);
}
