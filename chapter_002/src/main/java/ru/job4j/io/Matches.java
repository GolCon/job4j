package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        int step1 = 0;
        int step2 = 0;
        while (run) {
            System.out.println("Игра в 11 спичек.");
            System.out.println("Выбирите вариант игры:");
            System.out.println("1. Один игрок РС.");
            System.out.println("2. Два игрока");
            System.out.println("3. Выход");
            int select = Integer.valueOf(input.nextLine());
            if (select == 3) {
                break;
            }
            System.out.println("Игра началась!");
            int count = 11;
            boolean answer = true;
            while (count != 0) {
                System.out.println("На столе " + count + " спичек.");
                System.out.println("Возьмите со стола от 1 до 3 спичек.");
                answer = true;
                while (answer) {
                    step1 = Integer.valueOf(input.nextLine());
                    if (step1 > count || step1 > 3) {
                        System.out.println("Поробуйте взять меньше!");
                    } else {
                        count = count - step1;
                        answer = false;
                    }
                }
                if (count == 0) {
                    System.out.println("Поздравляем Компьютер c победой над человеком!");
                    System.out.println();
                    break;
                }
                System.out.println("Ход вашего соперника.");
                if (select == 1) {
                    step2 = new Random().nextInt(3);
                    System.out.println("Компьютер берет со стола спички в количестве " + step2);
                    if (step2 > count) {
                        step2 = count;
                    }
                    count = count - step2;
                    if (count == 0) {
                        System.out.println("Поздравляем первого игрока c победой!");
                        System.out.println();
                        break;
                    }
                } else if (select == 2) {
                    if (count == 0) {
                        System.out.println("Поздравляем второго игрока c победой!");
                        System.out.println();
                        break;
                    }
                    answer = true;
                    while (answer) {
                        System.out.println("Возьмите со стола от 1 до 3 спичек.");
                        step2 = Integer.valueOf(input.nextLine());
                        if (step2 > count || step2 > 3) {
                            System.out.println("Поробуйте взять меньше!");
                        } else {
                            count = count - step2;
                            answer = false;
                        }
                    }
                }
            }
        }
    }
}