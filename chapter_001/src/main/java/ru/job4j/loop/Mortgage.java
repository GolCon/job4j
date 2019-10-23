package ru.job4j.loop;

public class Mortgage {
    public int year(int amount,int salary,int persent){
    int year=0;
    while(amount>0) {
        amount = amount+persent*amount/100;
        amount=amount-salary;
        year = year + 1;
    }
    return year;
    }
}
