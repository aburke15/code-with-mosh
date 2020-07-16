package io.aburke.data_structures;

import java.util.ArrayDeque;
import java.util.Queue;

public class StackWithTwoQueues {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    private int size;

    public StackWithTwoQueues() {
        queue1 = new ArrayDeque<>();
        queue2 = new ArrayDeque<>();
        size = 0;
    }

    public void push(int item) {
        queue1.add(item);
        size++;
    }

    public int pop() {
        if (isEmpty())
            throw new IllegalStateException();

        while (queue1.size() > 1)
            queue2.add(queue1.remove());

        var item = queue1.remove();
        size--;

        var temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return item;
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();

        int i = 0;
        for (var item : queue1) {
            if (i == queue1.size() - 1)
                return item;
            
            i++;
        }

        return -1;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size <= 0;
    }
}