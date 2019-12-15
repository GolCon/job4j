package ru.job4j.tracker;

public class CreateAction implements UserAction {
    @Override
    public String name() {
        return "==== Create a new Item  ====";
    }

    @Override
    public Boolean execute(Input input, Tracker tracker) {
        System.out.println("Enter name: ");
        String name = input.askStr("");
        Item item = new Item(name);
        tracker.add(item);
        return true;
    }
}
