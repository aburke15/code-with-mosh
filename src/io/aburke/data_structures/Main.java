package io.aburke.data_structures;

public class Main {

    public static void main(String[] args) {
        var stack = new TwoStacks(5);

        stack.push1(10);
        stack.push1(20);
        stack.push2(50);
        stack.push1(30);
        stack.push2(40);

        stack.push2(60);
    }
}
