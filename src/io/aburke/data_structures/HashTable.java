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

        var entry = getEntry(key);        
        if (entry != null && entry.key == key) {
            entry.value = value;
            return;
        }

        getBucket(key).addLast(new Entry(key, value));
        size++;
    }

    public String get(int key)  {
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