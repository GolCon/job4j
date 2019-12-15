package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1");
        tracker.add(previous);
        Item next = new Item("test2");
        tracker.replace(previous.getId(), next);
        assertThat(tracker.findById(next.getId()).getName(), is(next.getName()));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item temp = new Item("test1");
        assertThat(tracker.delete(tracker.add(temp).getId()), is(true));
    }

    @Test
    public void whenFindAllReturnItem() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1");
        Item second = new Item("test2");
        Item next = new Item("test3");
        tracker.add(first);
        tracker.add(second);
        tracker.add(next);
        assertThat(tracker.findAll().length, is(3));

    }

    @Test
    public void whenFindByName() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1");
        Item second = new Item("test2");
        Item next = new Item("test1");
        tracker.add(first);
        tracker.add(second);
        tracker.add(next);
        assertThat(tracker.findByName("test1").length, is(2));
        Item[] tests = {first, next};
        assertThat(tracker.findByName("test1"), is(tests));
    }
   }
