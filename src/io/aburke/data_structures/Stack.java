package io.aburke.data_structures;

public class Stack {
    private int [] items;
    private int size = 0;

    public Stack(int size) {
        items = new int[size];
    }

    public void push(int item) {
        if (isFull())
            throw new StackOverflowError();

        items[size++] = item;
    }

    public int pop() {
        if (isEmpty())
            throw new IllegalStateException();

        return items[--size];
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();

        return items[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private boolean isFull() {
        return size == items.length;
    }
}