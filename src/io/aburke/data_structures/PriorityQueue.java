package io.aburke.data_structures;

import java.util.Arrays;

public class PriorityQueue {
    private int[] items;
    private int size, first, last;

    public PriorityQueue() {
        items = new int[2];
        size = first = last = 0;
    }

    public void enqueue(int item) {
        if (isFull())
            resize(items.length * 2);

        for (var i = size == 0 ? 0 : size - 1; i >= 0; i--) {
            if (size == 0 || item > items[size - 1]) {
                items[size++] = item;
                return;
            } else if (item < items[i]) {
                items[i + 1] = items[i];
                items[i] = item;
            }
        }

        size++;
    }

    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException();

        return items[--size];
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();

        return items[first == 0 ? 0 : first - 1];
    }

    public boolean isEmpty() {
        return size <= 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }

    private void resize(int length) {
        int[] temp = new int[length];
        for (var i = 0; i < size; i++)
            temp[i] = items[i];

        items = temp;
    }

    private boolean isFull() {
        return size >= items.length;
    }
}