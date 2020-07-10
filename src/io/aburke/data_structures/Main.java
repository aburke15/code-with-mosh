package io.aburke.data_structures;

public class Main {

    public static void main(String[] args) {
        var stack = new TwoStacks(5);

        stack.push2(10);
        stack.push2(20);
        stack.pop1();
    }
}
