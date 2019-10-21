package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height){
        for(int row=0; row<height;row++){
            if (row%2==0) {
                for (int cell = 0; cell < width; cell++) {
                    System.out.print(cell % 2 == 0 ? "X" : " ");

                }
            } else if (row%2!=0) {
                for (int cell = 0; cell < width; cell++) {
                    System.out.print(cell % 2 == 0 ? " " : "X");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        paint(3,3);
        System.out.println();
        paint(4,4);
    }
}
