package ru.job4j.array;

public class Turn {
    public int[] back(int[] array){
        for(int index=0;index!=(array.length/2);++index){
            int tmp = array[index];
            int indexEnd =array.length-index-1;
            array[index]=array[indexEnd];
            array[indexEnd]= tmp;
        }
        return array;
    }
}
