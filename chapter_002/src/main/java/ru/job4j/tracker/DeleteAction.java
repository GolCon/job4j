package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete item ====";
    }

    @Override
    public Boolean execute(Input input, Tracker tracker) {
        System.out.print("Enter Id: ");
        String id = input.askStr("");
        System.out.println(tracker.delete(id) ? "Complited" : "Error");
        return true;
    }
}
