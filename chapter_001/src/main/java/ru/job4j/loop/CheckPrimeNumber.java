package ru.job4j.loop;

public class CheckPrimeNumber    {
    public boolean check(int num){
        boolean prime = false;
        if(num>0) {
            for (int i = 2; i <= num; ++i) {
                if (num%i!=0 & num==i){
                    prime=true;
                }

            }
            return prime;
        }
        return prime;
    }

}