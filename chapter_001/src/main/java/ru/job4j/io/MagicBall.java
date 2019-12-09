package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        Scanner input = new Scanner(System.in);
        System.out.println();
        int answer = new Random().nextInt(3);
        String answerString = "";
        if (answer == 1) {
            answerString = "Да";
        } else if (answer == 2) {
            answerString = "Нет";
        } else if (answer == 3) {
            answerString = "Может быть";
        }
        String name = input.nextLine();
        System.out.println(answerString);
    }
}