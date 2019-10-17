package ru.job4j.condition;

public class Max {
    public static int max(int left, int right){
        int result = left;
        if (left > right){
            result = left;
         }
        else if (left < right){
            result = right;
         }
        return result;
    }
}
