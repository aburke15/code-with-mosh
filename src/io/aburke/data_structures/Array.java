package io.aburke.data_structures;

public class Array {
    private int[] arr;
    private int size;

    public Array(int initialSize) {
        this.arr = new int[initialSize];
        this.size = 0;
    }

    // first method is insert an item insert(int item)
    public void insert(int item) {
        // check the array to see if it's at capacity
        if (size == arr.length)
            resize((arr.length == 0 ? 1 : arr.length) * 2);

        arr[size++] = item;
    }

    // remove at index removeAt(int index)
    public void removeAt(int index) {
        // need to shift items in array over, shift everything to the right one over
        // check to see if there is an element at said index
        if (index > (size - 1) || index < 0) return;

        size--;
        for (int i = index; i < size; i++) {
            arr[i] = arr[i + 1];
        }
        // check for resize
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

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

    // private method to resize the array resize(int size)
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
