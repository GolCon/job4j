package ru.job4j.tracker;

import org.hamcrest.Matchers;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

public class StartUiTest {

    @Test
    public void whenAddItem() {
        Tracker tracker = new Tracker();
        StabInput input = new StabInput(new String[]{"0", "Add item name", "1"});
        UserAction[] action = {new CreateAction(), new ExitAction()};
        new StartUi().init(input, tracker, action);
        assertThat(tracker.findByName("Add item name")[0].getName(), is("Add item name"));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String id = item.getId();
        UserAction[] action = {new EditAction(), new ExitAction()};
        StabInput input = new StabInput(new String[]{"0", id, "replaced item", "1"});
        new StartUi().init(input, tracker, action);
        assertThat(tracker.findById(id).getName(), is("replaced item"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String id = item.getId();
        UserAction[] action = {new DeleteAction(), new ExitAction()};
        new StartUi().init(new StabInput(new String[]{"0", id, "1"}), tracker, action);
        Item deleted = tracker.findById(id);
        assertNull(deleted);
    }

    @Test
    public void whenCreate() {
        StabInput input = new StabInput(new String[]{"0"});
        StubAction action = new StubAction();
        new StartUi().init(input, new Tracker(), new UserAction[]{action});
        assertThat(action.isCall(), Matchers.is(true));
    }

    @Test
    public void whenPrtMenu() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        StabInput input = new StabInput(new String[]{"0"});
        StubAction action = new StubAction();
        new StartUi().init(input, new Tracker(), new UserAction[]{action});
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("Menu.")
                .add("0. Stub action")
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }
}
