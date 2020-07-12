package io.aburke.data_structures;

import java.util.Arrays;
import java.util.Stack;

public class StackQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public StackQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int item) {
        stack1.push(item);
    }

    public int dequeue() {
        return peekOrPop(true);
    }

    public int peek() {
        return peekOrPop(false);
    }

    private int peekOrPop(boolean pop) {
        if (isEmpty())
            throw new IllegalStateException();
        
        if (stack2.empty()) {
            while (!stack1.empty())
                stack2.push(stack1.pop());
        }

        if (pop)
            return stack2.pop();
        else
            return stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.empty() && stack2.empty();
    }

    @Override
    public String toString() {
        return Arrays.toString(stack1.toArray());
    }
}