package ru.job4j.condishion;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
    }
    public static void main(String[] args){
       double resultPointOne = distance (2,0,1,0);
       double resultPointTwo = distance(2,2,1, 1);
       double resultPointThree = distance(4,4,2, 2);
       System.out.println("result (2,1) to (1,0) = "+ resultPointOne);
       System.out.println("result (2,1) to (2,1) = "+ resultPointTwo);
       System.out.println("result (2,1) to (2,1) = "+ resultPointThree);

    }
}
