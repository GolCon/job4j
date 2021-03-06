package ru.job4j.conditions;

import org.junit.Test;
import ru.job4j.condition.DummyBot;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DummyBotTest {

    @Test
    public void Greet() {
        assertThat(DummyBot.answer("Привет."), is("Привет пользователь!"));
    }

    @Test
    public void Bye() {
        assertThat(DummyBot.answer("Пока."), is("До скорой встречи!"));
    }

    @Test
    public void Unknow() {
        assertThat(DummyBot.answer("Как настроение?"), is("Это ставит меня в тупик, задайте другой вопрос."));
    }
}
