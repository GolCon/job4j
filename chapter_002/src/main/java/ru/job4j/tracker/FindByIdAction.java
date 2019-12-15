package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "=== Find item by Id ====";
    }

    @Override
    public Boolean execute(Input input, Tracker tracker) {
        System.out.print("Enter Id: ");
        String id = input.askStr("");
        String name = tracker.findById(id).getName();
        System.out.println(name != null ? "Name: " + name : "Data not found");
        return true;
    }
}
