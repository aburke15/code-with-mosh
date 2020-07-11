package io.aburke.data_structures;

public class Main {

    public static void main(String[] args) {
        var stack = new MinStack(5);

        stack.push(10);
        stack.push(2);
        stack.push(4);
        stack.push(5);
        stack.push(1);
        System.out.println(stack.min());
        stack.pop();
        System.out.println(stack.min());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.min());
    }
}
