package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void show() {
        System.out.println(this.food);
        System.out.println(this.name);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void name(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.print("There are gav's food ");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.name("Gav");
        gav.show();
        System.out.print("There are black's food ");
        Cat black = new Cat();
        black.eat("fish");
        black.name("Black");
        black.show();
    }
}

