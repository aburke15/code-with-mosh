package io.aburke.data_structures;

import java.util.LinkedList;

public class HashTable {
    private class Entry {
        private int key;
        private String value;
        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList[] items;
    private int size;

    public HashTable() {
        items = new LinkedList[10];
        size = 0;
    }

    public void put(int key, String value) {
        var entry = new Entry(key, value);
        var index = hash(key);
        var node = items[index];

        if (node == null) {
            var list = new LinkedList<Entry>();
            list.addLast(entry);
            items[index] = list;
        } else {
            items[index].addLast(entry);
        }

        size++;
    }

    public int size() {
        return size;
    }

    private int hash(int key) {
        return key % items.length;
    }
}
