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
        var entry = getEntry(key);
        if (entry != null) {
            entry.value = value;
            return;
        }

        getOrCreateBucket(key).add(new Entry(key, value));
        size++;
    }

    public String get(int key) {
        return getEntry(key) == null ? null : getEntry(key).value;
    }

    public void remove(int key) {
        var entry = getEntry(key);
        if (entry == null)
            throw new IllegalStateException();

        getBucket(key).remove(entry);
        size--;
    }

    public int size() {
        return size;
    }

    private LinkedList<Entry> getBucket(int key) {
        return entries[hash(key)];
    }

    private LinkedList<Entry> getOrCreateBucket(int key) {
        var index = hash(key);
        var bucket = entries[index];

        if (bucket == null)
            bucket = entries[index] = new LinkedList<Entry>();

        return bucket;
    }

    private Entry getEntry(int key) {
        var bucket = getBucket(key);
        if (bucket != null) {
            for (var entry : bucket) {
                if (entry.key == key)
                    return entry;
            }
        }

        return null;
    }

    private int hash(int key) {
        int absKey = -1;
        if (key < 0)
            absKey = Math.abs(key);

        return (absKey >= 0 ? absKey : key) % entries.length;
    }
}