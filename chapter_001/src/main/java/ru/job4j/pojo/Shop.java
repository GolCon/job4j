package ru.job4j.pojo;

public class Shop {

    public static Product[] delete(Product[] products, int index) {
        products[index] = null;
        for (int i = index; i < products.length-1; ++i) {
            Product prdct = products[i];
            products[i] = products[i + 1];
        }
        return products;
    }

    public static void main(String[] args) {
        Product products[] = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);

        for (int i = 0; i < products.length; ++i) {
            Product prdct = products[i];
            if (prdct != null) {
                System.out.println(prdct.getName());
            } else {
                System.out.println("null");
            }
        }
        System.out.println();
        Product[] edition = delete(products, 1);
        for (int i = 0; i < edition.length; ++i) {
            Product prdct = products[i];
            if (prdct != null) {
                System.out.println(prdct.getName());
            } else {
                System.out.println("null");
            }
        }
    }
}

