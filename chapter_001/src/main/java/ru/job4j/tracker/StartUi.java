package ru.job4j.tracker;

public class StartUi {
    public static void createdItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        System.out.print("Enter name: ");
        String name = input.askStr("");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Complited");
        System.out.println("Id item is: " + item.getId());
    }

    public static void showAllItems(Input input, Tracker tracker) {
        System.out.println("=== Show all items ====");
        Item[] item = tracker.findAll();
        for (int i = 0; i < item.length; ++i) {
            System.out.println("Name: " + item[i].getName());
            System.out.println("Id: " + item[i].getId());
            System.out.println();
        }
    }

    public static void editItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ====");
        System.out.print("Enter Id: ");
        String id = input.askStr("");
        System.out.print("Enter name: ");
        String name = input.askStr("");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Complited");
        } else System.out.println("Error");
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ====");
        System.out.print("Enter Id: ");
        String id = input.askStr("");
        if (tracker.delete(id)) {
            System.out.println("Complited");
        } else System.out.println("Error");
    }

    public static void findItemById(Input input, Tracker tracker) {
        System.out.println("=== Find item by Id ====");
        System.out.print("Enter Id: ");
        String id = input.askStr("");
        if (tracker.findById(id).getName() != null) {
            System.out.println("Name: " + tracker.findById(id).getName());
        } else System.out.println("Data not found");
    }

    public static void findItemsByName(Input input, Tracker tracker) {
        System.out.println("=== Find item by name ====");
        System.out.print("Enter name: ");
        String name = input.askStr("");
        Item[] item = tracker.findByName(name);
        System.out.println("Name item is " + item[0].getName());
        for (int i = 0; i < item.length; i++) {
            System.out.println("Id item is " + item[i].getId());
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.println("Select:");
            int select = Integer.valueOf(input.askStr(""));
            if (select == 0) {
                StartUi.createdItem(input, tracker);
            } else if (select == 1) {
                StartUi.showAllItems(input, tracker);
            } else if (select == 2) {
                StartUi.editItem(input, tracker);
            } else if (select == 3) {
                StartUi.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUi.findItemById(input, tracker);
            } else if (select == 5) {
                StartUi.findItemsByName(input, tracker);
            } else if (select == 6) {
                run = false;
            } else {
                System.out.println("Сommand not found");
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item.");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item.");
        System.out.println("3. Delete item.");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");

    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUi().init(input, tracker);
    }
}
