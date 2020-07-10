package io.aburke.data_structures;

public class TwoStacks {
    private int[] items;
    private int top1, top2, size1, size2;

    public TwoStacks(int size) {
        items = new int[size];
        top1 = size1 = size2 = 0;
        top2 = size - 1;
    }

    public void push1(int item) {
        if (isFull1())
            throw new StackOverflowError();

        items[top1++] = item;
        size1++;
    }

    public void push2(int item) {
        if (isFull2())
            throw new StackOverflowError();

        items[top2--] = item;
        size2++;
    }

    public int pop1() {
        if (isEmpty1())
            throw new IllegalStateException();

        size1--;
        return items[--top1];
    }

    public int pop2() {
        if (isEmpty2())
            throw new IllegalStateException();

        size2--;
        return items[++top2];
    }

    public boolean isEmpty1() {
        return size1 == 0;
    }

    public boolean isEmpty2() {
        return size2 == 0;
    }

    private boolean isFull1() {
        return (top1 > top2);
    }

    private boolean isFull2() {
        return (top1 > top2);
    }
}