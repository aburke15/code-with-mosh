package io.aburke.data_structures;

public class Array {
    private int[] arr;
    private int size;

    public Array(int initialSize) {
        this.arr = new int[initialSize];
        this.size = 0;
    }

    public void insert(int item) {
        if (size == arr.length)
            resize((arr.length == 0 ? 1 : arr.length) * 2);

        arr[size++] = item;
    }

    public void removeAt(int index) {
        if (index > (size - 1) || index < 0)
            throw new IllegalArgumentException("Index is outside the bounds of the array.");

        size--;
        for (int i = index; i < size; i++) {
            arr[i] = arr[i + 1];
        }

        if (size < (arr.length / 4))
            resize(arr.length / 2);
    }

    public int indexOf(int item) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == item)
                return i;
        }

        return -1;
    }

    public int max() {
        // runtime complexity is O(n) because we have to compare all
        // of the numbers in the array
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++)
            max = Math.max(arr[i], max);

        return max;
    }

    public boolean contains(int item) {
        return indexOf(item) > -1;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

    private void resize(int size) {
        var temp = new int[size];
        var length = temp.length > size ? size : temp.length;

        var i  = 0;
        while (i < length) {
            temp[i] = arr[i];
            i++;
        }

        arr = temp;
    }
}
