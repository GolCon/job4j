package ru.job4j.tracker;

public class EditAction implements UserAction {
    @Override
    public String name() {
        return "==== Edit items ====";
    }

    @Override
    public Boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter Id: ");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        System.out.println(tracker.replace(id, item) ? "Complited" : "Error");
        return true;
    }
}
