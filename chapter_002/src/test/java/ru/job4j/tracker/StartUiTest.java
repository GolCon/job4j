package ru.job4j.tracker;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class StartUiTest {
    @Test
    public void whenCreate() {
        StabInput input = new StabInput(
                new String[]{"0"}
        );
        StubAction action = new StubAction();
        new StartUi().init(input, new Tracker(), new UserAction[]{action});
        assertThat(action.isCall(), Matchers.is(true));
    }
}

