package ru.job4j.tracker;

import java.util.Objects;
import java.util.Random;
import java.util.Arrays;

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
        for (int i = 0; i < this.position; ++i) {
            if (this.items[i].getId().equals(id)) {
                rsl = true;
                this.items[i] = item;
                item.setId(generatedId());
                break;
            }
        }
        return rsl;
    }

    public boolean delete(String id) {
        boolean rsl = false;
        for (int i = 0; i < this.position; ++i) {
            if (this.items[i].getId().equals(id)) {
                rsl = true;
                position--;
                System.arraycopy(items, i, items, i + 1, items.length - i - 1);
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        return Arrays.copyOf(this.items, position);
    }

    public Item[] findByName(String key) {
        Item[] rslt = new Item[this.position];
        int count = 0;
        for (int i = 0; i < this.position; ++i) {
            if (items[i].getName().equals(key)) {
                rslt[count] = items[i];
                count++;
            }
        }
        return Arrays.copyOf(rslt, count);
    }

    public Item findById(String Id) {
        Item rsl = null;
        for (int i = 0; i < this.position; ++i) {
            if (this.items[i].getId().equals(Id)) {
                rsl = this.items[i];
                break;
            }
        }
        return rsl;
    }
}

