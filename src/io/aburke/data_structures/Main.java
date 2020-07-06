package io.aburke.data_structures;

public class Main {

    public static void main(String[] args) {
        var stack = new TwoStacks(6);

        stack.push1(10);
        stack.push1(20);
        stack.push2(15);
        stack.push1(30);
    }
}
