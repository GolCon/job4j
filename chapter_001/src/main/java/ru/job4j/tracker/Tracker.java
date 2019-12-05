package ru.job4j.tracker;

import java.util.Objects;
import java.util.Random;

public class Tracker {
    private Item[] items = new Item[100];
    private int position = 0;

    private String generatedId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public Item add(Item item) {
        item.setId(this.generatedId());
        this.items[this.position++] = item;
        return item;
    }

    public boolean replace(String id, Item item) {
        boolean rsl = false;
        for (int i = 0; i < items.length; ++i) {
            if (this.items[i].getId().equals(id)) {
                rsl = true;
                this.items[i] = item;
                break;
            }
        }
        return rsl;
    }

    public boolean delete(String id) {
        boolean rsl = false;
        for (int i = 0; i < items.length; ++i) {
            if (this.items[i].getId().equals(id)) {
                rsl = true;
                System.arraycopy(items, i, items, i + 1, items.length - i - 1);
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        Item[] rsl = this.items;
        for (int i = 0; i < items.length; ++i) {
            if (this.items[i] == null) {
                Item[] item = new Item[i];
                System.arraycopy(items, 0, item, 0, i);
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findByName(String key) {
        int count = 0;
        for (int i = 0; i < items.length; ++i) {
            if (items[i] == null) {
                break;
            } else if (items[i].getName().equals(key)) {
                count++;
            }
        }
        Item[] item = new Item[count];
        int num = 0;
        for (int i = 0; i < items.length; ++i) {
            if (items[i] == null) {
                break;
            } else if (items[i].getName().equals(key)) {
                item[num] = items[i];
                ++num;
            }
        }
        return item;
    }

    public Item findById(String Id) {
        Item rsl = null;
        for (int i = 0; i < items.length; ++i) {
            if (this.items[i].getId().equals(Id)) {
                rsl = this.items[i];
                break;
            }
        }
        return rsl;
    }
}

