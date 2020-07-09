package io.aburke.data_structures;

public class TwoStacks {
    private int[] items;
    private int top1, top2;

    public TwoStacks(int n) {
        items = new int[n];
        top1 = 0;
        top2 = n - 1;
    }

    public void push1(int item) {
        if (isFull1())
            throw new StackOverflowError();

        items[top1++] = item;
    }

    public void push2(int item) {
        if (isFull2())
            throw new StackOverflowError();

        items[top2--] = item;
    }

    public int pop1() {
        return -1; 
    }

    private boolean isFull1() {
        return (top1 > top2);
    }

    private boolean isFull2() {
        return (top1 > top2);
    }
}