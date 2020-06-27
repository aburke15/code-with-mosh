package io.aburke.data_structures;

public class DynamicArray<E> {
    private E[] items = (E[]) new Object[2];
    private int size = 0;

    public void insert(E item) {
        if (isFull())
            resize(size * 2);

        items[size++] = item;
    }

    public void remove() {
        if (isEmpty()) return;
    }

    private void resize(int length) {
        var temp = (E[]) new Object[length];
        for (int i = 0; i < size; i++)
            temp[i] = items[i];

        items = temp;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private boolean isFull() {
        return items.length == size;
    }
}