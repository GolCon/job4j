package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

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
}
