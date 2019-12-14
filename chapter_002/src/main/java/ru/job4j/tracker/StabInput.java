package ru.job4j.tracker;

public class StabInput implements Input {
    private String[] answer;
    private int position = 0;

    public StabInput(String[] answer) {
        this.answer = answer;
    }

    @Override
    public String askStr(String question) {
        return answer[position++];
    }

    @Override
    public int askInt(String question) {
        return Integer.valueOf(askStr(question));
    }
}
