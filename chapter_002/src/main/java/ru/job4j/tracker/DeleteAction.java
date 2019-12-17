package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete item ====";
    }

    @Override
    public Boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter Id: ");
        System.out.println(tracker.delete(id) ? "Complited" : "Error");
        return true;
    }
}
