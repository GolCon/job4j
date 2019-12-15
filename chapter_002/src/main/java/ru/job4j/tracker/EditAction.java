package ru.job4j.tracker;

public class EditAction implements UserAction {
    @Override
    public String name() {
        return "==== Edit items ====";
    }

    @Override
    public Boolean execute(Input input, Tracker tracker) {
        System.out.print("Enter Id: ");
        String id = input.askStr("");
        System.out.print("Enter name: ");
        String name = input.askStr("");
        Item item = new Item(name);
        System.out.println(tracker.replace(id, item)?"Complited":"Error");
        return true;
    }
}
