package io.aburke.data_structures;

import java.util.Arrays;

public class PriorityQueue {
    private int[] items;
    private int size;

    public PriorityQueue() {
        items = new int[2];
        size = 0;
    }

    public void enqueue(int item) {
        if (isFull())
            resize(items.length * 2);

        if (size == 0 || item > items[size - 1]) {
            items[size++] = item;
            return;
        }

        shiftItemsToInsert(item);
    }

    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException();

        var item = items[--size];
        items[size] = 0;

        if (size > 0 && size == items.length / 4)
            resize(items.length / 2);

        return item;
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();

        return items[size - 1];
    }

    public boolean isEmpty() {
        return size <= 0;
    }

    private boolean isFull() {
        return size >= items.length;
    }

    private void reverseItemsInQueue(int k) {
        
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }

    private void shiftItemsToInsert(int item) {
        for (var i = size == 0 ? 0 : size - 1; i >= 0; i--) {
            if (item < items[i]) {
                items[i + 1] = items[i];
                items[i] = item;
            }
        }

        size++;
    }

    private void resize(int length) {
        int[] temp = new int[length];
        for (int i = 0; i < size; i++) 
            temp[i] = items[i];

        items = temp;
    }
}