package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;

        for (int i = 1; i <= post.length; ++i) {
            if (post[post.length - i] != word[word.length - i]) {
                result = false;
                return result;
            }
        }
        return result;
    }
}
