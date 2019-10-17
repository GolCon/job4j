package ru.job4j.condition;

public class DummyBot {
    public static String answer(String questions){
        String rsl = "Это ставит меня в тупик, задайте другой вопрос.";
        if ("Привет.".equals(questions)) {
            rsl="Привет пользователь!";
        }
        else if ("Пока.".equals(questions)){
            rsl="До скорой встречи!";
        }
        return rsl;
    }
}
