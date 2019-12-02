package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("CleanCode", 0);
        Book doncova = new Book("Doncova", 500);
        Book dostoevsky = new Book("Dostoevsky", 300);
        Book shildt = new Book("Shildt", 800);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = doncova;
        books[2] = dostoevsky;
        books[3] = shildt;
        for (int i = 0; i < books.length; ++i) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getCount());
        }
        System.out.println();
        System.out.println("Replace Clean code to Shildt and replace Shildt to Clean code");
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (int i = 0; i < books.length; ++i) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getCount());
        }
        System.out.println();
        for (int i = 0; i < books.length; ++i) {
            Book bk = books[i];
            String word = "CleanCode";
            if (bk.getName() == word) {
                System.out.println("index CleanCode is " + i);
            }
        }
    }
}
