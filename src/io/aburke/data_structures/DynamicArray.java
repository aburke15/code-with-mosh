package io.aburke.data_structures;

import java.util.NoSuchElementException;

public class DynamicArray<E> {
    private E[] items = (E[]) new Object[2];
    private int size = 0;

    public void insert(E item) {
        if (isFull())
            resize(items.length * 2);

        items[size++] = item;
    }

    public void insertAt(int index, E item) {
        if (invalidIndex(index))
            throw new IndexOutOfBoundsException();

        if (isFull())
            resize(items.length * 2);

        for (int i = size - 1; i >= index; i--)
            items[i + 1] = items[i];

        items[index] = item;
        size++;
    }

    public void remove() {
        if (isEmpty())
            throw new NoSuchElementException();

        items[--size] = null;

        if (size > 0 && size == items.length / 4)
            resize(items.length / 2);
    }

    public void removeAt(int index) {
        if (invalidIndex(index))
            throw new IndexOutOfBoundsException();

        items[index] = null;
        for (int i = index; i < size; i++)
            items[i] = items[i + 1];

        size--;
    }

    public void reverse() {
        int n = size;
        for (int i = 0; i < n / 2; i++) {
            int lastIndex = n - i - 1;
            E temp = items[i];

            items[i] = items[lastIndex];
            items[lastIndex] = temp;
        }
    }

    public int size() {
        return size;
    }

    private void resize(int length) {
        var temp = (E[]) new Object[length];
        for (int i = 0; i < size; i++)
            temp[i] = items[i];

        items = temp;
    }

    private boolean invalidIndex(int index) {
        return index < 0 || index > items.length - 1;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private boolean isFull() {
        return items.length == size;
    }
}