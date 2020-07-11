package io.aburke.data_structures;

public class MinStack {
    private int[] items;
    private int[] min;
    private int size;

    public MinStack(int size) {
        items = new int[size];
        min = new int[size];
        size = 0;
    }

    public void push(int item) {
        if (isFull())
            throw new StackOverflowError();

        checkForMin(item);

        items[size++] = item;
    }

    public int pop() {
        if (isEmpty())
            throw new IllegalStateException();

        return items[--size];
    }

    public int min() {
        return min[size - 1];
    }

    private void checkForMin(int item) {
        if (size > 0) {
            var previous = min[size - 1];
            if (item > previous) {
                min[size] = previous;
                return; 
            }
        }

        min[size] = item;
    }

    private boolean isFull() {
        return size >= items.length;
    }

    private boolean isEmpty() {
        return size <= 0;
    }
}