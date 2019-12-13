package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class StartUiTest {
    @Test
    public void whenAddItem() {
        String[] answer = {"Fix PC"};
        Input input = new StabInput(answer);
        Tracker tracker = new Tracker();
        StartUi.createdItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("new item");
        tracker.add(item1);
        String[] answers = {item1.getId(), "replaced item"};
        StartUi.editItem(new StabInput(answers), tracker);
        Item replased = tracker.findById(item1.getId());
        assertThat(replased.getName(), is("replaced item"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {item.getId()};
        StartUi.deleteItem(new StabInput(answers), tracker);
        Item replased = tracker.findById(item.getId());
        assertNull(replased);
    }
}

