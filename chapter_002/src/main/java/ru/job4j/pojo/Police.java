package ru.job4j.pojo;

import java.util.Date;

public class Police {
    public static void main(String[] args) {

        License license = new License();
        license.setOwner("Constantin Golovnev");
        license.setModel("Benthey");
        license.setCode("xx111x");
        license.setCreate(new Date());

        System.out.println(license.getOwner() + " has a car - " + license.getModel() + " : " + license.getCode());
    }
}
