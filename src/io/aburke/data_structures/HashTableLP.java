package io.aburke.data_structures;

public class HashTableLP {
    public class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private Entry[] entries;
    private int size;

    public HashTableLP(int capacity) {
        entries = new Entry[capacity];
        size = 0;
    }

    public void put(int key, String value) {
        if (isFull())
            throw new IllegalStateException();

        var index = getIndexOfEntry(key);
        var entry = entries[index];

        if (entry != null) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }

        createEntry(index, key, value);
    }

    public String get(int key) {
        var index = getIndexOfEntry(key);
        if ((index == -1) || (entries[index] == null))
            return null;

        return entries[index].value;
    }

    public String remove(int key) {
        var index = getIndexOfEntry(key);
        if ((index == -1) || (entries[index] == null))
            return null;

        var value = entries[index].value;
        entries[index] = null;
        --size;

        return value;
    }

    public int size() {
        return size;
    }

    private void createEntry(int index, int key, String value) {
        entries[index] = new Entry(key, value);
        size++;
    }

    private int getIndexOfEntry(int key) {
        var index = -1;
        var end = hash(key) + entries.length;
        for (var i = 0; i < end; i++) {
            index = hash(key + i);
            var entry = entries[index];

            if (entry == null)
                return index;
            if (entry != null) {
                if (entry.key == key)
                    return index;
            }
        }

        return index;
    }

    private boolean isFull() {
        return size == entries.length;
    }

    private int hash(int key) {
        int absKey = key < 0 ? Math.abs(key) : key;

        return absKey % entries.length;
    }
}