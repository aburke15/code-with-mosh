package io.aburke.data_structures;

import java.util.LinkedList;

public class HashTable {
    private class Entry {
        int key;
        String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry>[] entries;
    private int size;

    public HashTable(int capacity) {
        entries = new LinkedList[capacity];
        size = 0;
    }

    public void put(int key, String value) {
        var index = hash(key);
        if (entries[index] == null) {
            addNewBucketEntry(index, key, value);
            return;
        }

        var bucket = entries[index];
        for (var entry : bucket) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }

        bucket.addLast(new Entry(key, value));
        size++;
    }

    public String get(int key) {
        var index = hash(key);
        var bucket = entries[index];

        if (bucket != null) {
            for (var entry : bucket) {
                if (entry.key == key)
                    return entry.value;
            }
        }

        return null;
    }

    public void remove(int key) {
        var index = hash(key);
        var bucket = entries[index];

        if (bucket == null)
            throw new IllegalStateException();

        for (var entry : bucket) {
            if (entry.key == key) {
                bucket.remove(entry);
                size--;
                return;
            }
        }
    }

    public int size() {
        return size;
    }

    private void addNewBucketEntry(int index, int key, String value) {
        entries[index] = new LinkedList<Entry>();
        entries[index].addLast(new Entry(key, value));
        size++;
    }

    private int hash(int key) {
        int absKey = -1;
        if (key < 0)
            absKey = Math.abs(key);

        return (absKey >= 0 ? absKey : key) % entries.length;
    }
}
