package io.aburke.data_structures;

import java.util.Arrays;

public class ArrayQueue {
    private int[] items;
    private int size, first, last;

    public ArrayQueue(int capacity) {
        items = new int[capacity];
        size = first = last = 0;
    }

    public void enqueue(int item) {
        if (isFull())
            throw new IllegalStateException();

        items[last++] = item;
        size++;

        last = resetPointer(last);
    }

    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException();
        
        var item = items[first];
        items[first++] = 0;
        
        size--;
        first = resetPointer(first);

        return item;
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();
        
        if (first == 0)
            return items[first];

        return items[first - 1];
    }

    public boolean isEmpty() {
        return size <= 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }

    private int resetPointer(int pointer) {
        if (pointer == items.length)
            pointer = 0;

        return pointer;
    }

    private boolean isFull() {
        return size >= items.length;
    }
}