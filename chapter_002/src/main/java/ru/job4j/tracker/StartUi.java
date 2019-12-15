package ru.job4j.tracker;

public class StartUi {
    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            if (select >= actions.length) {
                System.out.println("Сommand not found");
            }
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; ++index) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {new CreateAction(), new EditAction(), new DeleteAction(), new FindByIdAction(), new FindByNameAction(), new ShowAllAction()};
        new StartUi().init(input, tracker, actions);
    }
}