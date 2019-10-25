package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pred){
        boolean result =true;
        for(int index=0;index!=pred.length ;++index){
            if (word[index]!=pred[index]){
                result = false;
                return result;
            }
        }
        return result;
    }
}
