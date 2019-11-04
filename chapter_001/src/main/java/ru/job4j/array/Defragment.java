package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; ++index) {
            String cell = array[index];
            if (cell == null) {
                for (int i = 1; i < array.length; ++i) {
                    if (index + i == array.length) {
                        break;
                    } else if (array[index + i] != null) {
                        array[index] = array[index + i];
                        array[index + i] = null;
                        break;
                    }
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}