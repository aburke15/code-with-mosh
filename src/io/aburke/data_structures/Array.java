package io.aburke.data_structures;

public class Array {
    private int[] items;
    private int size;

    public Array(int length) {
        if (length < 0)
            throw new IllegalArgumentException("Initial length must be greater than -1.");

        length = length == 0 ? 1 : length;
        items = new int[length];
        size = 0;
    }

    public void insert(int item) {
        if (isFull())
            resize(size * 2);

        items[size++] = item;
    }

    public void removeAt(int index) {
        if (isInvalidIndex(index))
            throw new IllegalArgumentException("Index is outside the bounds of the array.");

        size--;
        for (int i = index; i < size; i++) {
            items[i] = items[i + 1];
        }

        if (size < (items.length / 4))
            resize(items.length / 2);
    }

    public int indexOf(int item) {
        for (int i = 0; i < size; i++) {
            if (items[i] == item)
                return i;
        }

        return -1;
    }

    public int max() {
        // runtime complexity is O(n) because we have to compare all
        // of the numbers in the array
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++)
            max = Math.max(items[i], max);

        return max;
    }

    public int[] intersect(int[] otherArray) {
        for (int i = 0; i < otherArray.length; i++) {
        }

        return null;
    }

    public void insertAt(int item, int index) {
        if (isInvalidIndex(index))
            throw new IllegalArgumentException("Index is outside the bounds of the array.");

        if (isFull())
            resize(size * 2);

        for (int i = size - 1; i >= index; i--)
            items[i + 1] = items[i];

        items[index] = item;
        size++;
    }

    public int[] reverse() {
        var temp = new int[size];
        var index = 0;

        for (int i = size - 1; i >= 0; i--)
            temp[index++] = items[i];

        return temp;
    }

    public boolean contains(int item) {
        return indexOf(item) > -1;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(items[i]);
        }
    }

    private boolean isInvalidIndex(int index) {
        return index < 0 || index >= size;
    }

    private boolean isFull() {
        return size == items.length;
    }

    private void resize(int length) {
        var temp = new int[length];

        for (int i = 0; i < size; i++)
            temp[i] = items[i];

        items = temp;
    }
}
