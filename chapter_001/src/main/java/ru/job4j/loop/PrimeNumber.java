package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish){
        int count = 0;
        for (int i=2;i<=finish;++i){
            if((finish%i!=0 & finish==i)|finish==2){
                count = count+1;
            }
        }
        return count;

    }
}
