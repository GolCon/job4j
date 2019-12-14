package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Василь Василич Пупыркин");
        student.setGroup("A-4");
        student.setDate(new Date());

        System.out.println("Абитуриент " + student.getFullName() + " зачислен в группу " + student.getGroup());
    }
}
