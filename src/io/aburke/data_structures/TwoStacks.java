package io.aburke.data_structures;

public class TwoStacks {
    class StackItem {
        int item;
        boolean stackOne;

        public StackItem(int item, boolean stackOne) {
            this.item = item;
            this.stackOne = stackOne;
        }
    }

    private StackItem[] items;
    private int size = 0;

    public TwoStacks(int size) {
        items = new StackItem[size];
    }

    public void push1(int item) {
        if (isFull())
            throw new StackOverflowError();

        pushStackItem(item, true);
    }

    public void push2(int item) {
        if (isFull())
            throw new StackOverflowError();
        
        pushStackItem(item, false);
    }

    public int pop1() {

        return -1;
    }

    public int pop2() {
        
        return -1;
    }

    private boolean isFull() {
        return size >= items.length;
    }

    private boolean isEmpty() {
        return size <= 0;
    }

    private void pushStackItem(int item, boolean stackOne) {
        StackItem stackItem = new StackItem(item, stackOne);
        items[size++] = stackItem;
    }
}