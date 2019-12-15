package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find item by name ====";
    }

    @Override
    public Boolean execute(Input input, Tracker tracker) {
        System.out.print("Enter name: ");
        String name = input.askStr("");
        Item[] item = tracker.findByName(name);
        System.out.println("Name item is " + item[0].getName());
        for (int i = 0; i < item.length; i++) {
            System.out.println("Id item is " + item[i].getId());
        }
        return true;
    }
}
